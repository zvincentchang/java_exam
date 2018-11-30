package z899;

public class Q019 {
/*
 You want to create a filter for your web application and your filter will implement javax.servlet.Filter.
Which two statements are true? (Choose two)
A.Your filter class must implement an init method and a destroy method. 
B.Your filter class must also implement javax.sarvlat.FilterChain. 
C.When your filter chains to the next filter, it should pass the same arguments it received in its doFilter method. 
D.The method that your filter invokes on the object it received that implements javax.servlet.FilterChain 
    can invoke either another filter or a servlet. 
E.Your filter class must implement a doFilter method that takes, among other things, 
    an HttpServletRequest object and an HttpServletresponse object.

 
 */
	
	/*
	 定義一個Filter一定要實作javax.Servlet.Filter 這一個interface，而此interface有3個方法要實作：
      1. public void init(FilterConfig config)
 	  2. public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
 	  3. public void destroy()

	  FilterChian記錄的是下一個關卡是誰，因此它有一個方法叫做doFilter(request,response)意思是請執行下去下一個關卡。
	  如果今天你不希望執行到下一個關卡（例如驗證沒過），可以透過request.getRequestDispatcher(). forward()的方式把它轉向。
	  
	 */
}
