<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%response.sendRedirect("homes");
%>
<form form action="out.jsp" method="post">
  First name:
  <input type="text" name="firstname"><br>
  Last name:
  <input type="text" name="lastname"><br>
  
  

  <input type="radio" name="gender" value="male" checked> Male<br>
  <input type="radio" name="gender" value="female"> Female<br>
  <input type="radio" name="gender" value="other"> Other<br>

<input type="checkbox" name="lang1" value="Java"> Java<br>
<input type="checkbox" name="lang2" value="c#"> c#<br>
<input type="checkbox" name="lang3" value="Angular" > Angular <br>
<input type="checkbox" name="lang4" value="Python">Python<br>
<input type="checkbox" name="lang5" value="React"> React<br>
<input type="checkbox" name="lang6" value="AWS" > AWS<br>
  <button type="button">Submit</button><br>
  <button type="button">Clean</button><br>
  
  Qualification Only BE allowed<br>
  <select name="qualification">
    <option value="cs">cs</option>
    <option value="mech">mech</option>
    <option value="ele">ele</option>
  </select>
  <br><br>
</form>

</body>
</html>