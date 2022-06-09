/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btl.model;

/**
 *
 * @author adli789987
 */
public class CongNhan {
    private  int MaCN;
    private String HoTen;
    private int NamSinh;
    private String GioiTinh;
    private String DiaChi;
    private int bac;

    public CongNhan() {
    }

    public CongNhan(int MaCN, String HoTen, int NamSinh, String GioiTinh, String DiaChi, int bac) {
        this.MaCN = MaCN;
        this.HoTen = HoTen;
        this.NamSinh = NamSinh;
        this.GioiTinh = GioiTinh;
        this.DiaChi = DiaChi;
        this.bac = bac;
    }

    public int getMaCN() {
        return MaCN;
    }

    public void setMaCN(int MaCN) {
        this.MaCN = MaCN;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public int getNamSinh() {
        return NamSinh;
    }

    public void setNamSinh(int NamSinh) {
        this.NamSinh = NamSinh;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public int getBac() {
        return bac;
    }

    public void setBac(int bac) {
        this.bac = bac;
    }
    
}
