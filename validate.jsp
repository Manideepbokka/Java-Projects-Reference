<html>
<head>
<title>JSP Test Page</title>
</head>
<body>
<%
 String str1=request.getParameter("t1");
 String str2=request.getParameter("t2");
 if(str1.equalsIgnoreCase("MANIDEEP") && str2.equals("BOKKA")) 
 {    
 out.println("Thankyou, you are VALID");     
 }  
 else 
 {   
 out.println("Sorry, you are INVALID");   
 }
 %>
 </body>
</html>