<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	application.setAttribute("path", path);
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>用户信息</title>
</head>
<body>
	<div class="div">
		<h1><a href="${path}/user/toaddUser">添加用户</a>
		<table border="1">
			<tbody>
				<tr>
					<th>姓名</th>
					<th>密码</th>
					<th>登录时间</th>
					<th>操作</th>
				</tr>
				<c:if test="${!empty userInfos }">
					<c:forEach items="${userInfos}" var="user">
						<tr>
							<td>${user.name }</td>
							<td>${user.password }</td>
							<td>${user.loginDate }</td>
							<td><a href="${path}/user/getUser?id=${user.id }">编辑</a>
								<a href="${path}/user/delUser?id=${user.id }">删除</a>
							</td>
						</tr>
					</c:forEach>
				</c:if>
			</tbody>
		</table>
	</div>
</body>
</html>