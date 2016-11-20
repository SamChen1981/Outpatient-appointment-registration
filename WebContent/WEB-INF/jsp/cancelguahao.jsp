<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>退号</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/bootstrap.min.css">
<link href="${pageContext.request.contextPath }/css/navbar-fixed-top.css" rel="stylesheet" type="text/css">
<script src="${pageContext.request.contextPath }/js/jquery.min.js"></script>
<script src="${pageContext.request.contextPath }/js/bootstrap.min.js"></script>

<script type="text/javascript">
	function cancel(guahaoId){
		$("#select1").val(guahaoId);
		$("#guahao").modal('show');
	}
	function update(){
		var dat=$("#select1").val();
		$.ajax({
			url:"${pageContext.request.contextPath }/deleteGuahao",
			type:"post",
			dataType:"json",
			data:{"guahaoId":dat},
			success:function(e){
				if(e==1){
					alert("删除成功");
				}else{
					alert("删除失败");
				}
				location.reload(true);
			},
			error:function(){}
		});
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
                <li><a href="${pageContext.request.contextPath }/showGuahao">挂号操作</a></li>
                <li><a href="${pageContext.request.contextPath }/showDealWithOrder">待处理预约</a></li>
                <li class="active"><a href="${pageContext.request.contextPath }/showCancelGuahao">退号</a></li>
            </ul>
            <ul class="nav navbar-nav navbar-right">
                <li class="dropdown">
                    <a class="dropdown-toggle" data-toggle="dropdown" aria-expanded="false">公告 <span class="caret"></span></a>
                    <ul class="dropdown-menu" role="menu">
                        <li><a href="${pageContext.request.contextPath }/findAllInfo">查看公告</a></li>
                        <li><a href="${pageContext.request.contextPath }/showPublishInfo">发布公告</a></li>
                    </ul>
                </li>
                <li><a href="">登出</a></li>
            </ul>
        </div><!--/.nav-collapse -->
    </div>
</nav>

<div class="container">

    <!-- Main component for a primary marketing message or call to action -->
    <div class="jumbotron">
        <br>
        <form method="post" action="${pageContext.request.contextPath }/findGuahaoByPid">
            <div class="form-group">
                <label  class="col-sm-2 control-label"><font size="5">病人ID</font></label>
                <div class="col-sm-4">
                    <input type="text" class="form-control " name="patientId"
                           placeholder="请输入身份证号码"/>
                </div>
                <div class="col-sm-1"></div>
                <div class="col-sm-2">
                    <button type="submit" class="btn btn-primary btn-block"><strong>查找</strong></button>
                </div>
            </div>
        </form>
        <br>
        <br>
        <br>
        <div class="panel panel-default">
            <div class="panel-heading">
                <font size="5"><strong>退号处理</strong></font>
            </div>

            <table class="table table-hover table-bordered">
                <tbody>

                <tr>                                                                        <!--循环输出模板-->
                    <td width="150"><font style="font-weight:bold;" size="4">病人ID</font></td>
                    <td width="100"><font style="font-weight:bold;" size="4">名称</font></td>
                    <td width="70"><font style="font-weight:bold;" size="4">性别</font></td>
                    <td width="220"><font style="font-weight:bold;" size="4">科室</font></td>
                    <td width="70"><font style="font-weight:bold;" size="4">医生姓名</font></td>
                    <td width="70"><font style="font-weight:bold;" size="4">号别</font></td>
                    <td width="150" align="center"><font style="font-weight:bold;" size="4">是否退号</font></td>
                </tr>
                <c:forEach var="el" items="${gList}">
                <tr>
                    <td>${el.patientId}</td>             <!-- patientID-->
                    <td>${el.patientName}</td>                         <!-- patientName-->
                    <td>${el.patientSex}</td>                             <!-- patientSex-->
                    <td>${el.departmentName}</td>                           <!-- patientDepartment-->
                    <td>${el.doctorName}</td> 
                    <td>${el.costType}</td>                           <!-- cost-->
                    <td><button type="button" class="btn btn-primary btn-block" onclick="cancel('${el.guahaoId}')">进行退号</button></td>
                </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
        <div id="middle"></div>                            <!--稳定大屏幕界面高度适中容器-->
    </div>
</div> <!-- /container -->
<div class="modal fade" id="guahao" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
            </div>
            <div class="modal-body">
            <h3 align="center">确认退号??</h3>
            <input id="select1" type="hidden" />
           </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">Cancel</button>
                <button type="button" class="btn btn-primary" onclick="update()">退号</button>
            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal-dialog -->
</div><!-- /.modal -->
<!-- Bootstrap core JavaScript
================================================== -->
<script>                                                     <!--稳定大屏幕界面高度适中容器JS-->
total = document.documentElement.clientHeight;
colHeight = total-document.getElementById("middle").offsetTop;
document.getElementById("middle").style.height=colHeight+"px";
</script>

</body>
</html>