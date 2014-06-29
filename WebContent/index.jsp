<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
  Compare model, req.params, req.attribute, session.attribute:<br />
  
  <%--  --%>
  <h3>params uname(set in model): **********${params.uname}</h3>
   <h3>request uname(model): **********${requestScope.uname}</h3>
   <h3>session uname(model): **********${sessionScope.uname}</h3>
   
   <h3>get request message(set in model): **********${requestScope.message}</h3>
   <h3>get session message(set in model): **********${sessionScope.message}</h3>
   
   <h3>get request message(set in request): **********${requestScope.requ}</h3>
   <h3>get session message(set in session): **********${sessionScope.sess}</h3>
   
   
  </body>
</html>

