<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath }/css/bootstrap.min.css" />
<script type="text/javascript"
	src="${pageContext.request.contextPath }/js/jquery-1.7.2.min.js" /></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath }/js/bootstrap.min.js"></script>
<title>病人信息中心</title>
</head>
<body>

<div class="container">                                                                  <!--标题容器-->

    <div class="row">
        <div class="col-sm-1">
            <h1></h1>
        </div>
    </div>
    <div class="row">
        <h1 align="center"><strong><font color="#8b0000">病人注册</font></strong></h1>
    </div>

</div>

<div class="container">                                                                       <!--暴力分行容器-->

    <div class="row">
        <h1 align="center"><strong><font color="#8b0000"></font></strong></h1>
    </div>
    <div class="row">
        <h1 align="center"><strong><font color="#8b0000"></font></strong></h1>
    </div>

</div>

<form class="form-horizontal" role="form" method="post" action="${pageContext.request.contextPath }/register.action">                                    <!--请写上调后的动作action-->
    <div class="form-group">
        <label  class="col-sm-4 control-label">身份证号码</label>
        <div class="col-sm-4">
            <input type="text" class="form-control " name="patientId"
                   placeholder="请输入身份证号码">
        </div>
    </div>

    <div class="form-group">
        <label class="col-sm-4 control-label">密码</label>
        <div class="col-sm-4">
            <input type="password" class="form-control" name="patientPassword"
                   placeholder="请输入密码">
        </div>
    </div>

    <div class="form-group">
        <label class="col-sm-4 control-label">密码确认</label>
        <div class="col-sm-4">
            <input type="password" class="form-control" name="rePassword"
                   placeholder="请再次输入密码">
        </div>
    </div>

    <div class="form-group">
        <label  class="col-sm-4 control-label">姓名</label>
        <div class="col-sm-4">
            <input type="text" class="form-control " name="patientName"
                   placeholder="请输入姓名">
        </div>
    </div>

    <div class="form-group">
        <label  class="col-sm-4 control-label">出生年月</label>
        <div class="col-sm-4">
            <input type="text" class="form-control " name="patientBirthday"
                   placeholder="请输入出生年月 yyyy-mm-dd">
        </div>
    </div>

    <div class="form-group">
        <label  class="col-sm-4 control-label">性别</label>
        <div class="col-sm-4">
            <label class="checkbox-inline">
                <input type="radio" name="patientSex"  value="男" checked>男
            </label>
            <label class="checkbox-inline">
                <input type="radio" name="patientSex"  value="女">女
            </label>
        </div>
    </div>



    <div class="form-group">
        <label  class="col-sm-4 control-label">联系电话</label>
        <div class="col-sm-4">
            <input type="text" class="form-control " name="patientPhone"
                   placeholder="请输入联系电话">
        </div>
    </div>

    <div class="form-group">
        <label  class="col-sm-4 control-label">居住地址</label>
        <div class="col-sm-4">
            <input type="text" class="form-control " name="patientAddress"
                   placeholder="请输入居住地址">
        </div>
    </div>

    <div class="form-group">
        <label  class="col-sm-4 control-label">民族</label>
        <div class="col-sm-4">
            <input type="text" class="form-control " name="patientNation"
                   placeholder="请输入所属国籍">
        </div>
    </div>
    
    
    <div class="row">
    	<div class="col-sm-5"></div>
        <div class="col-sm-1">
            <a href="${pageContext.request.contextPath }/login.action" class="btn btn-primary btn-lg" type="but">返回</a>
        </div>
    
	    <div class="col-sm-1" >
	        <button type="submit" class="btn btn-primary btn-lg ">注册</button>
	    </div>
    </div>
</form>


</body>
</html>