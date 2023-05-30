/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mypack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class mesDButil {
    public static boolean insertmestable(String name3, String mail3, String mes1)
    {
        boolean isSuccess = false;
        
           //connected database
         try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/logindb?useSSL=false","root","Plm8#ssg");
            Statement stmt = con.createStatement();
                
            String sql = "insert into mestable values('"+name3+"','"+mail3+"','"+mes1+"')";
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
