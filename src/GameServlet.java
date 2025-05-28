import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class GameServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String player1 = request.getParameter("player1");
        String player2 = request.getParameter("player2");
        String winner = request.getParameter("winner");

        try {
            Connection conn = DBUtil.getConnection();
            PreparedStatement ps = conn.prepareStatement(
                "INSERT INTO game_results (player1, player2, winner) VALUES (?, ?, ?)"
            );
            ps.setString(1, player1);
            ps.setString(2, player2);
            ps.setString(3, winner);
            ps.executeUpdate();

            request.setAttribute("winner", winner);
            RequestDispatcher rd = request.getRequestDispatcher("result.jsp");
            rd.forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}