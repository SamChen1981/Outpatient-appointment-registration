<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath }/css/bootstrap.min.css" />
<script type="text/javascript"
	src="${pageContext.request.contextPath }/js/jquery.min.js" /></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath }/js/bootstrap.min.js"></script>
<title>病人信息中心</title>
<script type="text/javascript">
function checkPatientId(patientid){
    //身份证号码不能为空,且格式为15或18位，18位时最后一位可为x或X；
    reg1=/(^\d{15}$)|(^\d{17}([0-9]|X|x)$)/;
    reg2=/^\s*$/g;
    if(reg1.test(patientid)){
        document.getElementById("lbPatientId").innerHTML="<font color='red' size='2'>√</font>"
    }
    else{
        if(reg2.test(patientid)) {
            document.getElementById("lbPatientId").innerHTML="<font color='red' size='2'>×身份证号码不能为空</font>";
        }
        else{
            document.getElementById("lbPatientId").innerHTML="<font color='red' size='2'>×身份证格式错误</font>";
        }
    }
}


function checkPatientPassword(patientpassword){
    //密码不少于6位不多于16位；
    reg1=/^[0-9A-Za-z]{6,16}$/;
    reg2=/^[0-9A-Za-z]{17,}$/;
    reg3=/^[0-9A-Za-z]{1,5}$/;
    reg4=/^\s*$/g;
    if(reg1.test(patientpassword)){
        document.getElementById("lbPatientPassword").innerHTML="<font color='red' size='2'>√</font>"
    }
    else{
        if(reg2.test(patientpassword)) {
            document.getElementById("lbPatientPassword").innerHTML="<font color='red' size='2'>×密码长度不能超过16位</font>";
        }
        else if(reg3.test(patientpassword)){
            document.getElementById("lbPatientPassword").innerHTML="<font color='red' size='2'>×密码长度不能少于6位</font>";
        }
        else if(reg4.test(patientpassword)){
            document.getElementById("lbPatientPassword").innerHTML="<font color='red' size='2'>×密码不能为空</font>";
        }
        else{
            document.getElementById("lbPatientPassword").innerHTML="<font color='red' size='2'>×请检查密码中是否带有特殊符号</font>";
        }
    }
}



function checkPatientPasswordSame(rpatientpassword){
    //密码确认与密码相同
    var password=document.getElementById("pwd").value;
    reg1=/^\s*$/g;
    if(reg1.test(rpatientpassword)){
        document.getElementById("lbPatientPasswordSame").innerHTML="<font color='red' size='2'>×不能为空</font>";
    }
    else{
        if(rpatientpassword==password){
            document.getElementById("lbPatientPasswordSame").innerHTML="<font color='red' size='2'>√</font>"
        }
        else{
            document.getElementById("lbPatientPasswordSame").innerHTML="<font color='red' size='2'>密码需一致</font>"
        }
    }
}


function checkPatientName(patientname){
    //身份证号码不能为空,且格式为15或18位，18位时最后一位可为x或X；
    reg1=/^\s*$/g;
    if(reg1.test(patientname)){
        document.getElementById("lbPatientName").innerHTML="<font color='red' size='2'>×姓名不能为空</font>";
    }
    else{
        document.getElementById("lbPatientName").innerHTML="<font color='red' size='2'>√</font>"
        }
}

</script>
</head>
<body>

<div class="container">                                                                  <!--标题容器-->

    <div class="row">
        <div class="col-sm-1">
            <h1></h1>
        </div>
    </div>
    <div class="row">
        <h1 align="center"><strong><font color="#8b0000">病人注册</font></strong></h1>
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

<form class="form-horizontal" role="form" id="registerForm">                                    <!--请写上调后的动作action-->
    <div class="form-group">
        <label  class="col-sm-4 control-label">身份证号码</label>
        <div class="col-sm-4">
            <input type="text" class="form-control " name="patientId"
                   placeholder="请输入身份证号码" onblur="checkPatientId(this.value)">
        </div>
         <div class="col-sm-4">
            <label id="lbPatientId"></label>
        </div>
    </div>

    <div class="form-group">
        <label class="col-sm-4 control-label">密码</label>
        <div class="col-sm-4">
            <input type="password" class="form-control" name="patientPassword" id="pwd"
                   placeholder="请输入密码" onblur="checkPatientPassword(this.value)">
        </div>
         <div class="col-sm-4">
            <label id="lbPatientPassword"></label>
        </div>
    </div>

    <div class="form-group">
        <label class="col-sm-4 control-label">密码确认</label>
        <div class="col-sm-4">
            <input type="password" class="form-control" name="rePassword"
                   placeholder="请再次输入密码" onblur="checkPatientPasswordSame(this.value)">
        </div>
        <div class="col-sm-4">
            <label id="lbPatientPasswordSame"></label>
        </div>
    </div>

    <div class="form-group">
        <label  class="col-sm-4 control-label">姓名</label>
        <div class="col-sm-4">
            <input type="text" class="form-control " name="patientName"
                   placeholder="请输入姓名" onblur="checkPatientName(this.value)">
        </div>
        <div class="col-sm-4">
            <label id="lbPatientName"></label>
        </div>
    </div>

    <div class="form-group">
        <label  class="col-sm-4 control-label">出生年月</label>
        <div class="col-sm-4">
            <input type="text" class="form-control " name="patientBirthday"
                   placeholder="请输入出生年月 yyyy-MM-dd">
        </div>
    </div>

    <div class="form-group">
        <label  class="col-sm-4 control-label">性别</label>
        <div class="col-sm-4">
            <label class="checkbox-inline">
                <input type="radio" name="patientSex"  value="男" checked>男
            </label>
            <label class="checkbox-inline">
                <input type="radio" name="patientSex"  value="女">女
            </label>
        </div>
    </div>



    <div class="form-group">
        <label  class="col-sm-4 control-label">联系电话</label>
        <div class="col-sm-4">
            <input type="text" class="form-control " name="patientPhone"
                   placeholder="请输入联系电话">
        </div>
    </div>

    <div class="form-group">
        <label  class="col-sm-4 control-label">居住地址</label>
        <div class="col-sm-4">
            <input type="text" class="form-control " name="patientAddress"
                   placeholder="请输入居住地址">
        </div>
    </div>

    <div class="form-group">
        <label  class="col-sm-4 control-label">民族</label>
        <div class="col-sm-4">
            <input type="text" class="form-control " name="patientNation"
                   placeholder="请输入民族">
        </div>
    </div>
    
    
    <div class="row">
    	<div class="col-sm-5"></div>
        <div class="col-sm-1">
            <a href="${pageContext.request.contextPath }/login" class="btn btn-primary btn-lg" type="but">返回</a>
        </div>
    
	    <div class="col-sm-1" >
	        <button type="button" class="btn btn-primary btn-lg " onclick="register()">注册</button>
	    </div>
    </div>
</form>

<script type="text/javascript">
function register(){
	$.ajax ({
		url:"${pageContext.request.contextPath }/register",
		type:"POST",
		data:$("#registerForm").serialize(),
		success:function(data){
			if(data==1){
				alert("帐号为空");
			}else if(data==2){
				alert("帐号重复");
			}else if(data==3){
				alert("注册失败");
			}else if(data==4){
				alert("注册成功");
			}
		},
		error:function(){}
	});
}
</script>

</body>
</html>