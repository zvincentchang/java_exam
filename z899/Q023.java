package z899;

public class Q023 {
/*
 Picture Q023.png
 
 Given the HTML form:
 1. <html> 
 2. <body> 
 3. <form action="submit.jsp"> 
 4. Name: <input type="text" name="i1"><br> 
 5. Price: <input type="text" name="i2"><br> 
 6. <input type="submit"> 
 7. </form> 
 8. </body> 
 9. </html>
 Assume the product attribute does NOT yet exist in any scope. 
 Which code snippet, in submit.jsp, instantiates an instance of com.example.Product 
 that contains the results of the form submission?
  A.<jsp:useBean id="com.example.Product" /> 
    <jsp:setProperty name="product" property="*" />
  B.<jsp:useBean id="product" class="com.example.Product" /> 
     ${product.name = param.i1} ${product.price = param.i2} 
  C.<jsp:useBean id="product" class="com.example.Product"> 
     <jsp:setProperty name="product" property="name" param="i1" /> 
     <jsp:setProperty name="product" property="price" param="i2" />
     </jsp:useBean> 
  D.<jsp:useBean id="product" type="com.example.Product"> 
      <jsp:setProperty name="product" property="name" value="<%= request.getParameter( "i1" ) %>" />
      <jsp:setProperty name="product" property="price" value="<%= request.getParameter( "i2" ) %>" /> </jsp:useBean>
 
 */
}
