/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package za.ac.tut.web;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import za.ac.tut.model.RockPaperScissorManager;
/**
 *
 * @author Sandiso
 */
public class RockPaperScissorServlet extends HttpServlet {

   @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        char userChoice = request.getParameter("choice").charAt(0);
        
        RockPaperScissorManager rpsm =new RockPaperScissorManager();
        char computerChoice = rpsm.generateSign();
        
        String outcome = rpsm.determineWinner(userChoice, computerChoice);
        request.setAttribute("outcome", outcome);
        
        RequestDispatcher disp = request.getRequestDispatcher("outcome.jsp");
        disp.forward(request, response);
    }

}
