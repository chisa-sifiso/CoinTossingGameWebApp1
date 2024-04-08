package za.ac.tut.model;

import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author MemaniV
 */
public interface TossCoinInterface {
    public String tossCoin();
    public String compareGuessToToss(String userGuess, String computerToss);
    public void updateGameStats(HttpServletRequest request, String outcome);
}

