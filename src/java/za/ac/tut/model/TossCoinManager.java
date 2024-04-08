package za.ac.tut.model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 *
 * @author MemaniV
 */
public class TossCoinManager implements TossCoinInterface {
    private static String[] coin = {"Heads", "Tails"};
    
    @Override
    public String tossCoin() {
        int index;
        index = (int)Math.floor(Math.random()*2);
        return coin[index];
    }

    @Override
    public String compareGuessToToss(String userGuess, String computerToss) {
        String outcome = "Lost";
        
        if(userGuess.equals(computerToss)){
            outcome = "Won";
        }
        
        return outcome;
    }

    @Override
    public void updateGameStats(HttpServletRequest request, String outcome) {
        HttpSession session = request.getSession();
        
        if(outcome.equals("Won")){
            int numCorrectGuesses = (Integer)session.getAttribute("numCorrectGuesses");
            numCorrectGuesses++;
            session.setAttribute("numCorrectGuesses", numCorrectGuesses);
        }
        
        int cnt = (Integer)session.getAttribute("cnt");
        cnt++;
        session.setAttribute("cnt", cnt);
    }
    
}

