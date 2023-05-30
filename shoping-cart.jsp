<%-- 
    Document   : shoping-cart
    Created on : May 29, 2023, 10:36:28 AM
    Author     : szxcr
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<!DOCTYPE html>
<!DOCTYPE html>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="style.css">
    <title>checkout</title>
</head>
<body>
    <div class="container">

        <form action="payservlet" method="post">
    
            <div class="row">
    
                <div class="col">
    
                    <h3 class="title">billing address</h3>
    
                    <div class="inputBox">
                        <span>full name :</span>
                        <input type="text" name="name2" placeholder="Enter your name">
                    </div>
                    <div class="inputBox">
                        <span>email :</span>
                        <input type="email" name="mail2" placeholder="Enter your email address">
                    </div>
                    <div class="inputBox">
                        <span>address :</span>
                        <input type="text" name="adrs" placeholder="Enter your address">
                    </div>
                    <div class="inputBox">
                        <span>city :</span>
                        <input type="text" name="city" placeholder="Your city">
                    </div>
    
                    <div class="flex">
                        <div class="inputBox">
                            <span>state :</span>
                            <input type="text" name="state" placeholder="State">
                        </div>
                        <div class="inputBox">
                            <span>zip code :</span>
                            <input type="text" name="zip2" placeholder="Enter zip code">
                        </div>
                    </div>
    
                </div>
    
                <div class="col">
    
                    <h3 class="title">payment</h3>
    
                    <div class="inputBox">
                        <span>cards accepted :</span>
                        <img src="payment.png" alt="">
                    </div>
                    <div class="inputBox">
                        <span>name on card :</span>
                        <input type="text" name="ncard" placeholder="owner name">
                    </div>
                    <div class="inputBox">
                        <span>credit card number :</span>
                        <input type="number" name="cnum" placeholder="Card number">
                    </div>
                    <div class="inputBox">
                        <span>exp month :</span>
                        <input type="text" name="expm" placeholder="Expair month">
                    </div>
    
                    <div class="flex">
                        <div class="inputBox">
                            <span>exp year :</span>
                            <input type="number" name="expy" placeholder="Exiper year">
                        </div>
                        <div class="inputBox">
                            <span>CVV :</span>
                            <input type="text" name="cvv" placeholder="1234">
                        </div>
                    </div>
    
                </div>
        
            </div>
    
            <input type="submit" name="value" value="proceed to checkout" class="submit-btn">
    
        </form>
    
    </div>    
        
</body>
</html>