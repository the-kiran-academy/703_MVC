<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<link href="/addproduct.css" rel="stylesheet">
<!------ Include the above in your HEAD tag ---------->

${msg}

  <form action="add-product" method="post">
<div class="container register">
                <div class="row">
                    <div class="col-md-3 register-left">
                        <img src="https://image.ibb.co/n7oTvU/logo_white.png" alt=""/>
                        <h3>Welcome</h3>
                        <p>You are 30 seconds away from earning your own money!</p>
                     
                    </div>
                    
                  
                    <div class="col-md-9 register-right">
                        
                        <div class="tab-content" id="myTabContent">
                            <div class="tab-pane fade show active" id="home" role="tabpanel" aria-labelledby="home-tab">
                                <h3 class="register-heading">ADD PRODUCT</h3>
                                <div class="row register-form">
                                    <div class="col-md-12">
                                        <div class="form-group">
                                            <input type="text" class="form-control" placeholder="Product Name *" value="" name="productName"/>
                                        </div>
                                        <div class="form-group">
                                            <input type="number" class="form-control" placeholder="Product QTY*" value="" name="productQty"/>
                                        </div>
                                        <div class="form-group">
                                            <input type="number" class="form-control" placeholder="Product Price *" value="" name="productPrice"/>
                                        </div>
                                        
                                        <div class="form-group">
                                           <input type="submit" class="btnRegister"  value="Add Product"/>
                                           
                                          
                                           
                                        </div>
                                        <div class="form-group">
                                        <a href="get-all-product" class="btnRegister">GET ALL PRODUCT</a>
                                        </div>
                                         
                                        
                                    </div>
                                   
                                </div>
                            </div>
                           
                        </div>
                       
                    </div>
                    
                    
                    
                </div>

            </div>
            </form>