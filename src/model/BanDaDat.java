/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author LongCoi
 */
public class BanDaDat implements Serializable{
    private int id;
    private Date ngayDen;
    private Date gioDen;
    private Date gioVe;
    private int soLuongKhach;
    private BanAn banAn;
    private ArrayList<MonAnDaGoi> listMonAnDaGoi = new ArrayList<>();

    public BanDaDat() {
    }

    public BanDaDat(int id, Date ngayDen, Date gioDen, Date gioVe, int soLuongKhach, BanAn banAn, ArrayList<MonAnDaGoi> listMonAnDaGoi) {
        this.id = id;
        this.ngayDen = ngayDen;
        this.gioDen = gioDen;
        this.soLuongKhach = soLuongKhach;
        this.banAn = banAn;
        this.listMonAnDaGoi = listMonAnDaGoi;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getNgayDen() {
        return ngayDen;
    }

    public void setNgayDen(Date ngayDen) {
        this.ngayDen = ngayDen;
    }

    public Date getGioDen() {
        return gioDen;
    }

    public void setGioDen(Date gioDen) {
        this.gioDen = gioDen;
    }

    public Date getGioVe() {
        return gioVe;
    }

    public void setGioVe(Date gioVe) {
        this.gioVe = gioVe;
    }
    
    public int getSoLuongKhach() {
        return soLuongKhach;
    }

    public void setSoLuongKhach(int soLuongKhach) {
        this.soLuongKhach = soLuongKhach;
    }

    public BanAn getBanAn() {
        return banAn;
    }

    public void setBanAn(BanAn banAn) {
        this.banAn = banAn;
    }

    public ArrayList<MonAnDaGoi> getListMonAnDaGoi() {
        return listMonAnDaGoi;
    }

    public void setListMonAnDaGoi(ArrayList<MonAnDaGoi> listMonAnDaGoi) {
        this.listMonAnDaGoi = listMonAnDaGoi;
    }
    
    
}
