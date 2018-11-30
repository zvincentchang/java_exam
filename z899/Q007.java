package z899;

public class Q007 {

	/*
	 
	 Given the element from the web application deployment descriptor:
    <jsp-property-group> 
        <url-pattern>/main/page1.jsp</url-pattern> 
        <scripting-invalid>true</scripting-invalid>
     </jsp-property-group>
   And given that /main/page1.jsp contains:
     <% int i = 12; %> <b> <%= i %> </b>
   What is the result?
   A.<b> <b> 
   B.<b> l2 </b> 
   C.The JSP fails to execute. 
   D.<% int i = 12 %> <b> <%= i % > < b> 
	 
	 */
	
	
	
	/*
	 <jsp-property-group>元素主要有八個子元素，它們分別為：
    1.<description>：設定的說明；
    2.<display-name>：設定名稱；
    3.<url-pattern>：設定值所影響的範圍，如：/CH2 或 /*.jsp；
    4.<el-ignored>：若為true，表示不支援EL 語法；
    5.<scripting-invalid>：若為true，表示不支援<% scripting %>語法；
    6.<page-encoding>：設定JSP 網頁的編碼；
    7.<include-prelude>：設置JSP 網頁的抬頭，副檔名為.jspf；
    8.<include-coda>：設置JSP 網頁的結尾，副檔名為.jspf。	  
	 
	<jsp-config>
    <taglib>
        <taglib-uri>Taglib</taglib-uri>
        <taglib-location>/WEB-INF/tlds/MyTaglib.tld</taglib-location>
    </taglib>
    <jsp-property-group>
        <description>Special property group for JSP Configuration JSP example.</description>
        <display-name>JSPConfiguration</display-name>
        <url-pattern>/jsp/* </url-pattern>
        <el-ignored>true</el-ignored>
        <page-en8coding>UTF-8</page-encoding>
        <scripting-invalid>true</scripting-invalid>
        <include-prelude>/include/prelude.jspf</include-prelude>
        <include-coda>/include/coda.jspf</include-coda>
    </jsp-property-group>
</jsp-config>
	
	*/
	
	
}
