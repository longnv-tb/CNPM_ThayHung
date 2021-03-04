/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author LongCoi
 */
public class PhieuDatBan {
    private int id;
    private Date ngayDat;
    private Date gioDat;
    private NhanVien nhanVien;
    private KhachHang khachHang;
    private ArrayList<BanDaDat> banDaDat;

    public PhieuDatBan() {
    }

    public PhieuDatBan(int id, Date ngayDat, Date gioDat, NhanVien nhanVien, KhachHang khachHang, ArrayList<BanDaDat> banDaDat) {
        this.id = id;
        this.ngayDat = ngayDat;
        this.gioDat = gioDat;
        this.nhanVien = nhanVien;
        this.khachHang = khachHang;
        this.banDaDat = banDaDat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getNgayDat() {
        return ngayDat;
    }

    public void setNgayDat(Date ngayDat) {
        this.ngayDat = ngayDat;
    }

    public Date getGioDat() {
        return gioDat;
    }

    public void setGioDat(Date gioDat) {
        this.gioDat = gioDat;
    }

    public NhanVien getNhanVien() {
        return nhanVien;
    }

    public void setNhanVien(NhanVien nhanVien) {
        this.nhanVien = nhanVien;
    }

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }

    public ArrayList<BanDaDat> getBanDaDat() {
        return banDaDat;
    }

    public void setBanDaDat(ArrayList<BanDaDat> banDaDat) {
        this.banDaDat = banDaDat;
    }
    
    
}
