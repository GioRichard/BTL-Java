/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package btl.dao;

import btl.model.CanBo;
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
public class CanBoModify {

    /// hien thi tat ca du lieu
    public static List<CanBo> findAll() {

        //QL du lieu dau ra
        List<CanBo> CanBoList = new ArrayList<>();

        // khoi tao
        Connection conn = null;
        Statement statement = null;

        try {

            // ket noi du lieu database
            conn = DriverManager.getConnection("jdbc:mysql://localhost/quanlycanbo","root","root123");

            //query
            String sql = "select *from canbo";
            statement = conn.createStatement();

            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                CanBo std;
                std = new CanBo(resultSet.getInt("MaCB"),
                        resultSet.getString("HoTen"),
                        resultSet.getInt("NamSinh"),
                        resultSet.getString("GioiTinh"),
                        resultSet.getString("DiaChi"));
                CanBoList.add(std);
            }

        } catch (SQLException ex) {
            Logger.getLogger(CanBoModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                    
                } catch (SQLException ex) {
                    Logger.getLogger(CanBoModify.class.getName()).log(Level.SEVERE, null, ex);
                }

                if (conn != null) {
                    try {
                        conn.close();
                    } catch (SQLException e1) {
                        Logger.getLogger(CanBoModify.class.getName()).log(Level.SEVERE, null, e1);
                    }
                }
            }
        }
        // ket thuc
        return CanBoList;
    }
// ham them du lieu

    public static void insert(CanBo std) {
        // khoi tao
        Connection conn = null;
        PreparedStatement statement = null;

        try {

            //lay tat ca danh sach sinh vien va ket noi du lieu database
            conn = DriverManager.getConnection("jdbc:mysql://localhost/quanlycanbo","root","root123");

            //query
            
            String sql = "insert into canbo(MaCB,HoTen,NamSinh,GioiTinh,DiaChi) value (?,?,?,?,?)";
            statement = conn.prepareCall(sql);
            statement.setInt(1, std.getMaCB());
            statement.setString(2, std.getHoTen());
            statement.setInt(3, std.getNamSinh());
            statement.setString(4,std.getGioiTinh());
            statement.setString(5, std.getDiaChi());

            //them du leu vao database
            statement.execute();

        } catch (SQLException ex) {
            Logger.getLogger(CanBoModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(CanBoModify.class.getName()).log(Level.SEVERE, null, ex);
                }

                if (conn != null) {
                    try {
                        conn.close();
                    } catch (SQLException e1) {
                        Logger.getLogger(CanBoModify.class.getName()).log(Level.SEVERE, null, e1);
                    }
                }
            }
        }

    }

    // sua du lieu
    public static void update(CanBo std) {
        // khoi tao
        Connection conn = null;
        PreparedStatement statement = null;

        try {

            //lay tat ca danh sach sinh vien va ket noi du lieu database
            conn = DriverManager.getConnection("jdbc:mysql://localhost/quanlycanbo","root","root123");

            //query
            String sql = "UPDATE canbo SET HoTen = ?, NamSinh = ?, GioiTinh = ?, DiaChi = ? WHERE MaCB =?";
            statement = conn.prepareStatement(sql);

            statement.setString(1, std.getHoTen());
            statement.setInt(2, std.getNamSinh());
            statement.setString(3, std.getGioiTinh());
            statement.setString(4,std.getDiaChi());
            statement.setInt(5, std.getMaCB());

            //them du leu vao database
             statement.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(CanBoModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(CanBoModify.class.getName()).log(Level.SEVERE, null, ex);
                }

                if (conn != null) {
                    try {
                        conn.close();
                    } catch (SQLException e1) {
                        Logger.getLogger(CanBoModify.class.getName()).log(Level.SEVERE, null, e1);
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
            String sql = "delete from canbo where MaCB=?";
            statement = conn.prepareCall(sql);
            statement.setInt(1, id);
            statement.execute();

        } catch (SQLException ex) {
            Logger.getLogger(CanBoModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(CanBoModify.class.getName()).log(Level.SEVERE, null, ex);
                }

                if (conn != null) {
                    try {
                        conn.close();
                    } catch (SQLException e1) {
                        Logger.getLogger(CanBoModify.class.getName()).log(Level.SEVERE, null, e1);
                    }
                }
            }
        }

    }

    // ham tim kiem theo ten 
    public static List<CanBo> findByFullName(String fullname) {

        //QL du lieu dau ra
        List<CanBo> CanBoList = new ArrayList<>();

        // khoi tao
        Connection conn = null;
        PreparedStatement statement = null;

        try {

            // ket noi du lieu database
            conn = DriverManager.getConnection("jdbc:mysql://localhost/quanlycanbo","root","root123");

            //query
            String sql = "select *from canbo where HoTen like ?";
            statement = conn.prepareCall(sql);
            statement.setString(1, "%" + fullname + "%");
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                CanBo std;
                std = new CanBo(resultSet.getInt("MaCB"),
                        resultSet.getString("HoTen"),
                        resultSet.getInt("NamSinh"),
                        resultSet.getString("GioiTinh"),
                        resultSet.getString("DiaChi"));
                CanBoList.add(std);
            }

        } catch (SQLException ex) {
            Logger.getLogger(CanBoModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(CanBoModify.class.getName()).log(Level.SEVERE, null, ex);
                }

                if (conn != null) {
                    try {
                        conn.close();
                    } catch (SQLException e1) {
                        Logger.getLogger(CanBoModify.class.getName()).log(Level.SEVERE, null, e1);
                    }
                }
            }
        }
        // ket thuc
        return CanBoList;
    }

  

}
