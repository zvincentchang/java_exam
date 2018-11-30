package z899;

public class Q038 {
/*
   You have a simple web application that has a single Front Controller servlet
   that dispatches to JSPs generate a variety of views. 
   Several of these views require further database processing to retrieve the necessary order object 
   using the orderID request parameter. 
   To do this additional processing, you pass the request first to a servlet that is mapped to the 
   URL pattern /WEB-INF/retrieveOrder.do. in the deployment descriptor. 
   This servlet takes two request parameters, the ordered and the jspID and the jspURL. 
   It handles the database calls to retrieve and build the complex order objects and then it dispatches to the jspURL.
   Which code snippet in the Front Controller servlet dispatches the request to the order retrieval servlet?
   A. reques.setAttribute("orderID", orderIS); 
       request.setAttribute("jspURL", jspURL); 
       RequestDispathcher view =context.getRequestDispathcher ("/WEB-INF/retrieveOrder.do"); 
       view.forward(request, response);
   B.reques.setAttribute("orderID", orderIS); 
       request.setAttribute("jspURL", jspURL); 
       Dispatcher view = request.getDispatcher ("/WEB-INF/retrieveOrder.do"); 
       View.forwardRequest (request, response); 
   C.String T="/WEB-INF/retrieveOrder.do?orderID=%d&jspURL=%s"; 
      String url = String.format (T, ordered, jspURL); 
      RequestDispathcher view= context.getRequestDispatcher (url); 
      View.forward (request, response) ; 
    D.String T= "/WEB-INF/retrieveOrder.do?orderID=%d&jspURL=%s"; 
        String url = String.format (T, ordered, jspURL); 
        Dispatcher view = context.getRequestDispatcher (url); 
        view.forwardRequest (request, response) ;

 
 
 */
}
