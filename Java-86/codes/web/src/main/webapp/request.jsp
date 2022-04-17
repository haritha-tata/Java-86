<%!
 String uid;
 String pwd;
%>
<h2>
<%
  uid = request.getParameter("txt_uid");
  pwd = request.getParameter("txt_pwd");
  
  out.println("User Name = " + uid + "<br>");
  out.println("Password = " + pwd);
%>
<hr>
Server Name = <%=request.getServerName() %> <br>
Server Port = <%=request.getServerPort() %> <br>
Protocol = <%=request.getProtocol() %> <br>
Method = <%=request.getMethod() %> <br>
Content Type = <%=request.getContentType() %> <br>
content Size = <%=request.getContentLength() %> <br>
Application Name = <%=request.getContextPath() %><br>
URL = <%=request.getRequestURL() %> <br>
URI =<%=request.getRequestURI() %>
</h2>