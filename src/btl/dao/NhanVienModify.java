/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btl.dao;

import btl.model.CanBo;
import btl.model.NhanVien;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author adli789987
 */
public class NhanVienModify {

    /// hien thi tat ca du lieu
    public static List<NhanVien> findAll() {

        //QL du lieu dau ra
        List<NhanVien> NhanVienList = new ArrayList<>();

        // khoi tao
        Connection conn = null;
        Statement statement = null;

        try {

            // ket noi du lieu database
            conn = DriverManager.getConnection("jdbc:mysql://localhost/quanlycanbo","root","root123");

            //query
            String sql = "select *from nhanvien";
            statement = conn.createStatement();

            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                NhanVien std;
                std = new NhanVien(resultSet.getInt("MaNhanVien"),
                        resultSet.getString("HoTen"),
                        resultSet.getInt("NamSinh"),
                        resultSet.getString("GioiTinh"),
                        resultSet.getString("DiaChi"),
                        resultSet.getString("CongViec"));
                NhanVienList.add(std);
            }

        } catch (SQLException ex) {
            Logger.getLogger(NhanVienModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                    
                } catch (SQLException ex) {
                    Logger.getLogger(NhanVienModify.class.getName()).log(Level.SEVERE, null, ex);
                }

                if (conn != null) {
                    try {
                        conn.close();
                    } catch (SQLException e1) {
                        Logger.getLogger(NhanVienModify.class.getName()).log(Level.SEVERE, null, e1);
                    }
                }
            }
        }
        // ket thuc
        return NhanVienList;
    }
// ham them du lieu

    public static void insert(NhanVien std) {
        // khoi tao
        Connection conn = null;
        PreparedStatement statement = null;

        try {

            //lay tat ca danh sach sinh vien va ket noi du lieu database
            conn = DriverManager.getConnection("jdbc:mysql://localhost/quanlycanbo","root","root123");

            //query
            
            String sql = "insert into nhanvien(MaNhanVien,HoTen,NamSinh,GioiTinh,DiaChi,CongViec) value (?,?,?,?,?,?)";
            statement = conn.prepareCall(sql);
            statement.setInt(1, std.getMaNV());
            statement.setString(2, std.getHoTen());
            statement.setInt(3, std.getNamSinh());
            statement.setString(4,std.getGioiTinh());
            statement.setString(5, std.getDiaChi());
            statement.setString(6, std.getCongViec());
            //them du leu vao database
            statement.execute();

        } catch (SQLException ex) {
            Logger.getLogger(NhanVienModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(NhanVienModify.class.getName()).log(Level.SEVERE, null, ex);
                }

                if (conn != null) {
                    try {
                        conn.close();
                    } catch (SQLException e1) {
                        Logger.getLogger(NhanVienModify.class.getName()).log(Level.SEVERE, null, e1);
                    }
                }
            }
        }

    }

    // sua du lieu
    public static void update(NhanVien std) {
        // khoi tao
        Connection conn = null;
        PreparedStatement statement = null;

        try {

            //lay tat ca danh sach sinh vien va ket noi du lieu database
            conn = DriverManager.getConnection("jdbc:mysql://localhost/quanlycanbo","root","root123");

            //query
            String sql = "UPDATE nhanvien SET HoTen = ?, NamSinh = ?, GioiTinh = ?, DiaChi = ?, CongViec = ? WHERE MaNhanVien =?";
            
            statement = conn.prepareStatement(sql);
            
            statement.setString(1, std.getHoTen());
            statement.setInt(2, std.getNamSinh());
            statement.setString(3, std.getGioiTinh());
            statement.setString(4,std.getDiaChi());
            statement.setString(5, std.getCongViec());
            statement.setInt(6, std.getMaNV());

            //them du leu vao database
             statement.execute();

        } catch (SQLException ex) {
            Logger.getLogger(NhanVienModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(NhanVienModify.class.getName()).log(Level.SEVERE, null, ex);
                }

                if (conn != null) {
                    try {
                        conn.close();
                    } catch (SQLException e1) {
                        Logger.getLogger(NhanVienModify.class.getName()).log(Level.SEVERE, null, e1);
                    }
                }
            }
        }

    }

    // ham xoa du lieu
    public static void delete(int id) {
        // khoi tao
        Connection conn = null;
        PreparedStatement statement = null;

        try {

            //lay tat ca danh sach sinh vien va ket noi du lieu database
            conn = DriverManager.getConnection("jdbc:mysql://localhost/quanlycanbo","root","root123");

            //query
            String sql = "delete from nhanvien where MaNhanVien=?";
            statement = conn.prepareCall(sql);
            statement.setInt(1, id);
            statement.execute();

        } catch (SQLException ex) {
            Logger.getLogger(NhanVienModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(NhanVienModify.class.getName()).log(Level.SEVERE, null, ex);
                }

                if (conn != null) {
                    try {
                        conn.close();
                    } catch (SQLException e1) {
                        Logger.getLogger(NhanVienModify.class.getName()).log(Level.SEVERE, null, e1);
                    }
                }
            }
        }

    }

    // ham tim kiem theo ten 
    public static List<NhanVien> findByFullName(String fullname) {

        //QL du lieu dau ra
        List<NhanVien> nhanVienList = new ArrayList<>();

        // khoi tao
        Connection conn = null;
        PreparedStatement statement = null;

        try {

            // ket noi du lieu database
            conn = DriverManager.getConnection("jdbc:mysql://localhost/quanlycanbo","root","root123");

            //query
            String sql = "select *from nhanvien where HoTen like ?";
            statement = conn.prepareCall(sql);
            statement.setString(1, "%" + fullname + "%");
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                NhanVien std;
                std = new NhanVien(resultSet.getInt("MaNhanVien"),
                        resultSet.getString("HoTen"),
                        resultSet.getInt("NamSinh"),
                        resultSet.getString("GioiTinh"),
                        resultSet.getString("DiaChi"),
                        resultSet.getString("CongViec"));
                nhanVienList.add(std);
            }

        } catch (SQLException ex) {
            Logger.getLogger(NhanVienModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(NhanVienModify.class.getName()).log(Level.SEVERE, null, ex);
                }

                if (conn != null) {
                    try {
                        conn.close();
                    } catch (SQLException e1) {
                        Logger.getLogger(NhanVienModify.class.getName()).log(Level.SEVERE, null, e1);
                    }
                }
            }
        }
        // ket thuc
        return nhanVienList;
    }

}
