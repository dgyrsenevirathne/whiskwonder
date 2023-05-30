/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mypack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class payDButil {
    public static boolean insertpaytable(String name2, String mail2, String adrs, String city, String state, String zip2, String ncard, String cnum, String expm, String expy, String cvv)
    {
        boolean isSuccess = false;
        
           //connected database
         try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/logindb?useSSL=false","root","Plm8#ssg");
            Statement stmt = con.createStatement();
                
            String sql = "insert into paytable values('"+name2+"','"+mail2+"','"+adrs+"','"+city+"','"+state+"','"+zip2+"','"+ncard+"','"+cnum+"','"+expm+"','"+expy+"','"+cvv+"')";
            int rs = stmt.executeUpdate(sql);
                
            if(rs > 0){
                isSuccess = true;
            }else{
                isSuccess = false; 
            }
           
        }
         catch(Exception e){
            e.printStackTrace();
        }
         
        return isSuccess;
}
}
