package z899;

public class Q003 {
  /*
   In a jsp-centric shopping cart application cart application to move a client's home address of Customer 
   object into the shipping address of the order object. The address data is stored in a value object class 
   called Address with properties for: street address, city, province, country, and postal code.
   Which two code snippets can be used to accomplish this goal?
   
   A.<c:set var='order' property='shipAddress' value='${client.homeAddress}' /> 
   B.<c:set target='${order}' property='shipAddress' value='${client.homeAddress}' /> 
   C.<jsp:setProperty name='${order}' property='shipAddress' value='${client.homeAddress}' /> 
   D.<c:set var='order' property='shipAddress'> <jsp:getProperty name='client' property='homeAddress' /> </c:store>
   E.<c:set target='${order}' property='shipAddress'>
         <jsp:getProperty name='client' property='homeAddress' /> </c:set>
   F.<c:setProperty name='${order}' property='shipAddress'> 
         <jsp:getProperty name='client' property='homeAddress' /> </c:setProperty>

   
   */
	
	/*	 
	 <c:set>也可以直接用來設定JavaBean的屬性或是Map物件的鍵／值，要設定JavaBean或Map物件，必須使用target屬性進行設定。
	   例如：  <c:set target="${user}" property="name" value="${param.name}"/>   
	 
	 */
}
