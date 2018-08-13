<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="/cart/"/>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>购物车</title>
</head>
	<style>
		tr{
			border-bottom:1px solid #ccc;
			height:35px;
			line-height:35px;
		}
	</style>
<body>
	<div>
		<h1>您的购物车</h1>
		<c:if test="${empty cartList}">
			您还没有购买任何商品，<a href="book/selectAll.action">去逛逛</a>
		</c:if>

		<c:if test="${not empty cartList}">
		<table style="border-collapse: collapse;">
			<thead>
				<tr style="font-weight:600;">
					<td style="width:100px;">编号</td>
					<td style="width:200px;">标题</td>
					<td style="width:120px;">价格</td>
					<td style="width:120px;">数量</td>
					<td style="width:100px;">小计</td>
					<td></td>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${cartList}" var="item">
					<tr>
						<td style="width:100px;">${item.cartid }</td>
						<td style="width:200px;">${item.title }</td>
						<td style="width:120px;">${item.price }</td>
						<td style="width:120px;">${item.qty }</td>
						<td style="width:100px;">${item.price*item.qty }</td>
						 <td style="width:200px;"><a href="cartInfo/delBook.action?cartid=${item.cartid }&bookid=${item.bookid }">取消购买</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<br/>
			<button><a href="book/selectAll.action">首页</a></button>
			<button><a href="cartInfo/delAll.action?bookid=${item.bookid }">清空购物车</a></button>
		</c:if>
	</div>
</body>
</html>