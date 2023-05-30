/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package mypack;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 *
 * @author szxcr
 */
@WebServlet(name = "loginserv", urlPatterns = {"/loginserv"})
public class loginserv extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private static final String DB_URL = "jdbc:mysql://localhost:3306/logindb?useSSL=false";
    private static final String DB_USERNAME = "root";
    private static final String DB_PASSWORD = "Plm8#ssg";

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet loginserv</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet loginserv at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name1 = request.getParameter("name1");
        String passw1 = request.getParameter("passw1");
        String id = request.getParameter("id");
        
        if (isValidData(name1, passw1, id)) {
            boolean isValidCredentials = checkCredentials(name1, passw1, id);
            
            if (isValidCredentials) {
                HttpSession session = request.getSession();
                session.setAttribute("name1", name1);
                response.sendRedirect("index.html");
            } else {
                response.sendRedirect("loginpage.jsp");
            }
        } else {
            response.sendRedirect("loginpage.jsp");
        }
    }
    
    private boolean isValidData(String name1, String passw1, String id) {
        // Perform validation checks on the email, password, and id
        boolean isValid = true;
        
        if (name1 == null || name1.isEmpty()) {
            isValid = false;
        }
        
        if (passw1 == null || passw1.isEmpty()) {
            isValid = false;
        }
        
        if (id == null || id.isEmpty()) {
            isValid = false;
        }
        
        return isValid;
    }
    
    private boolean checkCredentials(String name1, String passw1, String id) {
        boolean isValid = false;
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try {
            con = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            String sql = "SELECT * FROM logtable WHERE name1 = ? AND passw1 = ? AND id = ?";
            stmt = con.prepareStatement(sql);
            stmt.setString(1, name1);
            stmt.setString(2, passw1);
            stmt.setString(3, id);
            
            rs = stmt.executeQuery();
            isValid = rs.next();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        
        return isValid;  
    }
    

 
}
