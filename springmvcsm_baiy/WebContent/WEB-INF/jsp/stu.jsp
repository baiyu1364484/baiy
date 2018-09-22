<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-1.8.3.min.js"></script>
<script type="text/javascript">
	function ajaxDelete(sid){
		$.ajax({
			url:'delete?sid=' +sid,
			type:'get',
			success:function(data){
				if(data == "1"){
					$("#"+sid).remove();
				}
			}
		});
	}
</script>
</head>
<body>

	<table border="1" cellspacing="0" align="center" width="500px" style="text-align: center;border:1px solid red">
		<tr>
			<td>编号</td>
			<td>名字</td>
			<td>性别</td>
			<td>年龄</td>
			<td colspan="3">操作</td>
		</tr>
		<c:forEach items="${list}" var="stu">
			<tr id="${stu.sid }">
			<td>${stu.sid }</td>
			<td>${stu.sname }</td>
			<td>${stu.ssex }</td>
			<td>${stu.sage }</td>
			<td>
				<a href="javascript:ajaxDelete(${stu.sid })">删除</a>
				<a href="selOne?sid=${stu.sid }">修改</a>
			</td>
			</tr>
		</c:forEach>
		
				<a href="toAdd">添加</a>
	</table>
</body>
</html>