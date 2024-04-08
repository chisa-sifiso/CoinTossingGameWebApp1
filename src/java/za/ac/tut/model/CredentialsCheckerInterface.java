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
public interface CredentialsCheckerInterface {
    public boolean checkCredentialsValidity(String username, String password, HttpServletRequest request);
}
