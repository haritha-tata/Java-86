<%@page isErrorPage="true"%>

<body style="background-color:maroon;color:cyan;text-align:center">
<h2>
<%
 if(exception instanceof ArithmeticException)
	 out.println("ERROR: " + exception.toString());
 else if(exception instanceof ArrayIndexOutOfBoundsException)
	 out.println("Invalid Array Index : " + exception.getMessage());
 else
	 out.println("Internal Server Error");
%>
</h2>
</body>