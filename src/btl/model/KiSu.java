/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btl.model;

/**
 *
 * @author adli789987
 */
public class KiSu extends CanBo{
    private String LoaiBang;
    private String NganhDT;
    
    public KiSu() {
        
    }
    public KiSu(String LoaiBang, String NganhDT) {
        this.LoaiBang = LoaiBang;
        this.NganhDT = NganhDT;
    }

    public KiSu(String LoaiBang, String NganhDT, int Ma, String HoTen, int NamSinh, String GioiTinh, String DiaChi) {
        super(Ma, HoTen, NamSinh, GioiTinh, DiaChi);
        this.LoaiBang = LoaiBang;
        this.NganhDT = NganhDT;
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
