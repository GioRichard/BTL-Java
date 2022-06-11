/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btl.model;

/**
 *
 * @author adli789987
 */
public class CongNhan extends CanBo{
    private int bac;

     public CongNhan() {
        
    }
    public CongNhan(int bac) {
        this.bac = bac;
    }

    public CongNhan(int bac, int Ma, String HoTen, int NamSinh, String GioiTinh, String DiaChi) {
        super(Ma, HoTen, NamSinh, GioiTinh, DiaChi);
        this.bac = bac;
    }

    public int getBac() {
        return bac;
    }

    public void setBac(int bac) {
        this.bac = bac;
    }
    
}
