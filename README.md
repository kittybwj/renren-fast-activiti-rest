# renren-fast-activiti-rest
基于renren_fast框架，调用Activiti6 rest api

# 项目说明

* 基于renren-fast框架，调用activiti-rest接口，实现对工作流的各项操作。
* 调用接口的代码在/modules/app/controller/ActivitiController.java中
* 项目启动后可直接在http://localhost:8080/renren-fast/swagger-ui.html#/中调试
* 项目状态：**【更新中】**


# REST API List

**详见官方文档：https://www.activiti.org/userguide/#_rest_api**

<table width="100%">
<tr><th>序号</th><th>REST API  Item</th> <th> Function </th></tr>

<tr><td> 2.1. </td><td>List of Deployments</td><td>Deployments列表 </td> </tr>
<tr><td> 2.2. </td><td>Get a deployment</td><td>获取Deployment </td> </tr>
<tr><td> 2.3. </td><td>Create a new deployment</td><td>创建新的Deployment </td> </tr>
<tr><td> 2.4. </td><td>Delete a deployment</td><td>删除Deployment </td> </tr>
<tr><td> 2.5. </td><td>List resources in a deployment</td><td>列出Deployment中的资源 </td> </tr>
<tr><td> 2.6. </td><td>Get a deployment resource</td><td>获取Deployment资源 </td> </tr>
<tr><td> 2.7. </td><td>Get a deployment resource content</td><td>获取Deployment资源内容 </td> </tr>
</table>

Process Definitions 
--- 

<table width="100%">
<tr><th>序号</th><th>REST API  Item</th> <th> Function </th></tr>

<tr><td> 3.1. </td><td>List of process definitions</td><td>流程定义列表 </td> </tr>
<tr><td> 3.2. </td><td>Get a process definition</td><td>获取流程定义 </td> </tr>
<tr><td> 3.3. </td><td>Update category for a process definition</td><td>流程定义的更新类别 </td> </tr>
<tr><td> 3.4. </td><td>Get a process definition resource content</td><td>获取进程定义资源内容 </td> </tr>
<tr><td> 3.5. </td><td>Get a process definition BPMN model</td><td>获取进程定义 BPMN 模型 </td> </tr>
<tr><td> 3.6. </td><td>Suspend a process definition</td><td>暂停进程定义 </td> </tr>
<tr><td> 3.7. </td><td>Activate a process definition</td><td>激活流程定义 </td> </tr>
<tr><td> 3.8. </td><td>Get all candidate starters for a process-definition</td><td>获得所有候选者的过程 </td> </tr>
<tr><td> 3.9. </td><td>Add a candidate starter to a process definition</td><td>在流程定义中添加候选启动器 </td> </tr>
<tr><td> 3.10. </td><td>Delete a candidate starter from a process definition</td><td>从进程定义中删除候选启动器 </td> </tr>
<tr><td> 3.11. </td><td>Get a candidate starter from a process definition</td><td>从流程定义中获取候选起始项 </td> </tr>
</table>

Models 
--- 

<table width="100%">
<tr><th>序号</th><th>REST API  Item</th> <th> Function </th></tr>

<tr><td> 4.1. </td><td>Get a list of models</td><td>获取模型列表 </td> </tr>
<tr><td> 4.2. </td><td>Get a model</td><td>获取模型 </td> </tr>
<tr><td> 4.3. </td><td>Update a model</td><td>更新模型 </td> </tr>
<tr><td> 4.4. </td><td>Create a model</td><td>创建模型 </td> </tr>
<tr><td> 4.5. </td><td>Delete a model</td><td>删除模型 </td> </tr>
<tr><td> 4.6. </td><td>Get the editor source for a model</td><td>获取模型的编辑器源 </td> </tr>
<tr><td> 4.7. </td><td>Set the editor source for a model</td><td>为模型设置编辑器源 </td> </tr>
<tr><td> 4.8. </td><td>Get the extra editor source for a model</td><td>获取模型的额外编辑器源 </td> </tr>
<tr><td> 4.9. </td><td>Set the extra editor source for a model</td><td>为模型设置额外的编辑器源 </td> </tr>
</table>

