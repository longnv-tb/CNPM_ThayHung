/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author LongCoi
 */
public class MonAnDaGoi implements Serializable{
    private int id;
    private float gia;
    private int soLuong;
    private float thanhTien;
    private Date gioGoi;
    private MonAn monAn;

    public MonAnDaGoi() {
    }

    public MonAnDaGoi(int id,float gia, int soLuong, float thanhTien, Date gioGoi, MonAn monAn) {
        this.id = id;
        this.gia = gia;
        this.soLuong = soLuong;
        this.thanhTien = thanhTien;
        this.gioGoi = gioGoi;
        this.monAn = monAn;
    }

    public float getGia() {
        return gia;
    }

    public void setGia(float gia) {
        this.gia = gia;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public float getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(float thanhTien) {
        this.thanhTien = thanhTien;
    }

    public Date getGioGoi() {
        return gioGoi;
    }

    public void setGioGoi(Date gioGoi) {
        this.gioGoi = gioGoi;
    }

    public MonAn getMonAn() {
        return monAn;
    }

    public void setMonAn(MonAn monAn) {
        this.monAn = monAn;
    }
    
    
}
