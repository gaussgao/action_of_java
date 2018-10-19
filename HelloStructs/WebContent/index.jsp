<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<s:form action="/d2.action">
    <s:submit value="Click Here for d2"></s:submit>
</s:form>

<s:form action="/d1.action">
    <s:submit value="Click Here for d1"></s:submit>
</s:form>

<form action="hello">
      <label for="name">Please enter your name</label><br/>
      <input type="text" name="name"/>
      <input type="submit" value="Say Hello"/>
   </form>



</body>
</html>