package z899;

public class Q026 {
	/*
	  Given an HttpServletRequest request and an HttpServletResponse response:
	  41. HttpSession session = null; 
	  42. / / insert code here 
	  43. if (session = = null) { 
	  44. / / do something if session does not exist 
	  45. } else { 
	  46. / / do something if session exists 
	  47. }
	  To implement the design intent, which statement must be inserted at line 42?
	   A.session = response.getSession (); 
	   B.session = request.getSession (); 
	   C.session = request.getSession (true); 
	   D.session = request.getSession (false); 
	   E.session = request.getSession ("jsessionid");

      getSession都是返回當前使用者的會話對象，參數的區別在於
       參數為true，則如果“當前使用者的會話物件”為空（第一次訪問時）則建立一個新的Session物件
       參數為false，則如果“當前使用者的會話物件”為空，則返回null（即不自動建立Session物件）


	 */
}
