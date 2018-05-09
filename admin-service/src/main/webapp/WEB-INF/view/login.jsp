<%@ page language="java" pageEncoding="UTF-8"
	import="java.util.Enumeration"%>
<%@include file="/WEB-INF/view/common/common.jsp"%>
<%
	Enumeration<String> emu = session.getAttributeNames();
	while (emu.hasMoreElements()) {
		session.removeAttribute(emu.nextElement());
	}
	session.invalidate();
%>
<!doctype html>
<html>
<head>
<title>澳博会员营销系统-登录</title>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="FDA,FDAC">
<meta http-equiv="description" content="FDA">
<link rel="stylesheet" type="text/css" href="<c:url value='/resources/css/collie-regist.css'/>" />
</head>
<body>
	<header class="pt100">
			<div class="w clearfix">
				<span class="login pull-right white">没有账号？ <a class="white"  href="<c:url value='/admin/dmz/regist.html'/>" title="注册" target="_blank">立即注册</a></span>
				<span class="logo pull-left"> </span>
				<span class="regist pull-left white">澳博会员营销系统</span>
			</div>
	</header >
		<section>
		<div class="w centent">
			<div class="title">商户登录</div>
			<div class="form">
				
				<form role="form" action="${pageContext.request.contextPath }/admin/login.json"
					method="POST" name="loginForm" id="loginForm">
								<div class="input-group input-group-lg">
									 <span class="input-group-addon tu-biao tu-biao-1"></span>
									 <input type="text" name="accountName" id="accountName"
									value="${accountName}" class="form-control shu-ru-kuang" required autocomplete="on"
									placeholder="您注册的手机号" autofocus="autofocus" tabindex="1">
									 <!-- <input class="form-control shu-ru-kuang" type="text" id="tenantName"  name="tenantName" placeholder="请输入手机号"> -->
								</div>
								<span class="error-tip text-error"></span>
							
				
								<div class="input-group input-group-lg">
									 <span class="input-group-addon tu-biao tu-biao-2"></span>
									 <input type="password" class="form-control shu-ru-kuang" autocomplete="on"
									id="password" name="password" required placeholder="您的密码"
									tabindex="2">
								</div>
								<span class="error-tip text-error"></span>
								
								
								
								<div class="input-group input-group-lg">
									<span class="input-group-addon tu-biao tu-biao-3"></span>
				                   <input type="text" name="captcha" required placeholder="请输入验证码"
										class="form-control shu-ru-kuang yan-zheng" tabindex="3">	
				                    <span class="yan-zheng-ma">
				                        <img src="<c:url value='/captcha.jpg'/>" title="点我换过一张"
										class="captcha-img captchaImg">
				                    </span>
				                </div>
								<span class="error-tip text-error"></span>
								


								<div>
									<button type="submit" class="btn btn-success btn-lg btn-block" 
									style="border-radius: 0px;background-color: #ffa603;border: none;background-image: none;"
									id="loginBut" name="loginBut" value="login" tabindex="3" data-loading-text="正在登录......">
									登录</button>
								</div>
								<div class="row">
									<div class="alert alert-danger invisible"
									style="margin-top: 10px;line-height: 20px;padding: 5px;text-align: center;"
									 role="alert" id="alert">
										&nbsp;</div>
							</div>
					</form>
			</div>
		</div>
	</section>
		<footer class="row my-footer" >
			<p>长沙澳博软件开发有限公司</p>
			<!-- <p><a target="new" href="http://www.allpos.cn/plus/list.php?tid=12">关于澳博</a> &nbsp;|&nbsp; <a target="new" href="http://www.allpos.cn/plus/view.php?aid=24">产品中心</a> &nbsp;|&nbsp; <a target="new" href="http://www.allpos.cn/plus/list.php?tid=17" >联系我们</a></p>
			<p>湘ICP备11007512号 版权所有：长沙澳博软件开发有限公司 Copyright &copy; 2005-2018</p>	
			<p>总机：0731-85833030 &nbsp;&nbsp;&nbsp;&nbsp;传真：0731-85677830</p>	
			<p>地址：长沙市雨花区韶山南路66号亚商国际大厦A栋1422-1423室 </p>		 -->		
	</footer>
	<%-- <div class="container-fluid">
		<div class="row">

			<div class="col-md-4 col-md-offset-1 col-sm-7 col-xs-12">

				<div class="row">
					<div class="col-md-12 col-sm-12 col-xs-12">
						<div class="page-header yahei">
							<h1><span>澳博云订货系统 </span><small>管理端登录</small></h1>
						</div>
					</div>
				</div>
				<form role="form" action="${pageContext.request.contextPath }/admin/login.json"
					method="POST" name="loginForm" id="loginForm">
					<div class="form-group">
						<label for="accountName" class="control-label">帐户名</label>
						<div class="row">
							<div class="col-md-8 col-xs-12">
								<input type="text" name="accountName" id="accountName"
									value="${accountName}" class="form-control input-lg" required
									placeholder="您的账户名" autofocus="autofocus" tabindex="1">
							</div>
							<div class="col-md-4 col-xs-12 text-error"></div>
						</div>
					</div>
					<div class="form-group">
						<label for="password">登录口令</label>
						<div class="row">
							<div class="col-md-8 col-xs-12">
								<input type="password" class="form-control input-lg"
									id="password" name="password" required placeholder="您的密码"
									tabindex="2">
							</div>
							<div class="col-md-4 col-xs-12 text-error"></div>
						</div>
					</div>
					<div class="form-group">
						<label for="captcha" >验证码</label> 
						<div class="row">
							<div class="col-md-8 col-xs-12">
								<div class="input-group">
									<span class="input-group-addon" id="basic-addon1"> <span
										class="glyphicon glyphicon-picture"></span>
									</span> 
									<input type="text" name="captcha" required placeholder="请输入下图验证码"
										class="form-control input-lg" tabindex="3">	
								</div>
							</div>
						<div class="col-md-4 col-xs-12 text-error"></div>
						</div>
					</div>
					<div class="form-group">
						<div class="col-md-8 col-xs-12" style="padding: 0;">
								<img src="<c:url value='/captcha.jpg'/>" title="点我换过一张"
									class="captcha-img captchaImg">
								<span>看不清,换一张</span>
						</div>
					</div>

					<div class="form-group">
						<div class="row">
							<div class="col-md-8 col-xs-12">
								<button type="submit" class="btn btn-primary btn-block btn-lg"
									id="loginBut" name="loginBut" value="login" tabindex="3" data-loading-text="正在登录......">
									<span class="glyphicon glyphicon-log-in"
										>&nbsp;</span>系统登录
								</button>
							</div>
						</div>
					</div>
					<div class="row">
					<div class="col-md-8 col-xs-12 col-md-8">
						<div class="alert alert-danger invisible" role="alert" id="alert">
							&nbsp;</div>
					</div>
				</div>


				</form>
			</div>

		</div>
	</div> --%>
		<script type="text/javascript">
		$(function() {
			init();
		});
		function keydownHandler(event) {
			if (event.keyCode == 13) {
				$("#password").trigger("focus");
				return false;
			}
		}
		function init() {
			//var FullscreenrOptions = {  width: 1400, height: 682, bgID: '#bgimg' };
			//jQuery.fn.fullscreenr(FullscreenrOptions);
$(".captcha-text").click(function() {
		$(".captchaImg").click();
	});
			$(".captchaImg").click(function reload(){
				var date=new Date();
				var s=[];
				var src=$(this).attr("src");
				var index=src.indexOf("?");
				s.push(src.substring(0, index>-1?index:src.length));
				s.push("?");
				s.push(date.getFullYear());
				s.push(date.getMonth());
				s.push(date.getDate());
				s.push(date.getHours());
				s.push(date.getMinutes());
				s.push(date.getSeconds());
				s.push(date.getMilliseconds());
				$(this).hide().attr("src",s.join("")).fadeIn();
			});			
			
			
			
			checkParent();
			$("#accountName").keydown(keydownHandler);
			var btn=null;
			$("#loginForm").validate({
				submitHandler: function(form) {
					$(form).ajaxSubmit({
						beforeSubmit : function() {
							btn.button("loading");
						},
						success : function(responseText,
								statusText, xhr, $form) {
							//btn.button("reset");
							var l=xhr.getResponseHeader("Location");
							//location.replace(l);
							window.location.href="${pageContext.request.contextPath }/admin/index.html";
						},
						error : function(xhr, textStatus,
								errorThrown) {
							var m=$.parseJSON(xhr.responseText);
							$("#alert").empty().html(m.message).removeClass("invisible");
							btn.button("reset");
							$("#accountName").focus();
							$(".captchaImg").click();
						}
					});
				},
				rules : {
					accountName:{
						required:true
					},
					password: {
						required: true
					},
					captcha:{
						required:true
					}
					
				},
				onkeyup : false,
				messages:{
					accountName:{
						required:"用户登录账号必须填写"
					},
					password:{
						required:"登录密码必须填写"
					},
					captcha:{
						required:"验证码必须填写"
					}
				},
				focusInvalid : true,
				errorClass : "text-danger",
				validClass : "valid",
				errorElement : "small",
				errorPlacement : function(error, element) {
					error.appendTo(element.parent("div")
							.next("span.text-error"));
				}
			});
			$("#loginBut").click(function() {
				
				btn=$(this).button();
			});
			$('.carousel').carousel({
				  interval: 2000
			});
		}
		function checkParent() {
			if (window.parent.length > 0) {
				window.parent.location = "/admin/index.html";
			}
		}
	</script>
	
	
</body>
</html>
