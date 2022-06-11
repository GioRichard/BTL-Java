/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btl.model;

/**
 *
 * @author adli789987
 */
public class CanBo {
    private int Ma;
    private String HoTen;
    private int NamSinh;
    private String GioiTinh;
    private String DiaChi;

    public CanBo() {
    }

    public CanBo(int Ma, String HoTen, int NamSinh, String GioiTinh, String DiaChi) {
        this.Ma = Ma;
        this.HoTen = HoTen;
        this.NamSinh = NamSinh;
        this.GioiTinh = GioiTinh;
        this.DiaChi = DiaChi;
    }

    public int getMa() {
        return Ma;
    }

    public void setMa(int Ma) {
        this.Ma = Ma;
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

    
    
}
