package z899;

public class Q021 {
 /*
  When using Servlet asynchronous API if you want to dispatch the request back to a particular 
   url -"/url" within the same Servlet Context which of the following API would you use?
   A.ASyncContext.dispatch(); 
   B.AsyncContext.dispatch("/url"); 
   C.AsyncContext.dispatch(servletContext, "/url"); 
   D.AsyncContext.start(runnable); 
   E.RequestDispatcher.fotward("/url"); 
   F.RequestDispatcher.forward(servletContext, "/url"); 
   G.RequestDispatcher.include("/url");

  說明:
  AsyncContext.dispatch(ServletContext context, String path) 
   請求的位址將在給定的Context裡面（ServletContext），有可能傳入的Context與當前站帶你應用的上下文有所區別

  
  */
}