Process Instances 
--- 

<table width="100%">
<tr><th>序号</th><th>REST API  Item</th> <th> Function </th></tr>

<tr><td> 5.1. </td><td>Get a process instance</td><td>获取流程实例 </td> </tr>
<tr><td> 5.2. </td><td>Delete a process instance</td><td>删除流程实例 </td> </tr>
<tr><td> 5.3. </td><td>Activate or suspend a process instance</td><td>激活或挂起流程实例 </td> </tr>
<tr><td> 5.4. </td><td>Start a process instance</td><td>启动流程实例 </td> </tr>
<tr><td> 5.5. </td><td>List of process instances</td><td>流程实例列表 </td> </tr>
<tr><td> 5.6. </td><td>Query process instances</td><td>查询流程实例 </td> </tr>
<tr><td> 5.7. </td><td>Get diagram for a process instance</td><td>获取流程实例的关系图 </td> </tr>
<tr><td> 5.8. </td><td>Get involved people for process instance</td><td>参与流程实例的人员 </td> </tr>
<tr><td> 5.9. </td><td>Add an involved user to a process instance</td><td>将涉及的用户添加到流程实例 </td> </tr>
<tr><td> 5.10. </td><td>Remove an involved user to from process instance</td><td>将涉及的用户从流程实例中删除 </td> </tr>
<tr><td> 5.11. </td><td>List of variables for a process instance</td><td>流程实例的变量列表 </td> </tr>
<tr><td> 5.12. </td><td>Get a variable for a process instance</td><td>获取流程实例的变量 </td> </tr>
<tr><td> 5.13. </td><td>Create (or update) variables on a process instance</td><td>创建 </td> </tr>
<tr><td> 5.14. </td><td>Update a single variable on a process instance</td><td>更新流程实例上的单个变量 </td> </tr>
<tr><td> 5.15. </td><td>Create a new binary variable on a process-instance</td><td>在进程上创建新的二进制变量 </td> </tr>
<tr><td> 5.16. </td><td>Update an existing binary variable on a process-instance</td><td>更新进程中的现有二进制变量 </td> </tr>
</table>

Executions 
--- 

<table width="100%">
<tr><th>序号</th><th>REST API  Item</th> <th> Function </th></tr>

<tr><td> 6.1. </td><td>Get an execution</td><td>获得Execution </td> </tr>
<tr><td> 6.2. </td><td>Execute an action on an execution</td><td>在Execution上执行操作 </td> </tr>
<tr><td> 6.3. </td><td>Get active activities in an execution</td><td>在执行过程中获取活动 </td> </tr>
<tr><td> 6.4. </td><td>List of executions</td><td>Execution列表 </td> </tr>
<tr><td> 6.5. </td><td>Query executions</td><td>查询执行 </td> </tr>
<tr><td> 6.6. </td><td>List of variables for an execution</td><td>执行变量列表 </td> </tr>
<tr><td> 6.7. </td><td>Get a variable for an execution</td><td>获取用于执行的变量 </td> </tr>
<tr><td> 6.8. </td><td>Create (or update) variables on an execution</td><td>创建 </td> </tr>
<tr><td> 6.9. </td><td>Update a variable on an execution</td><td>更新Execution中的变量 </td> </tr>
<tr><td> 6.10. </td><td>Create a new binary variable on an execution</td><td>在Execution中创建新的二进制变量 </td> </tr>
<tr><td> 6.11. </td><td>Update an existing binary variable on a process-instance</td><td>更新Process-instance中的现有二进制变量 </td> </tr>
</table>

Tasks 
--- 

<table width="100%">
<tr><th>序号</th><th>REST API  Item</th> <th> Function </th></tr>

