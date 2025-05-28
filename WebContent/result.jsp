<%@ page import="java.util.*" %>
<html>
<head><title>Game Result</title></head>
<body>
  <h2>Game Over</h2>
  <p>Winner: <strong><%= request.getAttribute("winner") %></strong></p>
  <a href="index.html">Play Again</a>
</body>
</html>