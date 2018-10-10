<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>circle calculator</title>
</head>
<body>

<jsp:useBean id="CC" scope="session" class="hjw.CCalculator" />
<% 
	double r = 0;

	try
	{
		r = Double.parseDouble(request.getParameter("r"));
	}
	catch (Exception e)
	{
      out.println("An exception occurred: " + e.getMessage());
   }

	CC.setRedius(r);
	%>
	
	<form action="circle.jsp">
	<input name="r" type="text"  value="<% out.println(CC.getRedius()); %>"/>
	<input type="submit"  value="calculate" />
</form>
	r=<% out.println(CC.getRedius()); %> <br/>
	
	C=<% out.println(CC.getLength());%> <br/>
	A=<% out.println(CC.getArea());%> <br/>
	
	
</body>
</html>