<tr><td> 7.1. </td><td>Get a task</td><td>获取任务 </td> </tr>
<tr><td> 7.2. </td><td>List of tasks</td><td>任务清单 </td> </tr>
<tr><td> 7.3. </td><td>Query for tasks</td><td>查询任务 </td> </tr>
<tr><td> 7.4. </td><td>Update a task</td><td>更新任务 </td> </tr>
<tr><td> 7.5. </td><td>Task actions</td><td>任务行动 </td> </tr>
<tr><td> 7.6. </td><td>Delete a task</td><td>删除任务 </td> </tr>
<tr><td> 7.7. </td><td>Get all variables for a task</td><td>获取任务的所有变量 </td> </tr>
<tr><td> 7.8. </td><td>Get a variable from a task</td><td>从任务中获取变量 </td> </tr>
<tr><td> 7.9. </td><td>Get the binary data for a variable</td><td>获取变量的二进制数据 </td> </tr>
<tr><td> 7.10. </td><td>Create new variables on a task</td><td>在任务上创建新变量 </td> </tr>
<tr><td> 7.11. </td><td>Create a new binary variable on a task</td><td>在任务上创建新的二进制变量 </td> </tr>
<tr><td> 7.12. </td><td>Update an existing variable on a task</td><td>更新任务的现有变量 </td> </tr>
<tr><td> 7.13. </td><td>Updating a binary variable on a task</td><td>更新任务的二进制变量 </td> </tr>
<tr><td> 7.14. </td><td>Delete a variable on a task</td><td>删除任务上的变量 </td> </tr>
<tr><td> 7.15. </td><td>Delete all local variables on a task</td><td>删除任务中的所有局部变量 </td> </tr>
<tr><td> 7.16. </td><td>Get all identity links for a task</td><td>获取任务的所有标识链接 </td> </tr>
<tr><td> 7.17. </td><td>Get all identitylinks for a task for either groups or users</td><td>为组或用户获取任务的所有 identitylinks </td> </tr>
<tr><td> 7.18. </td><td>Get a single identity link on a task</td><td>在任务上获取单个标识链接 </td> </tr>
<tr><td> 7.19. </td><td>Create an identity link on a task</td><td>在任务上创建标识链接 </td> </tr>
<tr><td> 7.20. </td><td>Delete an identity link on a task</td><td>删除任务上的标识链接 </td> </tr>
<tr><td> 7.21. </td><td>Create a new comment on a task</td><td>创建新的任务注释 </td> </tr>
<tr><td> 7.22. </td><td>Get all comments on a task</td><td>获取任务的所有注释 </td> </tr>
<tr><td> 7.23. </td><td>Get a comment on a task</td><td>获取任务的注释 </td> </tr>
<tr><td> 7.24. </td><td>Delete a comment on a task</td><td>删除任务的注释 </td> </tr>
<tr><td> 7.25. </td><td>Get all events for a task</td><td>获取任务的所有事件 </td> </tr>
<tr><td> 7.26. </td><td>Get an event on a task</td><td>在任务中获取事件 </td> </tr>
<tr><td> 7.27. </td><td>Create a new attachment on a task, containing a link to an external resource</td><td>在任务上创建新附件, 包含指向外部资源的链接 </td> </tr>
<tr><td> 7.28. </td><td>Create a new attachment on a task, with an attached file</td><td>使用附加文件在任务上创建新附件 </td> </tr>
<tr><td> 7.29. </td><td>Get all attachments on a task</td><td>获取任务的所有附件 </td> </tr>
<tr><td> 7.30. </td><td>Get an attachment on a task</td><td>获取任务的附件 </td> </tr>
<tr><td> 7.31. </td><td>Get the content for an attachment</td><td>获取附件的内容 </td> </tr>
<tr><td> 7.32. </td><td>Delete an attachment on a task</td><td>删除任务的附件 </td> </tr>
</table>

History 
--- 

<table width="100%">
<tr><th>序号</th><th>REST API  Item</th> <th> Function </th></tr>

