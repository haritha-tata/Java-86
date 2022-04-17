<jsp:useBean id="prod" class="co.edureka.web.modal.Product"></jsp:useBean>

<jsp:setProperty name="prod" property="*"/>

<h2>
 Product ID = <jsp:getProperty property="productId" name="prod"/> <br>
 Product Name = <jsp:getProperty property="productName" name="prod"/> <br>
 Product Price = <jsp:getProperty property="productPrice" name="prod"/>
</h2> 
<%
 String pname = prod.getProductName();
 out.println(pname);
%>