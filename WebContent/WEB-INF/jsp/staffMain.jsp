<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%@page import="java.text.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>staff</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/bootstrap.min.css">
<link href="${pageContext.request.contextPath }/css/navbar-fixed-top.css" rel="stylesheet" type="text/css">
<script src="${pageContext.request.contextPath }/js/jquery.min.js"></script>
<script src="${pageContext.request.contextPath }/js/bootstrap.min.js"></script>
<script type="text/javascript">
$(document).ready(function(){ 
	$("#select1").change(function(){
		var selval = $("#select1").val();
		$.ajax({
	       	url:"${pageContext.request.contextPath}/selectguahao",
	       	type:"post",
	       	dataType:"json",
	       	data:{departmentId:selval},
	       	success:function(data){
	       		for(var i=0;i<data.length;i++){
	       			 var nowdate=new Date().toLocaleDateString();
	       			 var getdate=new Date(data[i].schedultime).toLocaleDateString();
	       			 if(nowdate==getdate){
	       				$("#select2").append("<option value="+data[i].doctorId+">"+data[i].doctorName+"</option>");
	       			 }
	       			$("#select4").val(nowdate);
	       		}
	       		$("#select2").change(function(){
	       			var s2 = $("#select2").val();
	       			$.ajax({
	       		       	url:"${pageContext.request.contextPath}/findDoctor",
	       		       	type:"post",
	       		       	dataType:"json",
	       		       	data:{doctorId:s2},
	       		       	success:function(data){
	       		       		var hb=data.doctorType;
	       		       		if(hb==1){
	       		       			$("#select3").val("专家");
	       		       			$("#select6").val(hb);
	       		       			}
	       		       		else if(hb==2){
	       		       			$("#select3").val("普通");
	       		       			$("#select6").val(hb);
	       		       			}
	       					},
	       					error:function(){}
	       		       })
	       		});
				},
				error:function(){}
	       })
	       $("#select2").empty();
	});
});
	function queryId(){
		document.queryIdForm.action="${pageContext.request.contextPath }/findPatientLike";
		document.queryIdForm.submit();
	}
	function guahao(data){
		$("#select5").val(data);
		$('#guahao').modal('show');
	}
	function update(){
		var departId=$("#select1").val();
		var doctorId=$("#select2").val();
		var createtime=$("#select4").val();
		var patientId=$("#select5").val();
		var costType=$("#select6").val();
		
		$.ajax({
	       	url:"${pageContext.request.contextPath}/addguahao",
	       	type:"post",
	       	dataType:"json",
	       	data:{"doctorId":doctorId,"departId":departId,"costType":costType,"createtime":createtime,"patientId":patientId},
	       	success:function(data){
	       		if(data==1){
	       			alert("挂号成功");
	       		}else{
	       			alert("挂号失败");
	       		}
	       	},
				error:function(){}
	       })
	}
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
            <a class="navbar-brand"><strong>预约挂号系统</strong></a>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
            <ul class="nav navbar-nav">
                <li class="active"><a href="showGuahao">挂号操作</a></li>
                <li><a href="${pageContext.request.contextPath }/showDealWithOrder">待处理预约</a></li>
                <li><a href="#about3">退号</a></li>
            </ul>
            <ul class="nav navbar-nav navbar-right">
                <li><a href="">公告</a></li>
                <li><a href="${pageContext.request.contextPath }/logout">登出</a></li>
            </ul>
        </div><!--/.nav-collapse -->
    </div>
</nav>

<div class="container">

    <!-- Main component for a primary marketing message or call to action -->
    <div class="jumbotron">
        <br>
        <form name="queryIdForm">
            <div class="form-group">
                <label  class="col-sm-2 control-label"><font size="5">病人ID</font></label>
                <div class="col-sm-4">
                    <input type="text" class="form-control " name="patientId"
                           placeholder="请输入身份证号码">
                </div>
                <div class="col-sm-1"></div>
                <div class="col-sm-2">
                    <button type="button" class="btn btn-primary btn-block" name="patientIdSubmit" onclick="queryId()"><strong>查找</strong></button>
                </div>
            </div>
        </form>
        <br>
        <br>
        <br>
        <div class="panel panel-default">
            <div class="panel-heading">
               <font size="5"><strong>病人信息</strong></font>
            </div>

            <table class="table table-hover table-bordered">

                <tbody>

                <tr>
                    <td>病人ID</td>
                    <td>姓名</td>                              <!--patientName-->
                </tr>
                <c:forEach var="el" items="${patientLikeList}">
                <tr>
                    <td>${el.patientId}</td>
                    <td><a onclick="guahao('${el.patientId}')">${el.patientName}</a></td>                                  <!--patientSex-->
                </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
        <br>
        <div id="middle"></div>
    </div>
</div> <!-- /container -->
<div class="modal fade" id="guahao" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                <h4 class="modal-title">挂号</h4>
            </div>
            <div class="modal-body">
            	<h5>选择科室</h5>
            	<select class="form-control" id="select1">
                	<c:forEach var="dep" items="${departmentList}">
                		<option value="${dep.departmentId}">${dep.departmentName}</option>
                	</c:forEach>
                </select>
                <h5>选择医生</h5>
                <select class="form-control" id="select2">
                </select>
                <h5>号别</h5>
                <input class="form-control" id="select3" type="text" readonly></input>
                <h5>时间</h5>
                <input id="select4" class="form-control" type="text" readonly></input>
                <input id="select5" type="hidden" />
                <input id="select6" type="hidden" />
           </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                <button type="button" class="btn btn-primary" onclick="update()">挂号</button>
            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal-dialog -->
</div><!-- /.modal -->
<!-- Bootstrap core JavaScript
================================================== -->
<!-- Placed at the end of the document so the pages load faster -->
<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
<script>
    total = document.documentElement.clientHeight;
    colHeight = total-document.getElementById("middle").offsetTop;
    document.getElementById("middle").style.height=colHeight+"px";
</script>

</body>
</html>