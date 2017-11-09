<%-- 
    Document   : homepage
    Created on : 2017-11-3, 8:47:57
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <title>Homepage</title>
        <!-- 引入 Bootstrap -->
       <link href="css/style1.css" rel="stylesheet" type="text/css" media="all" />	
      <link href="css/bootstrap-theme.css" rel='stylesheet' type='text/css' />
      <link href="css/bootstrap-theme.min.css" rel='stylesheet' type='text/css' />
      <link href="css/bootstrap.css" rel='stylesheet' type='text/css' />
      <link href="css/style.css" rel='stylesheet' type='text/css' />
      <link href="css/megamenu.css" rel="stylesheet" type="text/css" media="all" />
      <link rel="stylesheet" href="css/bootstrap.min.css">
      <script type='text/javascript' src="js/jquery-1.11.1.min.js"></script>
      <script type='text/javascript' src="js/jquery.liMarquee.js"></script>
      <script type="text/javascript" src="js/megamenu.js"></script>
      <script src="js/menu_jquery.js"></script>
      <script src="js/simpleCart.min.js"> </script>
      <script src="js/bootstrap.min.js"></script>
      <meta name="viewport" content="width=device-width, initial-scale=1">
      <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
      <script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
      <script>$(document).ready(function(){$(".megamenu").megamenu();});</script>

    </head>
   <body>
<!-- header_top -->
<div class="top_bg" >
	<div class="container">
		<div class="header_top">			
                    <div class="top_left">   
                            <h2><span class="glyphicon glyphicon-envelope" style="color: white"></span> 1124824408@qq.com
				<span class="glyphicon glyphicon-earphone " style="color: white"></span> 123 4567 89</h2>
			</div>
				
		</div>
	</div>
</div>
<!-- header -->
<div class="header_bg">
<div class="container">
	<div class="header">
	<div class="head-t">
		<div class="logo">
			<a href="homepage.jsp"><img src="images/logo.png" class="img-responsive" alt=""/> </a>
		</div>
		<!-- start header_right -->
		<div class="header_right">
			<div class="rgt-bottom">
				<div class="log">
					<div class="login" >
						<div id="loginContainer"><a href="#" id="loginButton"><span >Login</span></a>
						    <div id="loginBox">                
						        <form id="loginForm" action="login_servlet"  method="post" >
						                <fieldset id="body">
						                	<fieldset>
						                          <label for="email">Email Address</label>
						                          <input type="email" name="email" id="account">
						                    </fieldset>
						                    <fieldset>
						                            <label for="password">Password</label>
						                            <input type="password" name="password" id="password">
						                     </fieldset>
						                    <input type="submit" id="login" value="Sign in">
						                	<label for="checkbox"><input type="checkbox" id="checkbox"> <i>Remember me</i></label>
						            	</fieldset>
						            <span><a href="#">Forgot your password?</a></span>
								</form>
							</div>
						</div>
					</div>
				</div>
				<div class="reg">
					<a href="register.jsp">REGISTER</a>
				</div>
