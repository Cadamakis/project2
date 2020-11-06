<%@ page import="java.util.*"
        import ="java.io.*"
%>
<html>
<body>
<h1 align ="center">Insert Product</h1>
<%
	out.println("<center><h1>Product Info</h1> <br><br><br>");
	String c1 = request.getParameter("name");
        String c2 = request.getParameter("barcode");
	String c3 = request.getParameter("color");
	String c4 = request.getParameter("description");

	out.print("NAME        :  "+c1+"<br>");
	out.print("BARCODE       :  "+c2+"<br>");
	out.print("COLOR       :  "+c3+"<br>");
	ut.print("DESCRIPTION               :"+c4+"<br></center>");
%>
</body>
</html>