/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.ArrayList;
import model.BanDaDat;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import model.BanAn;
import model.MonAn;
import model.MonAnDaGoi;
import java.util.Date;

/**
 *
 * @author LongCoi
 */
public class BanDaDatDAO extends DAO{

    public BanDaDatDAO() {
        super();
    }
    
    public ArrayList<BanDaDat> getBookedTable(){
        ArrayList<BanDaDat> list = new ArrayList<>();
        Date currentDate = Calendar.getInstance().getTime();
        String sql = "SELECT a.id as ida, a.ten as tena, a.loai, a.soNguoiToiDa, a.moTa,"
                    +"b.id as idb, b.ngayDen, b.gioDen, b.soLuongKhach "
                    +"FROM banan a, bandadat b "+
                    "WHERE a.id = b.idBanAn AND b.gioVe is null AND b.ngayDen = ?;";
        String sql_getOrderedFoods = "SELECT c.id as idc, c.ten, c.loai, c.gia, c.moTa,"+
                                    "d.id as idd, d.gia as giad, d.soLuong, d.gioGoi "+
                                    "FROM cnpm_restaurant.monan c, cnpm_restaurant.monandagoi d "+
                                    "WHERE c.id = d.idMonAn"
                                    + " AND d.idBanDaDat = ?;";
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            ps.setString(1,sdf.format(currentDate));
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                BanAn a = new BanAn();
                a.setId(rs.getInt("ida"));
                a.setTen(rs.getString("tena"));
                a.setLoai(rs.getString("loai"));
                a.setSoNguoiToiDa(rs.getInt("soNguoiToiDa"));
                a.setMoTa(rs.getString("moTa"));
                BanDaDat bd = new BanDaDat();
                bd.setId(rs.getInt("idb"));
                bd.setGioDen(rs.getTime("gioDen"));
                bd.setNgayDen(rs.getDate("ngayDen"));
                bd.setSoLuongKhach(rs.getInt("soLuongKhach"));
                bd.setBanAn(a);
                list.add(bd);
            }
            
            for(BanDaDat b:list){
                //System.out.println(b.getGioVe());
                ArrayList<MonAnDaGoi> listOF = new ArrayList<>();
                ps = con.prepareStatement(sql_getOrderedFoods);
                ps.setInt(1,b.getId());
                rs = ps.executeQuery();
                while(rs.next()){
                    MonAn m = new MonAn();
                    m.setId(rs.getInt("idc"));
                    m.setTen(rs.getString("ten"));
                    m.setLoai(rs.getString("loai"));
                    m.setGia(rs.getFloat("gia"));
                    m.setMoTa(rs.getString("moTa"));
                    MonAnDaGoi n = new MonAnDaGoi();
                    n.setId(rs.getInt("idd"));
                    n.setGia(rs.getFloat("giad"));
                    n.setGioGoi(rs.getTime("gioGoi"));
                    n.setSoLuong(rs.getInt("soLuong"));
                    n.setMonAn(m);
                    n.setThanhTien(m.getGia()*rs.getInt("soLuong"));
                    listOF.add(n);
                }
                b.setListMonAnDaGoi(listOF);
            }
            
        //    System.out.println(list.size());
        }catch(SQLException e){
            e.printStackTrace();
        }
        return list;
    }
    
    public boolean updateFoodOfTable(BanDaDat b){
        String sqlAddMonAnDaGoi = "INSERT INTO monandagoi(gia,soLuong,gioGoi,idBanDaDat,idMonAn) VALUES(?,?,?,?,?);";
        String sqlUpdateMonAnDaGoi = "UPDATE monandagoi SET soLuong = ? WHERE idMonAn = ? AND idBanDaDat = ?;";
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        boolean result = true;
        try{
            con.setAutoCommit(false);
            for(MonAnDaGoi c: b.getListMonAnDaGoi()){
                
                //insert
                if(c.getId() == 0){
                    PreparedStatement ps = con.prepareStatement(sqlAddMonAnDaGoi);
                    ps.setFloat(1, c.getGia());
                    ps.setInt(2,c.getSoLuong());
                    ps.setString(3, sdf.format(c.getGioGoi()));
                    ps.setInt(4,b.getId());
                    ps.setInt(5, c.getMonAn().getId());
                    ps.execute();
                }
                else{
                    //update
                    PreparedStatement ps = con.prepareStatement(sqlUpdateMonAnDaGoi);
                    ps.setInt(1,c.getSoLuong());
                    ps.setInt(2,c.getMonAn().getId());
                    ps.setInt(3,b.getId());
                    ps.execute();
                }
            }
            con.commit();
        }catch(SQLException e){
            result = false;
            try{
                con.rollback();
            }catch(SQLException ex){
                result = false;
                ex.printStackTrace();
            }
            e.printStackTrace();
        }finally{
            try{
                con.setAutoCommit(true);
            }catch(SQLException e){
                result = false;
                e.printStackTrace();
            }
        }
        return result;
    }
}