<!--			<div class="cart box_1">
				<a href="checkout.jsp">
					<h3> <span class="simpleCart_total">$0.00</span> (<span id="simpleCart_quantity" class="simpleCart_quantity">0</span> items)<img src="images/bag.png" alt=""></h3>
				</a>	
				<p><a href="javascript:;" class="simpleCart_empty">(empty card)</a></p>
				<div class="clearfix"> </div>
			</div>
			<div class="create_btn">
				<a href="checkout.jsp">CHECKOUT</a>
			</div>-->
			<div class="clearfix"> </div>
		</div>
		<div class="search">
		    <form>
		    	<input type="text" value="" placeholder="search...">
				<input type="submit" value="">
			</form>
		</div>
		<div class="clearfix"> </div>
		</div>
		<div class="clearfix"> </div>
	</div>

		<!-- start header menu -->
		<ul class="megamenu skyblue">
			<li class="active grid"><a class="color1" href="homepage.jsp">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;   Home    &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;   </a></li>
                        
                        <li class="grid"><a class="color2" href="#"> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  MEN   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;   </a>
				<div class="megapanel">
					<div class="row">
						<div class="col1">
							<div class="h_nav">
								
								<ul>
									<li><a href="man.jsp">Clothes</a></li>
									<li><a href="man.jsp">Shoes</a></li>
									<li><a href="man.jsp">Cap</a></li>
									<li><a href="man.jsp">Socks</a></li>
									<li><a href="man.jsp">Watches</a></li>
									<li><a href="man.jsp">Leather shoes</a></li>
                                                                        <li><a href="man.jsp">Tie</a></li>
                                                                        <li><a href="man.jsp">Glasses</a></li>
                                                                        <li><a href="man.jsp">Sweaters</a></li>
								</ul>	
							</div>							
						</div>
						
					
    				</div>
				</li>
			<li><a class="color4" href="#">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;    WOMEN   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;   </a>
				<div class="megapanel">
					<div class="row">
						<div class="col1">
							<div class="h_nav">
								
								<ul>
									<li><a href="women.jsp">Clothes</a></li>
									<li><a href="women.jsp">Shoes</a></li>
									<li><a href="women.jsp">Cap</a></li>
									<li><a href="women.jsp">Socks</a></li>
									<li><a href="women.jsp">Watches</a></li>
									<li><a href="women.jsp">Skirts</a></li>
                                                                        <li><a href="women.jsp">Glasses</a></li>
                                                                        <li><a href="women.jsp">Sweaters</a></li>
								</ul>	
							</div>							
						</div>
						
    				</div>
				</li>				
				<li><a class="color5" href="#">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;      KIDS      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;    </a>
				<div class="megapanel">
					<div class="row">
						<div class="col1">
							<div class="h_nav">						
								<ul>
									<li><a href="kid.jsp">Clothes</a></li>
									<li><a href="kid.jsp">Shoes</a></li>
									<li><a href="kid.jsp">Cap</a></li>
									<li><a href="kid.jsp">Socks</a></li>
									<li><a href="kid.jsp">Watches</a></li>
									<li><a href="kid.jsp">Toys</a></li>
                                                                        <li><a href="kid.jsp">Glasses</a></li>
                                                                        <li><a href="kid.jsp">Sweaters</a></li>
								</ul>	
							</div>							
						</div>
                                            </div>
				</li>	
						
				<li><a class="color6" href="contact1.jsp">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;    CONTACT US  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;   </a></li>
		 </ul> 
	</div>
</div>
</div>                   
    

<div class="container" >   
  
<div id="myCarousel" class="carousel slide" data-ride="carousel" data-interval="2500">
	<!-- 轮播（Carousel）指标 -->
	<ol class="carousel-indicators">
		<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
		<li data-target="#myCarousel" data-slide-to="1"></li>
		<li data-target="#myCarousel" data-slide-to="2"></li>
                <li data-target="#myCarousel" data-slide-to="3"></li>
	</ol>   

	<!-- 轮播（Carousel）项目 -->
       
	<div class="carousel-inner">
            <div class="item active">
                <img src="images/glass1.jpg"   class="img-responsive center-block"  alt="">
            </div>
            <div class="item">
                <img src="images/glass2.jpg"  class="img-responsive center-block" alt="">
            </div>
            <div class="item">
                <img src="images/glass3.jpg"  class="img-responsive center-block" alt="">
            </div>
            <div class="item">
                <img src="images/glass4.jpg"   class="img-responsive center-block"  alt="">
            </div>
	</div>

	<!-- 轮播（Carousel）导航 -->
	<a class="carousel-control left" href="#myCarousel" data-slide="prev">‹</a>
	<a class="carousel-control right" href="#myCarousel" data-slide="next">›</a>
</div>

<!-- 控制按钮 -->


