/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package mypack;

import jakarta.servlet.RequestDispatcher;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author szxcr
 */
@WebServlet(name = "payservlet", urlPatterns = {"/payservlet"})
public class payservlet extends HttpServlet {

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
            out.println("<title>Servlet payservlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet payservlet at " + request.getContextPath() + "</h1>");
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
        //processRequest(request, response);
        String name2 = request.getParameter("name2");
         String mail2 = request.getParameter("mail2");
         String adrs = request.getParameter("adrs");
         String city = request.getParameter("city");
         String state = request.getParameter("state");
         String zip2 = request.getParameter("zip2");
         String ncard = request.getParameter("ncard");
         String cnum = request.getParameter("cnum");
         String expm = request.getParameter("expm");
         String expy = request.getParameter("expy");
         String cvv = request.getParameter("cvv");
         
         boolean isTrue;
         isTrue = payDButil.insertpaytable(name2, mail2, adrs, city, state, zip2, ncard, cnum, expm, expy, cvv);
         
         if(isTrue == true){
             RequestDispatcher dis = request.getRequestDispatcher("paymentsuc.jsp");
             dis.forward(request, response);
         }else{
             RequestDispatcher dis2 = request.getRequestDispatcher("shoping-cart.jsp");
             dis2.forward(request, response);
    }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}