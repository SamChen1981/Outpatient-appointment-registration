# 门诊预约挂号系统

这是课程实训所做的项目，要求实现基本功能。

小组成员:hxiaope&runhui&canhui


## 主要框架 

* mybatis 逆向工程生成pojo和mapper接口以及mapper.xml
* spring 接管bean和代理事务
* springmvc 用于表现层

## 实现功能(暂时)

* 病人登录
* 病人注册
* 病人修改资料
* 登录退出
* 查询预约情况

## 今日所学

#### (11-09)

视频教学中Service的实现类要在applicationContext-service.xml中配置bean，
现在的知可以在springmvc.xml中配置<mvc:annotion-scan package=""/>
扫描Service包，需要的仅仅是在Service接口的实现类开始加
一个注解"@Service("ServiceIterfaceName")"这样就可以省略applicationContext-service.xml
这个文件

#### (11-10)

所做皆为复习内容







