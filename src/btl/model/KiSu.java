/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btl.model;

/**
 *
 * @author adli789987
 */
public class KiSu {
    private int MaKS;
     private String HoTen;
    private int NamSinh;
    private String GioiTinh;
    private String DiaChi;
    private String LoaiBang;
    private String NganhDT;

    public KiSu() {
    }

    public KiSu(int MaKS, String HoTen, int NamSinh, String GioiTinh, String DiaChi, String LoaiBang, String NganhDT) {
        this.MaKS = MaKS;
        this.HoTen = HoTen;
        this.NamSinh = NamSinh;
        this.GioiTinh = GioiTinh;
        this.DiaChi = DiaChi;
        this.LoaiBang = LoaiBang;
        this.NganhDT = NganhDT;
    }

    public int getMaKS() {
        return MaKS;
    }

    public void setMaKS(int MaKS) {
        this.MaKS = MaKS;
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

    public String getLoaiBang() {
        return LoaiBang;
    }

    public void setLoaiBang(String LoaiBang) {
        this.LoaiBang = LoaiBang;
    }

    public String getNganhDT() {
        return NganhDT;
    }

    public void setNganhDT(String NganhDT) {
        this.NganhDT = NganhDT;
    }
    
    
    
}