<tr><td> 8.1. </td><td>Get a historic process instance</td><td>获取历史过程实例 </td> </tr>
<tr><td> 8.2. </td><td>List of historic process instances</td><td>历史进程实例列表 </td> </tr>
<tr><td> 8.3. </td><td>Query for historic process instances</td><td>查询历史进程实例 </td> </tr>
<tr><td> 8.4. </td><td>Delete a historic process instance</td><td>删除历史进程实例 </td> </tr>
<tr><td> 8.5. </td><td>Get the identity links of a historic process instance</td><td>获取历史进程实例的标识链接 </td> </tr>
<tr><td> 8.6. </td><td>Get the binary data for a historic process instance variable</td><td>获取历史进程实例变量的二进制数据 </td> </tr>
<tr><td> 8.7. </td><td>Create a new comment on a historic process instance</td><td>创建一个历史进程实例的新注释 </td> </tr>
<tr><td> 8.8. </td><td>Get all comments on a historic process instance</td><td>获取历史过程实例的所有注释 </td> </tr>
<tr><td> 8.9. </td><td>Get a comment on a historic process instance</td><td>获取一个历史过程实例的注释 </td> </tr>
<tr><td> 8.10. </td><td>Delete a comment on a historic process instance</td><td>删除历史进程实例的注释 </td> </tr>
<tr><td> 8.11. </td><td>Get a single historic task instance</td><td>获取单个历史任务实例 </td> </tr>
<tr><td> 8.12. </td><td>Get historic task instances</td><td>获取历史任务实例 </td> </tr>
<tr><td> 8.13. </td><td>Query for historic task instances</td><td>查询历史任务实例 </td> </tr>
<tr><td> 8.14. </td><td>Delete a historic task instance</td><td>删除历史任务实例 </td> </tr>
<tr><td> 8.15. </td><td>Get the identity links of a historic task instance</td><td>获取历史任务实例的标识链接 </td> </tr>
<tr><td> 8.16. </td><td>Get the binary data for a historic task instance variable</td><td>获取历史任务实例变量的二进制数据 </td> </tr>
<tr><td> 8.17. </td><td>Get historic activity instances</td><td>获取历史活动实例 </td> </tr>
<tr><td> 8.18. </td><td>Query for historic activity instances</td><td>查询历史活动实例 </td> </tr>
<tr><td> 8.19. </td><td>List of historic variable instances</td><td>历史变量实例列表 </td> </tr>
<tr><td> 8.20. </td><td>Query for historic variable instances</td><td>查询历史变量实例 </td> </tr>
<tr><td> 8.21. </td><td>Get historic detail</td><td>获取历史细节 </td> </tr>
<tr><td> 8.22. </td><td>Query for historic details</td><td>查询历史细节 </td> </tr>
<tr><td> 8.23. </td><td>Get the binary data for a historic detail variable</td><td>获取历史细节变量的二进制数据 </td> </tr>
</table>

Forms 
--- 

<table width="100%">
<tr><th>序号</th><th>REST API  Item</th> <th> Function </th></tr>

<tr><td> 9.1. </td><td>Get form data</td><td>获取表单数据 </td> </tr>
<tr><td> 9.2. </td><td>Submit task form data</td><td>提交任务表单数据 </td> </tr>
</table>

Database tables 
--- 

<table width="100%">
<tr><th>序号</th><th>REST API  Item</th> <th> Function </th></tr>

<tr><td> 10.1. </td><td>List of tables</td><td>表格一览表 </td> </tr>
<tr><td> 10.2. </td><td>Get a single table</td><td>获取单个表 </td> </tr>
<tr><td> 10.3. </td><td>Get column info for a single table</td><td>获取单个表的列信息 </td> </tr>
<tr><td> 10.4. </td><td>Get row data for a single table</td><td>获取单个表的行数据 </td> </tr>
</table>

Engine 
--- 

<table width="100%">
<tr><th>序号</th><th>REST API  Item</th> <th> Function </th></tr>

<tr><td> 11.1. </td><td>Get engine properties</td><td>获取引擎属性 </td> </tr>
<tr><td> 11.2. </td><td>Get engine info</td><td>获取引擎信息 </td> </tr>
</table>

