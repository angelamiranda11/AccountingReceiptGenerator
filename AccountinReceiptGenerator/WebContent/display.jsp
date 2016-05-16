<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import = "model.MyPDFCreator"%>

<jsp:useBean id="or" type="model.POBean" scope="request" />

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		
	<h2> Welcome to the Laging Nasisira MRT Application <br></h2>	
	<p>The fare amount from <jsp:getProperty name="or" property="startNum"/> 
			station to <jsp:getProperty name="or" property="stopNum"/>  station is <b>P<jsp:getProperty name="or" property="price"/> </b></p>
	<p>Please remember that you have to alight at <b>STOP <jsp:getProperty name="or" property="stop"/> </b></p>
	<p>----------------------------------------------------------------------------------------------------------------------------------</p>
	<p> LIST OF FARE PROFITS </p>
	<p> 
	Total fare for all STOP 1: P<jsp:getProperty name="or" property="a"/>  <br>
	Total fare for all STOP 2: P<jsp:getProperty name="or" property="b"/> <br>
	Total fare for all STOP 3: P<jsp:getProperty name="or" property="c"/> <br>
	Total fare for all STOP 4: P<jsp:getProperty name="or" property="d"/> <br>
	Total fare for all STOP 5: P<jsp:getProperty name="or" property="e"/> <br>
	Total fare for all STOP 6: P<jsp:getProperty name="or" property="f"/><br> 
	Total fare for all STOP 7: P<jsp:getProperty name="or" property="g"/><br>
	</p>
	
	<form action="printOR.jsp" method="post">
		<%MyPDFCreator.generatePDF(or);%>
		<input type="submit" value="Go Back">	
	</form>
	<form action="index.html" method="post">
		
	</form>
</body>
</html>