/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import java.sql.*;
/**
 *
 * @author LongCoi
 */
public class DAO {
    public static Connection con;
    public DAO(){
        if(con == null){
            String dbUrl = "jdbc:mysql://localhost:3306/cnpm_restaurant?autoReconnect=true&useSSL=false";
            String dbClass = "com.mysql.jdbc.Driver";
            
            try{
                Class.forName(dbClass);
                con = DriverManager.getConnection(dbUrl, "root", "08091999");
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
    
    public static void main(String[] args) {
        new DAO();
    }
}
