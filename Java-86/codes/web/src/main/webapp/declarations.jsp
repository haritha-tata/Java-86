<%!
 String name = "edureka";

 public int add(int x, int y){
	 int sum = x + y;
	 return sum;
 }
%>
<h2>
<%
 out.println("Company Name = " + name + "<br>");
 out.println("Sum = " + add(11, 24) + "<br>");
 
 int s = add(34,12);
 out.println("Sum = " + s);
%>
</h2>