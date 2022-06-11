/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btl.model;

/**
 *
 * @author adli789987
 */
public class NhanVien extends CanBo{
    private String CongViec;

    public NhanVien() {
       
    }
    
    public NhanVien(String CongViec) {
        this.CongViec = CongViec;
    }

    public NhanVien(String CongViec, int Ma, String HoTen, int NamSinh, String GioiTinh, String DiaChi) {
        super(Ma, HoTen, NamSinh, GioiTinh, DiaChi);
        this.CongViec = CongViec;
    }

    public String getCongViec() {
        return CongViec;
    }

    public void setCongViec(String CongViec) {
        this.CongViec = CongViec;
    }
    
    
}
