package com.abc.CustomerSelfServiceSystem;

import com.abc.JDBCConnection.ConnectionClass;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;


public class Average
{
    static ArrayList<Double> list = new ArrayList();
    public void statement(int accno)
    {
        int id=CustomerLogin.customerid;
        
         try
        {
            
            Connection con=ConnectionClass.getConnected();
            
                String query1="select amount,transaction_time,transaction_type from transaction_ where account_number="+accno;
               PreparedStatement stmt1=con.prepareStatement(query1);
               ResultSet s1=stmt1.executeQuery();
               while(s1.next())
               {                  
                 LocalDate current = LocalDate.now();
                 LocalDate startDate;
                  
                 for(startDate=LocalDate.of(2018,7,1);startDate.isBefore(current);startDate.plusDays(1))
                 {
                      DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
     String d = dateFormat.format(s1.getDate(2));
                     
                     
                    
   DateTimeFormatter formatter_1=DateTimeFormatter.ofPattern("yyyy-mm-dd");
   LocalDate dt= LocalDate.parse(d,formatter_1);
                     
                     
                    
                     if(dt.isEqual(startDate))
                     {
                         int type=s1.getInt(3);
                                    
                         if(type==0)
                         {
                             String query2="update account set balance=balance - "+s1.getDouble(1)+" where account_number="+accno;
                             PreparedStatement stmt2=con.prepareStatement(query2);
                             stmt2.executeUpdate();
                             String query3="select balance from account where account_number="+accno;
                             PreparedStatement stmt3=con.prepareStatement(query3);
                             ResultSet set = stmt3.executeQuery();
                             if(set.next())
                             {
                                 list.add(set.getDouble(1));
                             }
                         }
                         else
                         {
                             String query2="update account set balance=balance + "+s1.getDouble(1)+" where account_number="+accno;
                             PreparedStatement stmt2=con.prepareStatement(query2);
                             stmt2.executeUpdate();
                             String query3="select balance from account where account_number="+accno;
                             PreparedStatement stmt3=con.prepareStatement(query3);
                             ResultSet set = stmt3.executeQuery();
                             if(set.next())
                             {
                                 list.add(set.getDouble(1));
                             }
                         
                         }
                     }
                 }
                  
                  
	
	
	//convert String to LocalDate
	                  
                
         }
            
        }
         catch(SQLException | ClassNotFoundException e)
         {
             e.printStackTrace();
         }
    }
}