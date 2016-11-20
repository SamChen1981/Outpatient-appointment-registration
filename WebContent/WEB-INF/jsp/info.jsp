<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>公告</title>
    <link href="${pageContext.request.contextPath }/css/bootstrap.min.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath }/css/navbar-fixed-top.css" rel="stylesheet">

    <link rel="stylesheet" href="${pageContext.request.contextPath }/summernote/font-awesome.min.css">
    <script src="${pageContext.request.contextPath }/js/jquery.min.js"></script>
    <script src="${pageContext.request.contextPath }/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="${pageContext.request.contextPath }/summernote/summernote.css">
    <script src="${pageContext.request.contextPath }/summernote/summernote.min.js"></script>
    <script type="text/javascript">
    	function update(){
    		var tt=$("#title").val();
    		var summer = $('#editor').summernote('code');
    		$.ajax({
    			url:"${pageContext.request.contextPath }/insertInfo",
    			type:"post",
    			dataType:"json",
    			data:{"title":tt,"info":summer},
    			success:function(data){
    				if(data==1){
    					alert("发布成功");
    					window.location.href="${pageContext.request.contextPath }/findAllInfo";
    				}else{
    					alert("发布失败");
    				}
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
                <li><a href="${pageContext.request.contextPath }/showCancelGuahao">退号</a></li>
            </ul>
            <ul class="nav navbar-nav navbar-right">
                <li class="dropdown">
                    <a class="dropdown-toggle" data-toggle="dropdown" aria-expanded="false">公告 <span class="caret"></span></a>
                    <ul class="dropdown-menu" role="menu">
                        <li><a href="${pageContext.request.contextPath }/findAllInfo">查看公告</a></li>
                        <li><a href="${pageContext.request.contextPath }/showPublishInfo">发布公告</a></li>
                    </ul>
                </li>
                <li><a href="${pageContext.request.contextPath }/logout">登出</a></li>
            </ul>
        </div><!--/.nav-collapse -->
    </div>
</nav>

<div class="container">

    <!-- Main component for a primary marketing message or call to action -->
    <div class="jumbotron">
        <form name="infoForm" method="post" action="">
            <div class="form-group">
                <label  class="col-sm-2 control-label"><font size="5">公告发布</font></label>
            </div>
            <br>
            <div class="panel panel-default">
                <div class="panel-heading">
                    <font size="5"><strong>请填写标题：</strong></font>
                    <input  type="text" class="form-control" id="title"/>
                </div>

            </div>
            <div id="editor">
            </div>
            <div class="col-sm-10"></div>
            <div class="col-sm-2">
            <button type="button" class="btn btn-primary btn-block" onclick="update()">发布</button>
            </div>
        </form>
        <div id="middle"></div>                            <!--稳定大屏幕界面高度适中容器-->
    </div>
</div> <!-- /container -->
<!-- Bootstrap core JavaScript
================================================== -->
<script type="text/javascript">
    $(document).ready(function () {
        $("#editor").summernote({
            height:200,
            minHeight:null,
            maxHeight:null,
            focus:true,});
    })

</script>
<script>                                                     <!--稳定大屏幕界面高度适中容器JS-->
total = document.documentElement.clientHeight;
colHeight = total-document.getElementById("middle").offsetTop;
document.getElementById("middle").style.height=colHeight+"px";
</script>

</body>
</html>