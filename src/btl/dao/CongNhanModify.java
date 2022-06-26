/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btl.dao;

import btl.model.CongNhan;
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
public class CongNhanModify {

    /// hien thi tat ca du lieu
    public static List<CongNhan> findAll() {

        //QL du lieu dau ra
        List<CongNhan> CongNhanList = new ArrayList<>();

        // khoi tao
        Connection conn = null;
        Statement statement = null;

        try {

            // ket noi du lieu database
            conn = DriverManager.getConnection("jdbc:mysql://localhost/quanlycanbo","root","root123");

            //query
            String sql = "select *from congnhan";
            statement = conn.createStatement();

            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                CongNhan std;
                std = new CongNhan( resultSet.getInt("Bac"),
                        resultSet.getInt("MaCongNhan"),
                        resultSet.getString("HoTen"),
                        resultSet.getInt("NamSinh"),
                        resultSet.getString("GioiTinh"),
                        resultSet.getString("DiaChi")
                       );
                CongNhanList.add(std);
            }

        } catch (SQLException ex) {
            Logger.getLogger(CongNhanModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                    
                } catch (SQLException ex) {
                    Logger.getLogger(CongNhanModify.class.getName()).log(Level.SEVERE, null, ex);
                }

                if (conn != null) {
                    try {
                        conn.close();
                    } catch (SQLException e1) {
                        Logger.getLogger(CongNhanModify.class.getName()).log(Level.SEVERE, null, e1);
                    }
                }
            }
        }
        // ket thuc
        return CongNhanList;
    }
// ham them du lieu

    public static void insert(CongNhan std) {
        // khoi tao
        Connection conn = null;
        PreparedStatement statement = null;

        try {

            //lay tat ca danh sach sinh vien va ket noi du lieu database
            conn = DriverManager.getConnection("jdbc:mysql://localhost/quanlycanbo","root","root123");

            //query
            
            String sql = "insert into congnhan(MaCongNhan,Bac,HoTen,GioiTinh,DiaChi,NamSinh) value (?,?,?,?,?,?)";
            statement = conn.prepareCall(sql);
            statement.setInt(1, std.getMa());
            statement.setInt(2, std.getBac());
            statement.setString(3, std.getHoTen());
            statement.setString(4,std.getGioiTinh());
            statement.setString(5, std.getDiaChi());
            statement.setInt(6, std.getNamSinh());
            //them du leu vao database
            statement.execute();

        } catch (SQLException ex) {
            Logger.getLogger(CongNhanModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(CongNhanModify.class.getName()).log(Level.SEVERE, null, ex);
                }

                if (conn != null) {
                    try {
                        conn.close();
                    } catch (SQLException e1) {
                        Logger.getLogger(CongNhanModify.class.getName()).log(Level.SEVERE, null, e1);
                    }
                }
            }
        }

    }

    // sua du lieu
    public static void update(CongNhan std) {
        // khoi tao
        Connection conn = null;
        PreparedStatement statement = null;

        try {

            //lay tat ca danh sach sinh vien va ket noi du lieu database
            conn = DriverManager.getConnection("jdbc:mysql://localhost/quanlycanbo","root","root123");

            //query
            String sql = "UPDATE congnhan SET HoTen = ?, NamSinh = ?, GioiTinh = ?, DiaChi = ?, Bac = ? WHERE MaCongNhan =?";
            
            statement = conn.prepareStatement(sql);
            
            statement.setString(1, std.getHoTen());
            statement.setInt(2, std.getNamSinh());
            statement.setString(3, std.getGioiTinh());
            statement.setString(4,std.getDiaChi());
            statement.setInt(5, std.getBac());
            statement.setInt(6, std.getMa());

            //them du leu vao database
             statement.execute();

        } catch (SQLException ex) {
            Logger.getLogger(CongNhanModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(CongNhanModify.class.getName()).log(Level.SEVERE, null, ex);
                }

                if (conn != null) {
                    try {
                        conn.close();
                    } catch (SQLException e1) {
                        Logger.getLogger(CongNhanModify.class.getName()).log(Level.SEVERE, null, e1);
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
            String sql = "delete from congnhan where MaCongNhan=?";
            statement = conn.prepareCall(sql);
            statement.setInt(1, id);
            statement.execute();

        } catch (SQLException ex) {
            Logger.getLogger(CongNhanModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(CongNhanModify.class.getName()).log(Level.SEVERE, null, ex);
                }

                if (conn != null) {
                    try {
                        conn.close();
                    } catch (SQLException e1) {
                        Logger.getLogger(CongNhanModify.class.getName()).log(Level.SEVERE, null, e1);
                    }
                }
            }
        }

    }

    // ham tim kiem theo ten 
    public static List<CongNhan> findByFullName(String fullname) {

        //QL du lieu dau ra
        List<CongNhan> CongNhanList = new ArrayList<>();

        // khoi tao
        Connection conn = null;
        PreparedStatement statement = null;

        try {

            // ket noi du lieu database
            conn = DriverManager.getConnection("jdbc:mysql://localhost/quanlycanbo","root","root123");

            //query
            String sql = "select *from congnhan where HoTen like ?";
            statement = conn.prepareCall(sql);
            statement.setString(1, "%" + fullname + "%");
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                CongNhan std;
                std = new CongNhan(resultSet.getInt("Bac"),
                        resultSet.getInt("MaCongNhan"),
                        resultSet.getString("HoTen"),
                        resultSet.getInt("NamSinh"),
                        resultSet.getString("GioiTinh"),
                        resultSet.getString("DiaChi")
                        );
                CongNhanList.add(std);
            }

        } catch (SQLException ex) {
            Logger.getLogger(CongNhanModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(CongNhanModify.class.getName()).log(Level.SEVERE, null, ex);
                }

                if (conn != null) {
                    try {
                        conn.close();
                    } catch (SQLException e1) {
                        Logger.getLogger(CongNhanModify.class.getName()).log(Level.SEVERE, null, e1);
                    }
                }
            }
        }
        // ket thuc
        return CongNhanList;
    }

}
