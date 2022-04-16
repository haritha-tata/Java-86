<%!
 String name = "edureka";

 public int add(int x, int y){
	 int sum = x + y;
	 return sum;
 }
%>
<h2>
Company Name = <%=name %>
<br>
<%="Sum = " + add(13,12) %>
<br>
Sum = <%=add(10,20) %>
</h2>