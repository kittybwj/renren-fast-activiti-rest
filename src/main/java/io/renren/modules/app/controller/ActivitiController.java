package io.renren.modules.app.controller;


import io.renren.common.exception.RRException;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.support.BasicAuthorizationInterceptor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;

/**
 * activiti-rest接口测试
 *
 * @author kitty.bi
 * @email 530174071@qq.com
 * @date 2019-01-09 15:47
 */
@RestController
@RequestMapping("/app")
@Api("activiti-rest接口测试")
public class ActivitiController {

    @Autowired
    private RestTemplate restTemplate;
    private String username;
    private String password;

    private ActivitiController(){
        this.username = "kermit";
        this.password = "kermit";
    }

    /**
     * 用户鉴权
     */
    private void authorize(String url){
        restTemplate.getInterceptors().add(new BasicAuthorizationInterceptor(this.username, this.password));
        restTemplate.getForObject(url, String.class);
    }

    /**
     * get接口
     */
    @GetMapping("/testGetApi")
    @ApiOperation("HTTP GET method")
    public String getJson(String url){
        //用户鉴权
        authorize(url);
        ResponseEntity<String> results = restTemplate.exchange(url, HttpMethod.GET, null, String.class);
        String json = results.getBody();
        return json;
    }

    /**
     * post接口
     */
    @PostMapping(value = "/testPostApi")
    @ApiOperation("HTTP POST method")
    public Object testPost(String url,JSONObject postData) {
        //用户鉴权
        authorize(url);
        JSONObject json = restTemplate.postForEntity(url, postData, JSONObject.class).getBody();
        return json;
    }

    /**
     * 获取单个用户信息
     */
    @GetMapping("getUser")
    @ApiOperation("获取单个用户信息")
    public String getUser(String userId){
        String url="http://localhost:8080/activiti-rest/service/identity/users/"+userId;
        String result = getJson(url);
        return result;
    }

    /**
     * 获取用户信息列表
     */
    @GetMapping("getUserList")
    @ApiOperation("获取用户信息列表")
    public String getUserList(){
        String url="http://localhost:8080/activiti-rest/service/identity/users";
        String result = getJson(url);
        return result;
    }

    /**
     * 创建用户
     * 说明：当平台新增用户时，应在activiti中同步创建用户
     */
    @PostMapping("addUser")
    @ApiOperation("创建用户")
    public Object addUser(){
        String url="http://localhost:8080/activiti-rest/service/identity/users";
        JSONObject postData = new JSONObject();
        postData.put("id", "kini");
        postData.put("firstName", "Bi");
        postData.put("lastName", "kini");
        postData.put("email", "kini@126.com");
        postData.put("password", "123456");
        Object json = testPost(url,postData);
        return json;
    }

    /**
     * 创建组
     * 说明：当平台新增角色时，应在activiti中同步创建group
     */
    @PostMapping("addGroup")
    @ApiOperation("创建组")
    public Object addGroup(){
        String url="http://localhost:8080/activiti-rest/service/identity/groups";
        JSONObject postData = new JSONObject();
        postData.put("id", "test_group");
        postData.put("name", "Test group");
        postData.put("type", "Test type");
        Object json = testPost(url,postData);
        return json;
    }

    /**
     * 获取已发布的所以流程
     */
    @GetMapping("getProcessList")
    @ApiOperation("获取流程列表")
    public String getProcessList(){
        String url="http://localhost:8080/activiti-rest/service/repository/process-definitions";
        String result = getJson(url);
        return result;
    }

    /**
     * 根据流程id启动流程
     */
    @PostMapping("startProcessesById")
    @ApiOperation("启动流程")
    public Object startProcessesById(String processId){
        String url="http://localhost:8080/activiti-rest/service/runtime/process-instances";
        JSONObject postData = new JSONObject();
        postData.put("processDefinitionId", processId);
        Object json = testPost(url,postData);
        return json;
    }

    /**
     * 根据流程key启动流程
     * 说明：若经过多次部署，一个key会对应多个版本的process，此处取最新版本的process
     */
    @PostMapping("startProcessesByKey")
    @ApiOperation("启动流程（通过Key，名字相同执行最新版本的流程）")
    public Object startProcessesByKey(String processKey){
        String processId = getNewProcessesDefinition(processKey);
        Object json = startProcessesById(processId);
        return json;
    }

    /**
     * 获取同一个流程key的最新版本(返回流程id)
     */
    @GetMapping("getNewProcessesDefinition")
    @ApiOperation("获取同一个流程的最新版本(返回流程id)")
    public String getNewProcessesDefinition(String processKey){
        String url="http://localhost:8080/activiti-rest/service/repository/process-definitions?key="+processKey;
        String result = getJson(url);
        JSONObject resultObject = JSONObject.fromObject(result);
        JSONArray resultArray = resultObject.getJSONArray("data");
        JSONObject firstVersion = JSONObject.fromObject(resultArray.get(0));
        String newVersion = firstVersion.getString("version");
        String newId =firstVersion.getString("id");
        for (int i = 1; i < resultArray.size(); i++) {
            JSONObject object = JSONObject.fromObject(resultArray.get(i));

            if (Integer.parseInt(object.getString("version"))>Integer.parseInt(newVersion)){
                newVersion = object.getString("version");
                newId = object.getString("id");
            }
        }
        return newId;
    }

