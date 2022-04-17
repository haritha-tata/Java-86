<jsp:useBean id="prod" class="co.edureka.web.modal.Product"></jsp:useBean>

<h2>
 Product ID = <jsp:getProperty property="productId" name="prod"/> <br>
 Product Name = <jsp:getProperty property="productName" name="prod"/> <br>
 Product Price = <jsp:getProperty property="productPrice" name="prod"/>
 
<hr> 
 <jsp:setProperty property="productName" name="prod" value="Mobile Phone"/>
 Product Name = <jsp:getProperty property="productName" name="prod"/> <br>
</h2>