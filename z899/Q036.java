package z899;

public class Q036 {
/*
   Given that a web application consists of two HttpServlet classes, 
   ServletA and ServletB, and the ServerletA.service method:
   20. String key = "com.example.data"; 
   21. session.setAttribute(key, "Hello"); 
   22. object value = session.getAttribute(key); 
   23. 
   Assume session is an HttpSession, and is not referenced anywhere else in ServletA. 
   Which two changes, taken together, ensure that value is equal to "Hello" on line 23? (Choose two)
   A.ensure that the ServletB.service method is synchronized 
   B.ensure that the ServletA.service method is synchronized 
   C.ensure that ServletB synchronizes on the session object when setting session attributes 
   D.enclose lines 21-22 in 
       synchronized block: synchronized(this) {
            session.setAttribute(key, "Hello"); 
            value = session.getAttribute(key); 
       }
   E.enclose lines 21-22 in synchronized block: 
       synchronized(session) { 
                 session.setAttribute(key, "Hello"); 
                 value = session.getAttribute(key);
        }

 
 
 */
}
