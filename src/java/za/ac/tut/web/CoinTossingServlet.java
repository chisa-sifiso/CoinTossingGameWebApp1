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
public class CoinTossingServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
       
        TossCoinInterface tci = new TossCoinManager();
        String toss = tci.tossCoin();
        session.setAttribute("toss", toss);
        
        RequestDispatcher disp = request.getRequestDispatcher("guess_toss.jsp");
        disp.forward(request, response);
    }
}


