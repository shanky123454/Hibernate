<%@ page language="java" %>
<jsp:useBean id="student"  scope="session" class="in.com.jspdemo.Student"></jsp:useBean>
<jsp:setProperty property="id" name="student" value="1"/>
<jsp:setProperty property="name" name="student" value="Shashank"/>
<jsp:setProperty property="age" name="student" value="25"/>
<jsp:setProperty property="address" name="student" value="BLR"/> 

<%= student %> </br>

<%-- param is used to get input from request object when user fill during registering from first.html --%>
<jsp:setProperty property="id" name="student" param="id"/>
<jsp:setProperty property="name" name="student" param="name"/>
<jsp:setProperty property="age" name="student" param="age"/>
<jsp:setProperty property="address" name="student" param="address"/>

<%= student %> </br>



<%-- If java student property and request object parameter are same then --%>
 <jsp:setProperty property="*" name="student"/>

<%= student %>








