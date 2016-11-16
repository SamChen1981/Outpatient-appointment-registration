<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>查看预约情况</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath }/css/bootstrap.min.css" />
<script type="text/javascript"
	src="${pageContext.request.contextPath }/js/jquery.min.js" /></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath }/js/bootstrap.min.js"></script>
	
	<!-- <script type="text/javascript">
	$(document).ready(function(){  
		$.ajax({
		url:"${pageContext.request.contextPath }/queryOrderList",
		dataType:"json",
		data:{patientId:data},
		type:"post",
		success:function(){
			
		},
		error:function(){}
		}) 
	});  
	</script> -->
</head>
<body>

<div class="container">                                                                  <!--标题容器-->

    <div class="row">
        <h1 align="center"><strong><font color="#8b0000">预约情况</font></strong></h1>
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

<form class="form-horizontal" name="orderForm" role="form"> 
<div class="container-fluid">
    <table class="table table-striped" >
        <tr align="center">
            <td>预约ID</td>
            <td>姓名</td>
            <td>科室</td>
            <td>医生姓名</td>
            <td>号别</td>
            <td>费用</td>
            <td>预约时间</td>
            <td>操作</td>
        </tr>
        <c:forEach var="list" items="${ orderList}">
            <tr align="center">
                <td>${list.orderId}</td>
                <td>${list.patientName}</td>
                <td>${list.departmentName}</td>
                <td>${list.doctorName}</td>
                <td>${list.costType}</td>
                <td>${list.costPrice} </td>
                <td><fmt:formatDate value="${list.ordertime}" pattern="yyyy-MM-dd"/></td>
                <td><button onclick="deleteOrder(${list.orderId})" class="btn btn-info" type="button">撤销</button></td>
            </tr>
        </c:forEach>
	 
    </table>
   	<div  align="center">
	 	<a href="${pageContext.request.contextPath}/returnPa" class="btn btn-info" role="button">返回</a>
	</div>
</div>
</form>
<script type="text/javascript">
	function deleteOrder(data){
		$.ajax ({
			url:"${pageContext.request.contextPath}/deleteOrder",
			type:"post",
			dataType:"",
			data:{orderId:data},
			success:function(){
				window.location.href="/medicalsystem/queryOrderList";
			},
			error:function(){}
			})
	}
</script>

</body>
</html>