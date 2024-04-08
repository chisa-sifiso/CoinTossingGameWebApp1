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
import javax.servlet.http.HttpSession;

/**
 *
 * @author MemaniV
 */
public class StartSessionServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //create a session
        HttpSession session = request.getSession(true);
        String name = request.getParameter("name");
        
        //initialize the session
        initializeSession(session, name);

        RequestDispatcher disp = request.getRequestDispatcher("session_started.jsp");
        disp.forward(request, response);
    }

    private void initializeSession(HttpSession session, String name) {
        int cnt = 0, numCorrectGuesses = 0;        
        session.setAttribute("cnt", cnt);
        session.setAttribute("numCorrectGuesses", numCorrectGuesses);
        session.setAttribute("name", name);
    }
}


