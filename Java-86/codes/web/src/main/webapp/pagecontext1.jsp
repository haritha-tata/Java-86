<%!
  String uid;
%>
<h2>
<%
 uid = request.getParameter("txt_uid");
 out.println("Hello, "+ uid);
 pageContext.setAttribute("username", uid, PageContext.SESSION_SCOPE);
%>
</h2>
<a href="pagecontext2.jsp">Next Page</a>