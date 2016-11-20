<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>病人预约</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/bootstrap.min.css">
<link href="${pageContext.request.contextPath }/css/navbar-fixed-top.css" rel="stylesheet" type="text/css">
<script src="${pageContext.request.contextPath }/js/jquery.min.js"></script>
<script src="${pageContext.request.contextPath }/js/bootstrap.min.js"></script>
<script type="text/javascript">
	$(document).ready(function(){ 
		$("#select1").change(function(){
			var selval = $("#select1").val();
			$.ajax({
		       	url:"${pageContext.request.contextPath}/getDoctor",
		       	type:"post",
		       	dataType:"json",
		       	data:{departmentId:selval},
		       	success:function(data){
		       		/* for(var tem in data){
						$("#select2").append("<option value="+tem.doctorId+">"+tem.doctorName+"</option>");
						} */
		       		for(var i=0;i<data.length;i++){
		       			$("#select2").append("<option value="+data[i].doctorId+">"+data[i].doctorName+"</option>");
		       		}
					},
					error:function(){}
		       })
		       $("#select2").empty();
		});
	});
</script>
</head>

<body>
<!-- Fixed navbar -->
<nav class="navbar navbar-default navbar-fixed-top" role="navigation">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar"
                    aria-expanded="false" aria-controls="navbar">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">预约挂号系统</a>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
            <ul class="nav navbar-nav">
                <li class="active"><a>个人信息预览</a></li>
                <li><a href="/medicalsystem/queryOrderList">查看预约</a></li>
                <li><a href="/medicalsystem/showApplyOrder">预约</a></li>
                <li class="dropdown">
                    <a href="" class="dropdown-toggle" data-toggle="dropdown" aria-expanded="false">设置 <span class="caret"></span></a>
                    <ul class="dropdown-menu" role="menu">
                        <li><a href="">更多操作</a></li>
                    </ul>
                </li>
            </ul>
            <ul class="nav navbar-nav navbar-right">
                <li><a href="${pageContext.request.contextPath }/findPatientInfo">公告</a></li>
                <li><a href="${pageContext.request.contextPath }/logout">登出</a></li>
            </ul>
        </div><!--/.nav-collapse -->
    </div>
</nav>

<div class="container">

    <!-- Main component for a primary marketing message or call to action -->
    <div class="jumbotron">
       <table class="table table-hover table-bordered">
                <h3 >个人信息:<input type="button" value="${patient.patientName}" class="btn btn-info" /></h3>
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
        <p>
            <a class="btn btn-lg btn-primary" href="/medicalsystem/showEdit" role="button">修改个人信息 &raquo;</a>
        </p>
    </div>
</div> <!-- /container -->
<!-- Bootstrap core JavaScript
================================================== -->
<!-- Placed at the end of the document so the pages load faster -->

<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
</body>
</html>