/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abc.customer_one_system;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class MatchFormats {
    
    String pattern="";
    public boolean matchEmail(String email) {
        pattern = "^[a-z][a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,6}$";
        return email.matches(pattern);
    }

    public boolean matchMobileNo(String num) {
        pattern = "^(\\+[0-9][0-9])?[0-9]{10}$";
        return num.matches(pattern);
    }

    public boolean matchDOB(String date) {
        pattern = "^[0-3][0-9]/[01][0-9]/[12][0-9]{3}$";
        DateTimeFormatter f=DateTimeFormatter.ofPattern("dd/mm/yyyy");
        LocalDate birthDay=LocalDate.parse(date,f);
        return LocalDate.now().compareTo(birthDay) > 0;
        
        
    }
    public boolean matchPIN(String pin){
        pattern = "^[0-9]{6}$";
        return pin.matches(pattern);
    }
    public boolean matchPAN(String pan){
        pattern ="[A-Z]{5}[0-9]{4}[A-Z]{1}";
        return pan.matches(pattern);
    }
    public boolean matchName(String name){
        pattern = "[a-zA-Z ,.'-]";
        return name.matches(pattern);
    } 
    public boolean verifyDuration(String from,String to)
    {
        DateTimeFormatter f=DateTimeFormatter.ofPattern("dd/mm/yyyy");
        LocalDate fromdate=LocalDate.parse(from,f);
        LocalDate todate=LocalDate.parse(to,f);
        Duration duration = Duration.between(fromdate, todate);
        return todate.compareTo(fromdate) < 0;
    }
   
}
