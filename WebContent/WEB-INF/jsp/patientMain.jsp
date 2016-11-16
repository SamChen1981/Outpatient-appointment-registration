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
		
    function test(){
    	$('#order').modal('show');
    	$('#order').on('shown.bs.modal', function () {
    		/* var selval = $("#select1").val();
    		$.ajax({
    	       	url:"${pageContext.request.contextPath}/getDoctor",
    	       	type:"post",
    	       	dataType:"json",
    	       	data:{departmentId:selval},
    	       	success:function(data){
    	       		for(var i=0;i<data.length;i++){
		       			$("#select2").append("<option value="+data[i].doctorId+">"+data[i].doctorName+"</option>");
		       		}
    	       	},
    				error:function(){}
    	       }) */
    		}); 
    	$('#order').on('hide.bs.modal', function () {
    		$("#select2").empty();
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
                <li><a onclick="test()">公告</a></li>
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
<div class="modal fade" id="order" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                <h4 class="modal-title">公告</h4>
            </div>
            <div class="modal-body">
           <h1>无线覆盖招标公告</h1>
           <p></p>
           <p>1、我中心决定对安阳地区医院无线覆盖进行竞争性谈判的方式进行采购。欢迎具有合法有效经营资格的公司参加投标。</p>
           <p>2、有意合作的厂商请认真阅读本招标文件中的各项内容，进行必要的投标准备，并按本招标文件的要求编制投标书。</p>
           <p>3、投标方的法定代表或代理人（代理人必须持有法人授权委托书），携带本人身份证明和相关资料，按投标方须知确定的时间、地点报名投标。</p>
           <p>4、凡参加投标的厂商，无论投标结果如何，参加投标所发生的全部费用由投标方自行承担。</p>
           </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                <button type="button" class="btn btn-primary">确定</button>
            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal-dialog -->
</div><!-- /.modal -->
<!-- Bootstrap core JavaScript
================================================== -->
<!-- Placed at the end of the document so the pages load faster -->

<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
</body>
</html>