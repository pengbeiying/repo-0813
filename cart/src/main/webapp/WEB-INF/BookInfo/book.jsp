<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>

<html>
<head>
<base href="/cart/"/>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>book</title>
</head>
<style>
	table tr{
		height:35px;
		line-height:35px;
	}
	.two{
		width:150px;
		height:35px;
		line-height：35px;
		color:#f0f;
	}
	tr{
		border-bottom:1px solid #ccc;
	}
</style>
<body>
	<div class="one">
		<h1>欢迎光临京东书城</h1>
		<table style="border-collapse: collapse;">
			<thead>
				<tr style="font-weight:600;">
					<td style="width:150px;">编号</td>
					<td style="width:300px;">标题</td>
					<td style="width:150px;">价格</td>
					<td style="width:150px;"></td>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${bookList}" var="item">
					<tr>
						<td name="bookid">${item.bookid}</td>
						<td>${item.title}</td>
						<td>${item.price}</td>
						
						<c:if test="${item.qty==0}">
							<td>售罄</td>
						</c:if>
						<c:if test="${item.qty!=0}">
							<td><a href="cartInfo/addBook.action?bookid=${item.bookid}&price=${item.price}">购买</a></td>
						</c:if>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<br/>
		<button class="two" ><a href="cartInfo/selectCart.action">查看购物车</a></button>
	</div>
</body>
</html>