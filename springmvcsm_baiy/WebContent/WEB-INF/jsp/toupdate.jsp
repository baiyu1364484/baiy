<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="update" method="post">
	<input type="hidden" name="sid" value="${stu.sid }" /><br/>
	姓名:<input type="text" name="sname" value="${stu.sname }"/><br/>
	性别:<input type="text" name="ssex" value="${stu.ssex }"/><br/>
	年龄:<input type="text" name="sage" value="${stu.sage }"/><br/>
	<input type="submit" name="修改"/><br/>
	</form>
</body>
</html>