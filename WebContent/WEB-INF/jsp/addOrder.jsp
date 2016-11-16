<%@page import="sun.util.resources.CalendarData"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*,java.text.*,com.medicalsystem.pojo.TSchedulCustom"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>预约详情</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/bootstrap.min.css">
<script src="${pageContext.request.contextPath }/js/jquery.min.js"></script>
<script src="${pageContext.request.contextPath }/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container" align="center">
	<div align="left">
	<a href="${pageContext.request.contextPath}/returnPa" class="btn btn-info" role="button" style="width:1%"><</a>
	</div>
    <h4>详细选择</h4>
    <table class="table table-hover">
        <tr align="center">
        <%
    	Date date =new Date();
    	Calendar can=Calendar.getInstance(); 
    	for(int i=0;i<7;i++){
    		can.add(Calendar.DATE, 1);
    		date=can.getTime();
    	%>
    		<th><fmt:formatDate value='<%=date%>' pattern='yyyy-MM-dd'/></th>
    	<% 
    		}
   		 %>
        </tr>
        <tr align="center">
        <%
    	can=Calendar.getInstance(); 
    	for(int i=0;i<7;i++){
    		can.add(Calendar.DATE, 1);
    		date=can.getTime();
    		
    	%>
    	<th>
    		 <c:forEach var="el" items="${schedulList}">
    		 
    			<%-- <c:if test="<fmt:formatDate value='${el.schedultime}' pattern='yyyy-MM-dd'/>==<fmt:formatDate value='<%=date%>' pattern='yyyy-MM-dd'/>">${el.schedultime}</c:if> --%>
    			<fmt:formatDate value="${el.schedultime}" pattern="yyyy-MM-dd" var="getDate"/>
    			<fmt:formatDate value="<%=date%>" pattern="yyyy-MM-dd" var="nowDate"/>
    			<c:if test="${nowDate==getDate}">
    				<a onclick="show('${el.departmentId}','${el.costId}','${el.departmentName}','${el.doctorName}','${nowDate}','${el.costType}','${el.doctorId}')">${el.doctorName}</a><br>
    			</c:if>
    			
    			<%-- <p>${getDate}</p> --%>
    			
    		</c:forEach>
		</th>
    	<% 
    		}
   		 %>
        </tr>
        
    </table>
  
    
</div>
<div class="modal fade" id="order" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                <h4 class="modal-title">预约信息</h4>
            </div>
            <div class="modal-body">
            <input type="hidden" class="form-control" name="departmentId" id="deId"/>
            科室名称:<input type="text" class="form-control" name="departmentName" id="depId" readonly/>
            <input type="text" class="form-control" name="doctorId" id="docId" />
            医生姓名:<input type="text" class="form-control"  id="doctorname" readonly/>
            <input type="hidden" class="form-control" name="costId" id="cId"/>
            号别:<input type="text" class="form-control" name="costType" id="coId" readonly/>
            预约时间:<input type="text" class="form-control" name="ordertime" id="ordertime" readonly/>
           </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                <button type="button" class="btn btn-primary" onclick="update()">预约</button>
            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal-dialog -->
</div><!-- /.modal -->
 <script type="text/javascript">
   		function show(deId,cosId,departmentName,docname,getDate,costType,docId) {
   			 $("#depId").val(departmentName);
   			 $("#doctorname").val(docname);
   			$("#ordertime").val(getDate); 
   			$("#coId").val(costType);
   			$("#deId").val(deId);
   			$("#cId").val(cosId);
   			$("#docId").val(docId);
   			 $('#order').modal('show');
		}
   		function update(){
   			var cid=$("#cId").val();
   			var otime=$("#ordertime").val();
   			var dId=$("#deId").val();
   			var docId=$("#docId").val();
   			$.ajax({
   				url:"${pageContext.request.contextPath }/addOrder",
   				type:"POST",
   				dataType:"json",
   				data:{"departmentId":dId,"ordertime":otime,"costId":cid,"doctorId":docId},
   				success:function(e){
   					if(e==1){
   						alert("预约成功");
   					}else{
   						alert("预约失败");
   					}
   				},
   				error:function(){}
   			})
   		}
   </script>
</body>
</html>