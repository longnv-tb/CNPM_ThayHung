/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.ArrayList;
import model.BanAn;
import java.sql.*;

/**
 *
 * @author LongCoi
 */
public class BanAnDAO extends DAO{

    public BanAnDAO() {
        super();
    }
    
    public ArrayList<BanAn> getAllTable(){
        ArrayList<BanAn> result = new ArrayList<>();
        String sql = "SELECT a.id, a.ten, a.loai, a.soNguoiToiDa, a.moTa\n" +
                        "FROM banan a, bandadat b\n" +
                        "WHERE a.id = b.idBanAn;";
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                BanAn b = new BanAn();
                b.setId(rs.getInt("id"));
                b.setTen(rs.getString("ten"));
                b.setLoai(rs.getString("loai"));
                b.setSoNguoiToiDa(rs.getInt("soNguoiToiDa"));
                b.setMoTa(rs.getString("moTa"));
                
                result.add(b);
            }
//            ps.close();
//            con.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        return result;
    }
    
}
