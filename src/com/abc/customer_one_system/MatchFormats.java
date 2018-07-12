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

    boolean matchEmail(String email) {
        String pattern="^[a-z][a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,6}$";
        if (email.matches(pattern)) {
            return true;
        }
       return false;
    }
    boolean matchMobileNo(String num){
        String pattern="^(\\+[0-9][0-9])?[0-9]{10}$";
        if(num.matches(pattern)){
            return true;
        }
        return false;
    }

}
