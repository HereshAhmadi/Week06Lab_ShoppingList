<%-- 
    Document   : register
    Created on : Feb 23, 2021, 2:05:36 PM
    Author     : 699785
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register</title>
    </head>
    <body>
        <h1>Shopping List</h1>

        <form action="ShoppingList" method="post">
            <label>Username: </label><input type="text" name="username" value="">
            <input type="hidden" name="action" value="register">
            <br>
            <input type="submit" value="Register">
            
        </form>
        
        <p>${message}</p>
    </body>
</html>