Runtime 
--- 

<table width="100%">
<tr><th>序号</th><th>REST API  Item</th> <th> Function </th></tr>

<tr><td> 12.1. </td><td>Signal event received</td><td>收到的信号事件 </td> </tr>
</table>

Jobs 
--- 

<table width="100%">
<tr><th>序号</th><th>REST API  Item</th> <th> Function </th></tr>

<tr><td> 13.1. </td><td>Get a single job</td><td>获得一份单独的工作 </td> </tr>
<tr><td> 13.2. </td><td>Delete a job</td><td>删除作业 </td> </tr>
<tr><td> 13.3. </td><td>Execute a single job</td><td>执行单个作业 </td> </tr>
<tr><td> 13.4. </td><td>Get the exception stacktrace for a job</td><td>获取作业的异常堆栈 </td> </tr>
<tr><td> 13.5. </td><td>Get a list of jobs</td><td>获取工作列表 </td> </tr>
</table>

Users 
--- 

<table width="100%">
<tr><th>序号</th><th>REST API  Item</th> <th> Function </th></tr>

<tr><td> 14.1. </td><td>Get a single user</td><td>获取单个用户 </td> </tr>
<tr><td> 14.2. </td><td>Get a list of users</td><td>获取用户列表 </td> </tr>
<tr><td> 14.3. </td><td>Update a user</td><td>更新用户 </td> </tr>
<tr><td> 14.4. </td><td>Create a user</td><td>创建用户 </td> </tr>
<tr><td> 14.5. </td><td>Delete a user</td><td>删除用户 </td> </tr>
<tr><td> 14.6. </td><td>Get a user’s picture</td><td>获取用户的图片 </td> </tr>
<tr><td> 14.7. </td><td>Updating a user’s picture</td><td>更新用户图片 </td> </tr>
<tr><td> 14.8. </td><td>List a user’s info</td><td>列出用户信息 </td> </tr>
<tr><td> 14.9. </td><td>Get a user’s info</td><td>获取用户信息 </td> </tr>
<tr><td> 14.10. </td><td>Update a user’s info</td><td>更新用户信息 </td> </tr>
<tr><td> 14.11. </td><td>Create a new user’s info entry</td><td>创建新用户的信息条目 </td> </tr>
<tr><td> 14.12. </td><td>Delete a user’s info</td><td>删除用户信息 </td> </tr>
</table>

Groups 
--- 

<table width="100%">
<tr><th>序号</th><th>REST API  Item</th> <th> Function </th></tr>

<tr><td> 15.1. </td><td>Get a single group</td><td>获取单个组 </td> </tr>
<tr><td> 15.2. </td><td>Get a list of groups</td><td>获取组列表 </td> </tr>
<tr><td> 15.3. </td><td>Update a group</td><td>更新组 </td> </tr>
<tr><td> 15.4. </td><td>Create a group</td><td>创建组 </td> </tr>
<tr><td> 15.5. </td><td>Delete a group</td><td>删除组 </td> </tr>
<tr><td> 15.6. </td><td>Get members in a group</td><td>获取组中的成员 </td> </tr>
<tr><td> 15.7. </td><td>Add a member to a group</td><td>向组中添加成员 </td> </tr>
<tr><td> 15.8. </td><td>Delete a member from a group</td><td>从组中删除成员 </td> </tr>
</table>


# renren-fast框架说明（取自官方）

**项目说明** 
- renren-fast是一个轻量级的，前后端分离的Java快速开发平台，能快速开发项目并交付【接私活利器】
- 支持MySQL、Oracle、SQL Server、PostgreSQL等主流数据库
- 前端地址：https://gitee.com/renrenio/renren-fast-vue
<br> 
<br>
 

