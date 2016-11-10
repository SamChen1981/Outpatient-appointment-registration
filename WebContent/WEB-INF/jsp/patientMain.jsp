<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>病人预约</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath }/css/bootstrap.min.css" />
<script type="text/javascript"
	src="${pageContext.request.contextPath }/js/jquery-1.7.2.min.js" /></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath }/js/bootstrap.min.js"></script>
	
	<script type="text/javascript">
		function logout(){
			document.patientForm.action="${pageContext.request.contextPath }/logout.action";
			document.patientForm.submit();
		}
	</script>
</head>
<body>
<form method="post" name="patientForm">
<div class="container">                                                                  <!--标题容器-->

    <div class="row">
        <h1 align="center"><strong><font color="#8b0000">病人预约</font></strong></h1>
    </div>

</div>

<div class="container">                                                                       <!--暴力分行容器-->

    <div class="row">
        <h1 align="center"><strong><font color="#8b0000"></font></strong></h1>
    </div>

</div>

<div class="container">
    <div class="row">
        <div class="col-sm-3"></div>
        <div class="col-sm-6">
            <table class="table table-hover table-bordered">
                <caption>
                <h3 >个人信息:<input type="button" value="${patientName}" class="btn btn-info" /> 
                <a href="${pageContext.request.contextPath }/showEdit.action?id=${patient.patientId}" class="btn btn-primary">修改信息</a> 
                </h3>
                </caption>              

                <tbody>

                <tr>
                    <td>名称</td>
                    <td>${patient.patientName}</td>                                 <!--patientName-->
                </tr>
                <tr>
                    <td>性别</td>
                    <td>${patient.patientSex}</td>                                  <!--patientSex-->
                </tr>
                <tr>
                    <td>出生年月</td>
                    <td><fmt:formatDate value="${patient.patientBirthday}" pattern="yyyy-MM-dd"/></td>                                                 <!--patientBirthday-->
                </tr>
                <tr>
                    <td>联系电话</td>
                    <td>${patient.patientPhone}</td>                                <!--patientPhone-->
                </tr>
                <tr>
                    <td>居住地址</td>
                    <td>${patient.patientAddress}</td>                              <!--patientAddress-->
                </tr>
                <tr>
                    <td>民族</td>
                    <td>${patient.patientNation}</td>                               <!--patientNation-->
                </tr>

                </tbody>
            </table>
        </div>
        <div class="col-sm-3"></div>
    </div>

</div>

<div class="container">                                                                       <!--暴力分行容器-->

    <div class="row">
        <h1 align="center"><strong><font color="#8b0000"></font></strong></h1>                <!--暴力分行容器-->
    </div>
    <div class="row">
        <h1 align="center"><strong><font color="#8b0000"></font></strong></h1>                <!--暴力分行容器-->
    </div>

    <div class="row">
        <div class="col-sm-3"></div>
        <div class="col-sm-2">
            <button class="btn btn-primary btn-block " id="applyorder">申请预约</button>
        </div>
        <div class="col-sm-2">
            <button class="btn btn-primary btn-block " id="checkorder">查看预约</button>
        </div>
        <div class="col-sm-2">
            <button class="btn btn-primary btn-block " name="userLogout" onclick="logout()">登出</button>
        </div>
        <div class="col-sm-2"></div>
    </div>

</div>

</form>
</body>
</html>