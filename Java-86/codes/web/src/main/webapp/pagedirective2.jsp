<%@page errorPage="handler.jsp" info="JSP to demonstrate page directive" buffer="8"%>
<%!
  int x = 10;
  int y = 5;
  //int y = 0;
  int[] marks = new int[10];
%>
<h2>
<%
 int res = x / y;

 out.println(x + " / " + y + " = " + res + "<br>");
 
 out.println(marks[0]);
 //out.println(marks[10]);
%>
<hr>
<%
 out.println(getServletInfo());
%>
</h2>