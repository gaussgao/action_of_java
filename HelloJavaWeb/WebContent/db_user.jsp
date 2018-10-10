<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>circle calculator</title>
</head>
<body>

<jsp:useBean id="DB" scope="session" class="hjw.CDatabaseUser" />
<% 
	String sql = "select * from user;";
	
	String rs = "[]";

	try
	{
		rs = DB.getResultSet(sql);
	}
	catch (Exception e)
	{
      out.println("An exception occurred: " + e.getMessage());
    }

	
	
	%>
	
	<br/>
	
	user table content as bellow:
	<pre>
	
		<% out.println(rs);%> 

	</pre>
	
	
	
</body>
</html>