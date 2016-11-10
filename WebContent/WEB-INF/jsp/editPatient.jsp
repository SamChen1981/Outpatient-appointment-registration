<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>信息修改</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath }/css/bootstrap.min.css" />
<script type="text/javascript"
	src="${pageContext.request.contextPath }/js/jquery-1.7.2.min.js" /></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath }/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">                                                                  <!--标题容器-->

    
    <div class="row">
        <h1 align="center"><strong><font color="#8b0000">信息修改</font></strong></h1>
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

<form class="form-horizontal" role="form" method="post" action="${pageContext.request.contextPath }/editPatientSubmit.action">                                    <!--请写上调后的动作action-->
    <div class="form-group">
        <label  class="col-sm-4 control-label">身份证号码</label>
        <div class="col-sm-4">
            <input class="form-control" id="patientId" readonly value="${patient.patientId}"/>

        </div>
    </div>

    <div class="form-group">
        <label class="col-sm-4 control-label">密码</label>
        <div class="col-sm-4">
            <input type="password" class="form-control" name="patientPassword"
                   placeholder="请输入密码"/>
        </div>
    </div>

    <div class="form-group">
        <label class="col-sm-4 control-label">密码确认</label>
        <div class="col-sm-4">
            <input type="password" class="form-control" name="rePassword"
                   placeholder="请再次输入密码"/>
        </div>
    </div>

    <div class="form-group">
        <label  class="col-sm-4 control-label">姓名</label>
        <div class="col-sm-4">
            <input type="text" class="form-control " name="patientName"
                   value="${patient.patientName}">
        </div>
    </div>

    <div class="form-group">
        <label  class="col-sm-4 control-label">出生年月</label>
        <div class="col-sm-4">
            <input type="text" class="form-control " id="patientBirthday"
                   value="<fmt:formatDate value="${patient.patientBirthday}" pattern="yyyy-MM-dd"/>"/>
        </div>
    </div>

    <div class="form-group">
        <label  class="col-sm-4 control-label">性别</label>
        <div class="col-sm-4">
            <label class="checkbox-inline">
                <input type="radio" name="patientSex" checked/>男
            </label>
            <label class="checkbox-inline">
                <input type="radio" name="patientSex"/>女
            </label>
        </div>
    </div>



    <div class="form-group">
        <label  class="col-sm-4 control-label">联系电话</label>
        <div class="col-sm-4">
            <input type="text" class="form-control " id="patientPhone"
                   value="${patient.patientPhone}">
        </div>
    </div>

    <div class="form-group">
        <label  class="col-sm-4 control-label">居住地址</label>
        <div class="col-sm-4">
            <input type="text" class="form-control " name="patientAddress"
                   value="${patient.patientAddress}">
        </div>
    </div>

    <div class="form-group">
        <label  class="col-sm-4 control-label">民族</label>
        <div class="col-sm-4">
            <input type="text" class="form-control " name="patientNation"
                   value="${patient.patientNation}">
        </div>
    </div>

    <div class="col-sm-offset"  align="center">
        <button type="submit" class="btn btn-primary btn-lg ">确认修改</button>
    </div>
</form>


</body>
</html>