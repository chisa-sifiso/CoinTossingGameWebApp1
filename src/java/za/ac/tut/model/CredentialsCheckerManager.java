/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.model;

import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author Student
 */
public class CredentialsCheckerManager implements CredentialsCheckerInterface {

    @Override
    public boolean checkCredentialsValidity(String username, String password, HttpServletRequest request) {
        boolean isValid = false;
        
        String validUsername = request.getServletContext().getInitParameter("valid_username");
        String validPassword = request.getServletContext().getInitParameter("valid_password");
        
        if(username.equals(validUsername) && password.equals(validPassword)){
            isValid = true;
        }
        
        return isValid;
    }
    
}


