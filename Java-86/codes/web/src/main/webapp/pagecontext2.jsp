<%!
  String uid;
%>
<h2>
<%
 //uid = request.getParameter("txt_uid");
 uid = pageContext.getAttribute("username", PageContext.SESSION_SCOPE).toString(); 
 out.println("Hello, "+ uid);
%>