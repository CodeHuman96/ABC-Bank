/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abc.customer_one_system;

/**
 *
 * @author test
 */
public class MatchFormats {
    
    String pattern="";
    boolean matchEmail(String email) {
        pattern = "^[a-z][a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,6}$";
        return email.matches(pattern);
    }

    boolean matchMobileNo(String num) {
        pattern = "^(\\+[0-9][0-9])?[0-9]{10}$";
        return num.matches(pattern);
    }

    boolean matchDOB(String date) {
        pattern = "^[0-2][0-9]/[01][0-9]/[12][0-9]{3}$";
        return date.matches(pattern);
    }
    boolean matchPIN(String pin){
        pattern = "^[0-9]{6}$";
        return pin.matches(pattern);
    }
    boolean matchPAN(String pan){
        pattern ="[A-Z]{5}[0-9]{4}[A-Z]{1}";
        return pan.matches(pattern);
    }
     
            
    

}
