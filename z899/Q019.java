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
	 �w�q�@��Filter�@�w�n��@javax.Servlet.Filter �o�@��interface�A�Ӧ�interface��3�Ӥ�k�n��@�G
      1. public void init(FilterConfig config)
 	  2. public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
 	  3. public void destroy()

	  FilterChian�O�����O�U�@�����d�O�֡A�]�������@�Ӥ�k�s��doFilter(request,response)�N��O�а���U�h�U�@�����d�C
	  �p�G���ѧA���Ʊ�����U�@�����d�]�Ҧp���ҨS�L�^�A�i�H�z�Lrequest.getRequestDispatcher(). forward()���覡�⥦��V�C
	  
	 */
}
