<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>预约</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/bootstrap.min.css">
<script src="${pageContext.request.contextPath }/js/jquery.min.js"></script>
<script src="${pageContext.request.contextPath }/js/bootstrap.min.js"></script>
</head>
<body>
	<div align="Left"><a href="${pageContext.request.contextPath}/returnPa" class="btn btn-info" role="button">返回</a></div>
    <div class="container" align="center">
        <h4>预约科室选择</h4>
        <table class="table table-hover">
            <tr align="center">
                <td>科室ID</td>
                <td>科室名称</td>
                <td>操作</td>
            </tr>
            <c:forEach items="${departmentList}" var="el">

                <tr align="center">
                    <td>${el.departmentId}</td>
                    <td>${el.departmentName}</td>
                    <td><a class="btn btn-info" href="${pageContext.request.contextPath }/schedul/${el.departmentId}" >预约</a></td>
                </tr>
            </c:forEach>
        </table>
    </div>



</html>