<script>
	$(function(){
	
		// 循环轮播到上一个项目
		$(".prev-slide").click(function(){
			$("#myCarousel").carousel('prev');
		});
		// 循环轮播到下一个项目
		$(".next-slide").click(function(){
			$("#myCarousel").carousel('next');
		});
		// 循环轮播到某个特定的帧 
		$(".slide-one").click(function(){
			$("#myCarousel").carousel(0);
		});
		$(".slide-two").click(function(){
			$("#myCarousel").carousel(1);
		});
		$(".slide-three").click(function(){
			$("#myCarousel").carousel(2);
		});
                $(".slide-three").click(function(){
			$("#myCarousel").carousel(3);
		});
	});
</script>
 </div>
                            
<br>

<div class="container">
    <div class="row">
        <div class="col-md-6">
            <div class="media"> 
                <video src="video/video.mp4"  height="450" controls preload="metadata"></video>
            </div>
        </div>

    <div class="col-md-6  ">     
        <div class="row">
            <div   class="col-md-3  product-left">     
	                                <div class="p-one simpleCart_shelfItem ">							
							<a href="#">
								<img src="images/n1.jpg" class="img-rounded" alt="Cinque Terre" width="177" height="220">							
							        <div class="mask">
									<span>
                                                                           Quick View
                                                                              160RMB
                                                                        </span>
								</div>
                                                        </a>                                           
					</div>
            </div>
            
            <div   class=" col-md-3  col-md-offset-1  product-left">     
	                                <div class="p-one simpleCart_shelfItem ">							
							<a href="#">
								<img src="images/n2.jpg" class="img-rounded" alt="Cinque Terre" width="177" height="220">							
							        <div class="mask">
									<span>
                                                                           Quick View
                                                                              160RMB
                                                                        </span>
								</div>                                
					</div>
              </div>
            
            <div   class="col-md-3  col-md-offset-1 product-left">     
	                                <div class="p-one simpleCart_shelfItem ">							
							<a href="#">
								<img src="images/n3.jpg" class="img-rounded" alt="Cinque Terre" width="177" height="220">							
							        <div class="mask">
									<span>
                                                                           Quick View
                                                                              160RMB
                                                                        </span>
								</div>
                                                        </a>                                  
					</div>
              </div>
        </div>  
     
        <div class="row">
            <div   class=" col-md-3   product-left">     
	                                <div class="p-one simpleCart_shelfItem ">							
							<a href="#">
								<img src="images/n4.jpg" class="img-rounded" alt="Cinque Terre" width="177" height="220">							
							        <div class="mask">
									<span>
                                                                           Quick View
                                                                              160RMB
                                                                        </span>
								</div>
                                                        </a>
                                        </div>
            </div>
            
            <div   class=" col-md-3 col-md-offset-1  product-left">     
	                                <div class="p-one simpleCart_shelfItem ">							
							<a href="#">
								<img src="images/n5.jpg" class="img-rounded" alt="Cinque Terre" width="177" height="220">							
							        <div class="mask">
									<span>
                                                                           Quick View
                                                                              160RMB
                                                                        </span>
								</div>
                                                        </a>                                
					</div>
              </div>
            
            <div   class=" col-md-3 col-md-offset-1  product-left">     
	                                <div class="p-one simpleCart_shelfItem ">							
							<a href="#">
								<img src="images/n6.jpg" class="img-rounded" alt="Cinque Terre" width="177" height="220">							
							        <div class="mask">
									<span>
                                                                           Quick View
                                                                              160RMB
                                                                        </span>
								</div>
                                                        </a>                                           
					</div>
              </div>
        </div>  
</div>
</div>


    
    <div class="special">
    <h3>The New Stores</h3>
   </div>