**具有如下特点** 
- 友好的代码结构及注释，便于阅读及二次开发
- 实现前后端分离，通过token进行数据交互，前端再也不用关注后端技术
- 灵活的权限控制，可控制到页面或按钮，满足绝大部分的权限需求
- 页面交互使用Vue2.x，极大的提高了开发效率
- 完善的代码生成机制，可在线生成entity、xml、dao、service、vue、sql代码，减少70%以上的开发任务
- 引入quartz定时任务，可动态完成任务的添加、修改、删除、暂停、恢复及日志查看等功能
- 引入API模板，根据token作为登录令牌，极大的方便了APP接口开发
- 引入Hibernate Validator校验框架，轻松实现后端校验
- 引入云存储服务，已支持：七牛云、阿里云、腾讯云等
- 引入swagger文档支持，方便编写API接口文档
<br> 

**项目结构** 
```
renren-fast
├─db  项目SQL语句
│
├─common 公共模块
│  ├─aspect 系统日志
│  ├─exception 异常处理
│  ├─validator 后台校验
│  └─xss XSS过滤
│ 
├─config 配置信息
│ 
├─modules 功能模块
│  ├─app API接口模块(APP调用)
│  ├─job 定时任务模块
│  ├─oss 文件服务模块
│  └─sys 权限模块
│ 
├─RenrenApplication 项目启动类
│  
├──resources 
│  ├─mapper SQL对应的XML文件
│  └─static 静态资源

```
<br> 

**如何交流、反馈、参与贡献？** 
- 开发文档：https://www.renren.io/guide
- Git仓库：https://gitee.com/renrenio/renren-fast
- [人人开源社区](https://www.renren.io/community)：https://www.renren.io/community
- 官方QQ群：324780204、145799952
- 技术讨论、二次开发等咨询、问题和建议，请移步到人人开源社区，我会在第一时间进行解答和回复！
- 如需关注项目最新动态，请Watch、Star项目，同时也是对项目最好的支持
- 微信扫码并关注【人人开源】，获得项目最新动态及更新提醒<br>
![输入图片说明](http://cdn.renren.io/47c26201804031918312618.jpg "在这里输入图片标题")
<br> 


**技术选型：** 
- 核心框架：Spring Boot 2.0
- 安全框架：Apache Shiro 1.4
- 视图框架：Spring MVC 5.0
- 持久层框架：MyBatis 3.3
- 定时器：Quartz 2.3
- 数据库连接池：Druid 1.0
- 日志管理：SLF4J 1.7、Log4j
- 页面交互：Vue2.x 
<br> 


 **后端部署**
- 通过git下载源码
- 创建数据库renren_fast，数据库编码为UTF-8
- 执行db/mysql.sql文件，初始化数据
- 修改application-dev.yml，更新MySQL账号和密码
- Eclipse、IDEA运行RenrenApplication.java，则可启动项目
- Swagger路径：http://localhost:8080/renren-fast/swagger/index.html

<br> 

 **前端部署**
 - 本项目是前后端分离的，还需要部署前端，才能运行起来
 - 前端下载地址：https://gitee.com/renrenio/renren-fast-vue
 - 前端部署文档：https://gitee.com/renrenio/renren-fast-vue/wikis/Home
 - 前端部署完毕，就可以访问项目了，账号：admin，密码：admin
 
 <br>

 **项目演示**
- 演示地址：http://fast.demo.renren.io
- 账号密码：admin/admin
<br> 
**接口文档效果图：**
![输入图片说明](https://images.gitee.com/uploads/images/2018/0728/145341_73ba6f75_63154.jpeg "在这里输入图片标题")
<br> <br> <br> 


**效果图：**
![输入图片说明](https://gitee.com/uploads/images/2018/0505/173115_d3c045ef_63154.jpeg "在这里输入图片标题")
![输入图片说明](https://gitee.com/uploads/images/2018/0624/225728_b06f72b3_63154.jpeg "在这里输入图片标题")
![输入图片说明](https://gitee.com/uploads/images/2018/0505/173140_79928d91_63154.jpeg "在这里输入图片标题")
![输入图片说明](https://gitee.com/uploads/images/2018/0505/173151_12d065db_63154.jpeg "在这里输入图片标题")

<br>
