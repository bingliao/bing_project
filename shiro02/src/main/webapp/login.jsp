<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户登录</title>
</head>
<body>
<div>
    <font color="red">${errorInfo }</font>
</div>
<form action="login" method="post">
    用户名:<input type="text" name="userName"/><br/>
    密码:<input type="password" name="password"/><br/>
    <input type="submit" value="登录"/>
</form>
</body>
</html>
