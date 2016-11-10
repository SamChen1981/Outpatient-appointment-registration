<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>挂号预约系统登录</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath }/css/bootstrap.min.css" />
<script type="text/javascript"
	src="${pageContext.request.contextPath }/js/jquery-1.7.2.min.js" /></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath }/js/bootstrap.min.js"></script>
	
<style type="text/css">
.form-control {
	width: 50%;
}
</style>
<script type="text/javascript">
	function login(){
		var sel=document.getElementById("select1");
  		if(sel.value==1){
			document.loginForm.action="${pageContext.request.contextPath }/loginPatient.action";
			document.loginForm.submit();
		}
		if(sel.value==2){
			document.loginForm.action="${pageContext.request.contextPath }/loginStaff.action";
			document.loginForm.submit();
		} 
	}
</script>

</head>
<body>

<div class="container">                                                                  <!--标题容器-->

    <div class="row">                                                                     <!--暴力分行容器-->
        <div class="col-sm-1">
            <h1 align="center"><strong><font color="#8b0000"></font></strong></h1>
        </div>
    </div>
    <div class="row">
        <h1 align="center"><strong><font color="#8b0000">挂号系统登录</font></strong></h1>
    </div>

</div>

<div class="container">                                                                       <!--暴力分行容器-->

    <div class="row">
        <h1 align="center"><strong><font color="#8b0000"></font></strong></h1>
    </div>
    <div class="row">
        <h1 align="center"><strong><font color="#8b0000"></font></strong></h1>
    </div>
    <div class="row">
        <h1 align="center"><strong><font color="#8b0000"></font></strong></h1>
    </div>
    <div class="row">
        <h1 align="center"><strong><font color="#8b0000"></font></strong></h1>
    </div>
</div>

<form class="form-horizontal" role="form"  method="post" name="loginForm">                                    <!--请写上调后的动作action-->
    <div class="form-group">
        <label  class="col-sm-5 control-label">账号</label>
        <div class="col-sm-4">
            <input type="text" class="form-control " name="patientId" placeholder="请输入账号">
        </div>
    </div>



    <div class="form-group">
        <label class="col-sm-5 control-label">密码</label>
        <div class="col-sm-4">
            <input type="password" class="form-control" name="patientPassword" placeholder="请输入密码">
        </div>
    </div>


    <div class="form-group">
        <label class="col-sm-5 control-label">身份</label>
        <div class="col-sm-4">
            <select class="form-control" id="select1" >
                <option value="1">病人</option>
                <option value="2">工作人员</option>
            </select>
        </div>
    </div>



    <div align="center">
        <button type="button" class="btn btn-primary btn-lg " onclick="login()">登录</button>
    </div>

</form>

<div class="container">
    <div class="row">
        <h1 ></h1>
    </div>
    <div class="row">
        <div  align="center">
            <a href="${pageContext.request.contextPath }/showRegister.action"><p><strong><font size="2" color="#cccccc">病人首次登录请注册</font></strong></p></a>
        </div>
    </div>
</div>
</body>
</html>