<div class="container">
    <div class="row ">      
        <div class="col-md-12">  
           
            <style type="text/css">

                #demo {
                    background: #FFF;
                    overflow:hidden;
                    border: 1px dashed #CCC;
                    width: auto;
                }
                #demo img {
                    border: 3px solid #F2F2F2;
                }
                #indemo {
                    float: left;
                    width: 800%;
                }
                #demo1 {
                    float: left;
                }
                #demo2 {
                    float: left;
                }

            </style>
            <!--向左滚动-->
            <div id="demo">
                <div id="indemo">
                    <div id="demo1">
                        <a href="#"><img src="images/pi3.jpg"  class="img-rounded" alt="Cinque Terre" width="180" height="220"  class="btn btn-default" data-toggle="tooltip" data-placement="top" title="hahahahahaha hello welcome!"/> </a>
                        <a href="#"><img src="images/pi4.jpg"  class="img-rounded" alt="Cinque Terre" width="180" height="220"  class="btn btn-default" data-toggle="tooltip" data-placement="top" title="hahahahahaha hello welcome!"/> </a>
                        <a href="#"><img src="images/pi5.jpg"  class="img-rounded" alt="Cinque Terre" width="180" height="220"  class="btn btn-default" data-toggle="tooltip" data-placement="top" title="hahahahahaha hello welcome!"/> </a>
                        <a href="#"><img src="images/pi6.jpg"  class="img-rounded" alt="Cinque Terre" width="180" height="220"  class="btn btn-default" data-toggle="tooltip" data-placement="top" title="hahahahahaha hello welcome!"/> </a>
                        <a href="#"><img src="images/pi7.jpg"  class="img-rounded" alt="Cinque Terre" width="180" height="220"  class="btn btn-default" data-toggle="tooltip" data-placement="top" title="hahahahahaha hello welcome!"/> </a>
                        <a href="#"><img src="images/PI8.jpg"  class="img-rounded" alt="Cinque Terre" width="180" height="220"  class="btn btn-default" data-toggle="tooltip" data-placement="top" title="hahahahahaha hello welcome!"/> </a>
                    </div>
                    <div id="demo2"></div>
                </div>
            </div>
            
<!--            Bootstrap 提示-->
            <script>
	$(function () { $("[data-toggle='tooltip']").tooltip(); });
           </script>
            
<!--            图片无缝连接-->
            <script>
            var speed=10; //数字越大速度越慢
            var tab=document.getElementById("demo");
            var tab1=document.getElementById("demo1");
            var tab2=document.getElementById("demo2");
            tab2.innerHTML=tab1.innerHTML;
            function Marquee(){
            if(tab2.offsetWidth-tab.scrollLeft<=0)
            tab.scrollLeft-=tab1.offsetWidth;
            else{
            tab.scrollLeft++;
            }
            }
            var MyMar=setInterval(Marquee,speed);
            tab.onmouseover=function() {clearInterval(MyMar);};
            tab.onmouseout=function() {MyMar=setInterval(Marquee,speed);};
       
            </script>
   
        </div>
    </div>
</div>   
  
<br><br>

<div class="foot-top">
	<div class="container">
		<div class="col-md-6 s-c">
			<li>
				<div class="fooll">
					<h5>follow us on</h5>
				</div>
			</li>
			<li>
				<div class="social-ic">
					<ul>
						<li><a href="#"><i class="facebok"> </i></a></li>
						<li><a href="#"><i class="twiter"> </i></a></li>
						<li><a href="#"><i class="goog"> </i></a></li>
						<li><a href="#"><i class="be"> </i></a></li>
						<li><a href="#"><i class="pp"> </i></a></li>
							<div class="clearfix"></div>	
					</ul>
				</div>
			</li>
				
		</div>
		<div class="col-md-6 s-c">
			<div class="stay">
						<div class="stay-left">
							<form>
								<input type="text" placeholder="Enter your email to join our newsletter" required="">
							</form>
						</div>
						<div class="btn-1">
							<form>
								<input type="submit" value="join">
							</form>
						</div>						
			</div>
		</div>			
	</div>
</div>



<br><br>


</body>
</html>
