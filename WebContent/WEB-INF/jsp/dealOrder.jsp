<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%@ page import="java.text.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>待处理预约</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/bootstrap.min.css">
<link href="${pageContext.request.contextPath }/css/navbar-fixed-top.css" rel="stylesheet" type="text/css">
<script src="${pageContext.request.contextPath }/js/jquery.min.js"></script>
<script src="${pageContext.request.contextPath }/js/bootstrap.min.js"></script>

<script type="text/javascript">
	function formatDate(date, format) {
		var paddNum = function(num) {
			num += "";
			return num.replace(/^(\d)$/, "0$1");
		}
		//指定格式字符
		var cfg = {
			yyyy : date.getFullYear() //年 : 4位
			,
			yy : date.getFullYear().toString().substring(2)//年 : 2位
			,
			M : date.getMonth() + 1 //月 : 如果1位的时候不补0
			,
			MM : paddNum(date.getMonth() + 1) //月 : 如果1位的时候补0
			,
			d : date.getDate() //日 : 如果1位的时候不补0
			,
			dd : paddNum(date.getDate())//日 : 如果1位的时候补0
			,
			hh : date.getHours() //时
			,
			mm : date.getMinutes() //分
			,
			ss : date.getSeconds()
		//秒
		}
		format || (format = "yyyy-MM-dd hh:mm:ss");
		return format.replace(/([a-z])(\1)*/ig, function(m) {
			return cfg[m];
		});
	}
	function findPatientId() {
		document.queryIdForm.action = "${pageContext.request.contextPath }/findOrderLikePid";
		document.queryIdForm.submit();
	}
	function guahao(pid, pname, deid, dename, doid, doname, coid, coname,
			ordertime,orderId) {
		$("#select1").val(pid);
		$("#select2").val(pname);
		$("#select3").val(deid);
		$("#select4").val(dename);
		$("#select5").val(doid);
		$("#select6").val(doname);
		$("#select7").val(coid);
		$("#select8").val(coname);
		var time1 = formatDate(new Date(ordertime),"yyyy-MM-dd");
		$("#select9").val(time1);
		$("#select10").val(orderId);
		$('#guahao').modal('show');
	}
	function update(){
		var patientId=$("#select1").val();
		var departId=$("#select3").val();
		var doctorId=$("#select5").val();
		var costId=$("#select7").val();
		var createtime=$("#select9").val();
		var orderId=$("#select10").val();
		$.ajax({
	       	url:"${pageContext.request.contextPath}/dealwithOrder",
	       	type:"post",
	       	dataType:"json",
	       	data:{"doctorId":doctorId,"orderId":orderId,"departId":departId,"costType":costId,"createtime":createtime,"patientId":patientId},
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
                <li><a href="${pageContext.request.contextPath }/showGuahao">挂号操作</a></li>
                <li class="active"><a href="${pageContext.request.contextPath }/showDealWithOrder">待处理预约</a></li>
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
                           placeholder="请输入身份证号码"/>
                </div>
                <div class="col-sm-1"></div>
                <div class="col-sm-2">
                    <button type="button" class="btn btn-primary btn-block" onclick="findPatientId()">查找</button>
                </div>
            </div>
        </form>
        <br>
        <br>
        <br>
        <div class="panel panel-default">
            <div class="panel-heading">
                <font size="5"><strong>待处理预约</strong></font>
            </div>

            <table class="table table-hover table-bordered">
                <tbody>

                <tr>                                                                        <!--循环输出模板-->
                    <td width="150"><font style="font-weight:bold;" size="4">病人ID</font></td>
                    <td width="100"><font style="font-weight:bold;" size="4">名称</font></td>
                    <td width="70"><font style="font-weight:bold;" size="4">性别</font></td>
                    <td width="220"><font style="font-weight:bold;" size="4">预约科室</font></td>
                    <td width="100"><font style="font-weight:bold;" size="4">医生姓名</font></td>
                    <td width="70"><font style="font-weight:bold;" size="4">号别</font></td>
                    <td width="150" align="center"><font style="font-weight:bold;" size="4">是否将预约转为挂号</font></td>
                </tr>
                <%-- <c:forEach var="el" items="${orderCustomList}">
                <tr>
                        <td>${el.patientId}</td>             <!-- patientID-->
                        <td>${el.patientName}</td>                         <!-- patientName-->
                        <td>${el.patientSex}</td>                             <!-- patientSex-->
                        <td>${el.departmentName}</td>
                        <td>${el.doctorName}</td>                  <!-- patientDepartment-->
                        <td>${el.costType}</td>                          <!-- cost-->
                        <td><button type="button" class="btn btn-primary btn-block" onclick="guahao('${el.patientId}')">进行挂号</button></td>
                </tr>
                </c:forEach> --%>
                <c:if test="${oList.patientId !=null}">
                <tr>
                        <td>${oList.patientId}</td>             <!-- patientID-->
                        <td>${oList.patientName}</td>                         <!-- patientName-->
                        <td>${oList.patientSex}</td>                             <!-- patientSex-->
                        <td>${oList.departmentName}</td>
                        <td>${oList.doctorName}</td>                  <!-- patientDepartment-->
                        <td>${oList.costType}</td>                          <!-- cost-->
                        <td><button type="button" class="btn btn-primary btn-block" 
                        onclick="guahao('${oList.patientId}','${oList.patientName}','${oList.departmentId}','${oList.departmentName}','${oList.doctorId}','${oList.doctorName}','${oList.costId}','${oList.costType}','${oList.ordertime}','${oList.orderId}')">进行挂号</button></td>
                </tr>
                </c:if>
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
                <h4 class="modal-title">挂号</h4>
            </div>
            <div class="modal-body">
            	<h5>病人姓名</h5>
            	<input id="select1" type="hidden" />
            	<input class="form-control" id="select2" readonly/>
            	<h5>科室</h5>
            	<input id="select3" type="hidden" />
            	<input class="form-control" id="select4" readonly/>
                <h5>医生姓名</h5>
                <input id="select5" type="hidden" />
                <input class="form-control" id="select6" readonly/>
                <h5>号别</h5>
                <input id="select7" type="hidden" />
                <input class="form-control" id="select8" type="text" readonly/>
                <h5>时间</h5>
                <input id="select9" class="form-control" type="text" readonly/>
                <input id="select10" type="hidden" />
           </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                <button type="button" class="btn btn-primary" onclick="update()">挂号</button>
            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal-dialog -->
</div><!-- /.modal -->
</body>
</html>