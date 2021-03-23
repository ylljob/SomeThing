<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>查询商品信息</title>
</head>
<body>
查询商品信息
<hr>
<hr>
<form method="post" action="${pageContext.request.contextPath}/items/findById">
    商品ID<input type="text" name="id">
    <input type="submit" value="查询">
</form>
</body>
</html>