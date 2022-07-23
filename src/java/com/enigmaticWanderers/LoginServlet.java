/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.enigmaticWanderers;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author SURAJ BORA
 */
public class LoginServlet extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet LoginServlet</title>");   
            out.println("<style>/* Bordered form */\n" +
"form {\n" +
"  border: 3px solid #f1f1f1;\n" +
"}\n" +
"\n" +
"/* Full-width inputs */\n" +
"input[type=text], input[type=password] {\n" +
"  width: 100%;\n" +
"  padding: 12px 20px;\n" +
"  margin: 8px 0;\n" +
"  display: inline-block;\n" +
"  border: 1px solid #ccc;\n" +
"  box-sizing: border-box;\n" +
"}\n" +
"\n" +
"/* Set a style for all buttons */\n" +
"button {\n" +
"  background-color: #04AA6D;\n" +
"  color: white;\n" +
"  padding: 14px 20px;\n" +
"  margin: 8px 0;\n" +
"  border: none;\n" +
"  cursor: pointer;\n" +
"  width: 100%;\n" +
"}\n" +
"\n" +
"/* Add a hover effect for buttons */\n" +
"button:hover {\n" +
"  opacity: 0.8;\n" +
"}\n" +
"\n" +
"/* Extra style for the cancel button (red) */\n" +
".cancelbtn {\n" +
"  width: auto;\n" +
"  padding: 10px 18px;\n" +
"  background-color: #f44336;\n" +
"}\n" +
"\n" +
"/* Center the avatar image inside this container */\n" +
".imgcontainer {\n" +
"  text-align: center;\n" +
"  margin: 24px 0 12px 0;\n" +
"}\n" +
"\n" +
"/* Avatar image */\n" +
"img.avatar {\n" +
"  width: 40%;\n" +
"  border-radius: 50%;\n" +
"}\n" +
"\n" +
"/* Add padding to containers */\n" +
".container {\n" +
"  padding: 16px;\n" +
"}\n" +
"\n" +
"/* The \"Forgot password\" text */\n" +
"span.psw {\n" +
"  float: right;\n" +
"  padding-top: 16px;\n" +
"}\n" +
"\n" +

"@media screen and (max-width: 300px) {\n" +
"  span.psw {\n" +
"    display: block;\n" +
"    float: none;\n" +
"  }\n" +
"  .cancelbtn {\n" +
"    width: 100%;\n" +
"  }\n" +
"}</style>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1><center><b><u>LOGIN PAGE</b></u></center></h1>");
            out.println("\n" +
"            <form action=\"WelcomeServlet\" method=\"post\">\n" +


"  <div class=\"container\">\n" +
"    <label for=\"uname\"><b>Email</b></label>\n" +
"    <input id = 'uname' type=\"text\" placeholder=\"Enter User Email\" name=\"uname\" required>\n" +
"\n" +
"    <label for=\"psw\"><b>Password</b></label>\n" +
"    <input id=' psw'  \" type=\"password\" placeholder=\"Enter Password\" name=\"psw\" required>\n" +
"\n" +
"    <button type=\"submit\">Login</button>\n" +
"  </div>\n" +
"\n" +
"  <div class=\"container\" style=\"background-color:#f1f1f1\">\n" +
"    <button type=\"reset\" class=\"cancelbtn\">RESET</button>\n" +

"  </div>\n" +
"</form>");
            
            
            
            
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
        processRequest(request, response);
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
