package za.ac.tut.web;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import za.ac.tut.model.TossCoinInterface;
import za.ac.tut.model.TossCoinManager;

/**
 *
 * @author MemaniV
 */
public class GuessServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        String guess = request.getParameter("guess");
        String toss = (String)session.getAttribute("toss");
        
        TossCoinInterface tci = new TossCoinManager();
        String outcome = tci.compareGuessToToss(guess, toss);
        tci.updateGameStats(request, outcome);
        
        request.setAttribute("outcome", outcome);
        request.setAttribute("guess", guess);
        
        RequestDispatcher disp = request.getRequestDispatcher("outcome.jsp");
        disp.forward(request, response);
    }

}


