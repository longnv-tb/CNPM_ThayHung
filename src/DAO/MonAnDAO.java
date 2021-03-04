/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.ArrayList;
import model.MonAn;
import java.sql.*;


/**
 *
 * @author LongCoi
 */
public class MonAnDAO extends DAO{

    public MonAnDAO() {
        super();
    }
    
    public ArrayList<MonAn> searchFood(String name){
        ArrayList<MonAn> result = new ArrayList<>();
        String sql = "SELECT * FROM monan WHERE ten LIKE ?";
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, "%"+name+ "%");
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                MonAn food = new MonAn();
                food.setId(rs.getInt("id"));
                food.setTen(rs.getString("ten"));
                food.setLoai(rs.getString("loai"));
                food.setGia(rs.getFloat("gia"));
                food.setMoTa(rs.getString("moTa"));
                
                result.add(food);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return result;
    }
}
