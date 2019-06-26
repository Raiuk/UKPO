<%--
  Created by IntelliJ IDEA.
  User: Mi
  Date: 01.12.2018
  Time: 9:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <h1>Регистрация</h1>



  <form action="${pageContext.request.contextPath}/processcustomer" method="post">
    <label for="firstname">Имя : </label>
    <input type="text" name="firstname" id="firstname" value="${firstname}">
    <label for="lastname">Фамилия: </label>
      <input type="text" name="lastname" id="lastname" value="${lastname}">
      <label for="email">Email: </label>
      <input type="text" name="email" id="email" value="${email}">
      <input type="submit" name="signup" value="Sign Up">
  </form>

  <form name="test" method="post" action="input1.php">
    <p><b>Крестики-нолики:</b><br>
      <input type="text" size="1">
      <input type="text" size="1">
      <input type="text" size="1">
      <input type="text" size="1">
      <input type="text" size="1">
    </p>
    <p>
      <input type="text" size="1">
      <input type="text" size="1">
      <input type="text" size="1">
      <input type="text" size="1">
      <input type="text" size="1">
    </p>
    <p>
      <input type="text" size="1">
      <input type="text" size="1">
      <input type="text" size="1">
      <input type="text" size="1">
      <input type="text" size="1">
    </p>
    <p>
      <input type="text" size="1">
      <input type="text" size="1">
      <input type="text" size="1">
      <input type="text" size="1">
      <input type="text" size="1">
    </p>
    <p>
      <input type="text" size="1">
      <input type="text" size="1">
      <input type="text" size="1">
      <input type="text" size="1">
      <input type="text" size="1">
    </p>

    <p>Результат<Br>
      <input type="text2" size="40"></input></p>
    <p><input type="button" value="Расчитать">
      <input type="reset" value="Отмена"></p>
  </form>

  </body>
</html>
