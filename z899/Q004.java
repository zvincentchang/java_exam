package z899;

public class Q004 {
   /*
    
    You are creating a JSP page to display a collection of data. 
    This data can be displayed in several different ways so the architect on your project decided to 
    create a generic servlet that generates a comma delimited string so that various pages can render 
    the data in different ways. 
    This servlet takes on request parameter: objoctID. 
    Assume that this servlet is mapped to the URL pattern: /WEB-INF/data.
    In the JSP you are creating, you need to split this string into its elements separated by commas and
    generate an HTML <ul> list from the data.

Which JSTL code snippet will accomplish this goal?
   A.<c:import varReader='dataString' url='/WEB-INF/data'> 
             <c:param name='objectID' value='${currentOID}' /> 
       </c:import> 
        <ul> <c:forTokens items'${dataString.split(",")}' var='item'> 
        <li>${item}</li> </c:forTokens> 
        </ul> 
   B.<c:import varReader='dataString' url='/WEB-INF/data'> 
        <c:param name='objectID' value='${currentOID}' /> 
       </c:import> 
       <ul> <c:forTokens items'${dataString}' delims=',' var='item'> <li>${item}</li> </c:forTokens> </ul> 
   C.<c:import var='dataString' url='/WEB-INF/data'> 
        <c:param name='objectID' value='${currentOID}' /> 
        </c:import>
         <ul> <c:forTokens items'${dataString.split(",")}' var='item'> <li>${item}</li> </c:forTokens> </ul> 
   D.<c:import var='dataString' url='/WEB-INF/data'> 
         <c:param name='objectID' value='${currentOID}' /> 
        </c:import> 
        <ul> <c:forTokens items'${dataString}' delims=',' var='item'> <li>${item}</li> </c:forTokens> </ul>    
    
    */
	
	/*  Code Sample
	
	<c:forTokens var="token" items="one,two,three" delims=",">
        <c:out value="${token}"/>
    </c:forTokens>
	
	
	 */
	
}
