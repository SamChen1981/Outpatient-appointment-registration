# 门诊预约挂号系统

这是课程实训所做的项目，要求实现基本功能。

小组成员:hxiaope&runhui&canhui


## 主要框架 

* mybatis 逆向工程生成pojo和mapper接口以及mapper.xml
* spring 接管bean和代理事务
* springmvc 用于表现层

## 实现功能

### 病人部分 

* 病人登录
* 病人注册
* 病人修改资料
* 登录退出
* 查询预约情况
* 预约
* 撤销预约信息
* 查看公告

### 工作人员部分

* 挂号
* 处理今日预约信息
* 退号
* 发布公告
* 查看公告
* 登录退出


## 今日所学

#### (11-09)

视频教学中Service的实现类要在applicationContext-service.xml中配置bean，
现在的知可以在springmvc.xml中配置

    <context:component-scan base-package="ServiceIterfacePackage" />

扫描Service包，需要的仅仅是在Service接口的实现类开始加一个注解

"@Service("ServiceIterfaceName")"这样就可以省略applicationContext-service.xml
这个文件

#### (11-10)

所做皆为复习内容

#### (11/11-11/22)

一直在复习之前所学，期间也学习到了使用ajax异步请求，一些jquery的使用以及javascript的编写经验。

## 不足之处

整个系统还是很简陋，有些业务流程也没有搞清楚导致功能都是自己想象的，预约部分的细节没有做好，预约时间

是一整天，不过能用上所学的内容去实现自己想要的功能成就感还是很多的。另外有一个很不好的习惯就是自己写

代码没有写注释的，导致后来自己都不知道是什么东西。




