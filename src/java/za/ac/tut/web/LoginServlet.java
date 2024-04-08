/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.web;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.ac.tut.model.CredentialsCheckerInterface;
import za.ac.tut.model.CredentialsCheckerManager;

/**
 *
 * @author Student
 */
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");       
        CredentialsCheckerInterface cci = new CredentialsCheckerManager();
        
        if(cci.checkCredentialsValidity(username, password, request)){           
            RequestDispatcher disp = request.getRequestDispatcher("name_entry.html");
            disp.forward(request, response);
        } else {
            //redirect the request - display the login page again
            response.sendRedirect("login.html");
        }
    }
}
