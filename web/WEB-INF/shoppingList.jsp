<%-- 
    Document   : shoppingList
    Created on : Feb 23, 2021, 2:06:13 PM
    Author     : 699785
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Shopping List</title>
    </head>
    <body>
        <h1>Shopping List</h1>
        <p>Hello ${username} </p>
        
        <p><a href="ShoppingList?action=logout">Logout</a></p>
        
        <form action="" method="post">
            <h2>Add Item</h2>
            <label>Add Item</label><input type="text" name="item">
            <input type="hidden" name="action" value="add">
            <input type="submit" value="Add Item">
        </form>
        
        <p>${message}</p>
        
        
    </body>
</html>
