/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abc.customer_one_system;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author test
 */
public class MatchFormats {

    String pattern = "";

    public boolean matchEmail(String email) {
        pattern = "^[a-z][a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,6}$";
        return email.matches(pattern);
    }

    public boolean matchMobileNo(String num) {
        pattern = "^(\\+[0-9][0-9])?[1-9][0-9]{9}$";
        return num.matches(pattern);
    }

    public boolean matchDOB(String date) {
        pattern = "^[0-3][0-9]/[01][0-9]/[12][0-9]{3}$";
        if (!date.matches(pattern)) {
            return false;
        }
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate birthDay = LocalDate.parse(date, f);
        return LocalDate.now().compareTo(birthDay) > 0;
    }

    public boolean matchPIN(String pin) {
        pattern = "^[0-9]{6}$";
        return pin.matches(pattern);
    }

    public boolean matchPAN(String pan) {
        pattern = "[A-Z]{5}[0-9]{4}[A-Z]{1}";
        return pan.matches(pattern);
    }

    public boolean matchName(String name) {
<<<<<<< HEAD
       pattern = "[a-zA-Z .'-]+";
=======
<<<<<<< HEAD


        pattern = "[a-z A-Z .'-]+";

        pattern = "[a-zA-Z .'-]+";


       pattern = "[a-zA-Z .'-]+";

=======
       pattern = "[a-zA-Z .'-]+";
<<<<<<< HEAD

       return name.matches(pattern);
=======
>>>>>>> 0da96444630332a19ebe6e1acd024a3e02d5ea28
>>>>>>> a7b0bfafca7f0a5b3c47470db1704226a4e0ddb2
        return name.matches(pattern);
>>>>>>> 25ab52da82de94970c65aa5d01a0278cdf125456
    }
    public boolean matchAccountNumber(String accNo){
        pattern ="[0-9]{10}";
        return accNo.matches(pattern);
    }

    public boolean verifyDuration(String from, String to) {
        pattern = "^[0-3][0-9]/[01][0-9]/[12][0-9]{3}$";
        if (!from.matches(pattern) || !to.matches(pattern)) {
            return false;
        }
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fromdate = LocalDate.parse(from, f);
        LocalDate todate = LocalDate.parse(to, f);
        return todate.compareTo(fromdate) > 0;
    }
    public boolean matchDate(String date){
        pattern = "^([0][1-9]|[12][0-9]|3[01])/(0[1-9]|1[012])/[12][0-9]{3}$";
        boolean flag=true;
        try{
            if (!date.matches(pattern)) { flag=false;}
        }
        catch(Exception e){ flag=false;}
        return flag;
    }
}