    /**
     * 获取流程图片
     */
    @GetMapping("getProcessImage")
    @ApiOperation("获取流程图片")
    public String getProcessImage(String processId){
        String url="http://localhost:8080/activiti-rest/service/repository/process-definitions/"+processId+"/image";
        String result = getJson(url);
        return result;
    }

    /**
     * 获取任务列表
     * assignee:直接指派给用户
     * candidateUser:用户需要先进行claim（认领），再执行
     */
    @GetMapping("getTaskList")
    @ApiOperation("获取任务列表")
    public String getTaskList(String assignee,String candidateUser){
        String url="http://localhost:8080/activiti-rest/service/runtime/tasks";
        if (assignee != null && assignee !="")
            url = url+"?assignee="+assignee;
        if (candidateUser != null && candidateUser !="")
            url = url+"?candidateUser="+candidateUser;
        String result = getJson(url);
        return result;
    }

    /**
     * 完成任务
     * taskId:任务id
     * variableArray:variables property
     */
    @PostMapping("completeTask")
    @ApiOperation("完成任务")
    public Object completeTask(String taskId, ArrayList variableArray){
        //taskId必填
        if (taskId == null && taskId =="")
            throw new RRException("格式错误");
        String url="http://localhost:8080/activiti-rest/service/runtime/tasks/"+taskId;
        JSONObject postData = new JSONObject();
        postData.put("action", "complete");
        postData.put("variables", variableArray);
        Object json = testPost(url,postData);
        return json;
    }

    /**
     * 认领任务
     * taskId:任务id
     * assignee:认领人
     */
    @PostMapping("claimTask")
    @ApiOperation("认领任务")
    public Object claimTask(String taskId,String assignee){
        //taskId必填
        if (taskId == null && taskId =="")
            throw new RRException("格式错误");
        String url="http://localhost:8080/activiti-rest/service/runtime/tasks/"+taskId;
        JSONObject postData = new JSONObject();
        postData.put("action", "claim");
        postData.put("assignee", assignee);
        Object json = testPost(url,postData);
        return json;
    }

    /**
     * 指派任务
     * taskId:任务id
     * assignee:指派人
     */
    @PostMapping("delegateTask")
    @ApiOperation("指派任务")
    public Object delegateTask(String taskId,String assignee){
        //taskId必填
        if (taskId == null && taskId =="")
            throw new RRException("格式错误");
        String url="http://localhost:8080/activiti-rest/service/runtime/tasks/"+taskId;
        JSONObject postData = new JSONObject();
        postData.put("action", "delegate");
        postData.put("assignee", assignee);
        Object json = testPost(url,postData);
        return json;
    }

    /**
     * 暂停任务
     * taskId:任务id
     */
    @PostMapping("resolveAction")
    @ApiOperation("暂停任务")
    public Object resolveAction(String taskId){
        //taskId必填
        if (taskId == null && taskId =="")
            throw new RRException("格式错误");
        String url="http://localhost:8080/activiti-rest/service/runtime/tasks/"+taskId;
        JSONObject postData = new JSONObject();
        postData.put("action", "resolve");
        Object json = testPost(url,postData);
        return json;
    }

    /**
     * 给任务新增备注
     * taskId:任务id
     */
    @PostMapping("addComment")
    @ApiOperation("给任务新增备注")
    public Object addComment(String taskId,String comment){
        String url="http://localhost:8080/activiti-rest/service/runtime/tasks/"+taskId+"/comments";
        JSONObject postData = new JSONObject();
        postData.put("message", comment);
        //Parameter saveProcessInstanceId is optional, if true save process instance id of task with comment.
        postData.put("saveProcessInstanceId", true);
        Object json = testPost(url,postData);
        return json;
    }

    /**
     * 获取一个任务的所有comments
     */
    @GetMapping("getCommentsList")
    @ApiOperation("获取一个任务的所有comments")
    public String getCommentsList(String taskId){
        String url="http://localhost:8080/activiti-rest/service/runtime/tasks/"+taskId+"/comments";
        String result = getJson(url);
        return result;
    }

    /**
     * 获取一个流程实例的历史记录
     */
    @GetMapping("getHistoricProcess")
    @ApiOperation("获取一个流程实例的历史记录")
    public String getHistoricProcess(String processInstanceId){
        String url="http://localhost:8080/activiti-rest/service/history/historic-process-instances/"+processInstanceId;
        String result = getJson(url);
        return result;
    }

    /**
     * 获取流程记录列表（可添加筛选参数）
     */
    @GetMapping("getHistoricProcessList")
    @ApiOperation("获取流程记录")
    public String getHistoricProcessList(){
        String url="http://localhost:8080/activiti-rest/service/history/historic-process-instances";
        String result = getJson(url);
        return result;
    }



}
