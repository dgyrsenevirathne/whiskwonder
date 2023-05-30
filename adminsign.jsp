<%-- 
    Document   : adminsign
    Created on : May 29, 2023, 12:03:57 PM
    Author     : szxcr
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="styles.css">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
  <link href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
  
    <title>admin</title>
</head>
<body>
<div class="container">
    <div class="row px-3">
        <div class="col-lg-10 col-xl-9 card flex-row mx-auto px-0">
            <div class="img-left d-none d-md-flex"></div>


            <div class="card-body">
                <h2 class="title text-center mt-4">
                    Wellcome to Tharindies cakes
                </h2>
                <form  action="admininsert" method="post" class="form-box px-3">
                    <div class="form-input">
                        <span><i class="fa fa-user"></i></span>
                        <input type="text" name="name1" placeholder="User Name" tabindex="10" required> 
                    </div>

                    <div class="form-input">
                        <span><i class="fa fa-envelope-o"></i></span>
                        <input type="text" name="mail1" placeholder=" E-Mail address"  required> 
                    </div>

                    <div class="form-input">
                        <span><i class="fa fa-key"></i></span>
                        <input type="password" name="passw1" placeholder=" Password"  required> 
                    </div>

                    <div class="form-input">
                        <span><i class="fa fa-key"></i></span>
                        <input type="password" name="compassw1" placeholder=" Conform Password"  required> 
                    </div>

                    

                    <div class="form-input">
                        <span><i class="fa fa-user"></i></span>
                        <input type="text" name="id" placeholder="ID number"  required> 
                    </div>

                    <div class="mb-3">
                       <button type="submit" name="submit" value="submit" class="btn btn-block text-uppercase">
                        Sign UP
                       </button>
                    </div>

                    <div class="text-right">
                        <a href="#" class="forget-link">
                            Forget Passwordd
                        </a>
                    </div>

                    <div class="text-center mb-3">
                       Or sign in with
                    </div>
                     
                    <div class="row mb-3">
                        <div class="col-4">
                            <a href="#" class="btn btn-block  btn-sociaal btn-facebook">
                                Facebook
                            </a>
                        </div>
                    

                    
                        <div class="col-4">
                            <a href="#" class="btn btn-block  btn-sociaal btn-google">
                                Google
                            </a>
                        </div>
                   

                    
                        <div class="col-4">
                            <a href="#" class="btn btn-block  btn-sociaal btn-twitter">
                                Twitter
                            </a>
                        </div>
                    </div>

                    <hr class="my-4">

                    
                    
                    
                    
                    
                    
                </form>
            </div>
        </div>
    </div>
</div>
    
</body>
</html>
