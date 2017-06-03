package group9.util;
 
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
 
import group9.bean.Sanpham;
import group9.bean.Taikhoan;

import group9.bean.Artical;
import group9.bean.Bill;
import group9.bean.CTBill;
import group9.bean.Contact;
 
public class DBUtils {
 
  public static Taikhoan findTaikhoan(Connection conn, String userName, String password) throws SQLException {
 
      String sql = "Select a.usernameC, a.gioitinhC, a.passwordC, a.phanquyenC from taikhoanTb a "
              + " where a.usernameC = ? and a.passwordC= ?";
 
      PreparedStatement pstm = conn.prepareStatement(sql);
      pstm.setString(1, userName);
      pstm.setString(2, password);
      ResultSet rs = pstm.executeQuery();
 
      if (rs.next()) {
          String gender = rs.getString("gioitinhC");
          Taikhoan user = new Taikhoan();
          user.setM_usernameC(userName);
          user.setM_passwordC(password);
          user.setM_gioitinhC(gender);
          user.setM_phanquyenC(rs.getString("phanquyenC"));
          return user;
      }
      return null;
  }

  public static Taikhoan findTaikhoan(Connection conn, String userName) throws SQLException {
 
      String sql = "Select a.usernameC, a.passwordC, a.sodtC, a.gioitinhC, a.diachiC, a.phanquyenC from taikhoanTb a " + " where a.usernameC = ? ";
 
      PreparedStatement pstm = conn.prepareStatement(sql);
      pstm.setString(1, userName);
 
      ResultSet rs = pstm.executeQuery();
 
      if (rs.next()) {
          Taikhoan user = new Taikhoan();
          user.setM_usernameC(rs.getString("usernameC"));
          user.setM_passwordC(rs.getString("passwordC"));
          user.setM_sodtC(rs.getString("sodtC"));
          user.setM_gioitinhC(rs.getString("gioitinhC"));
          user.setM_diachiC(rs.getString("diachiC"));
          user.setM_phanquyenC(rs.getString("phanquyenC"));
          
          return user;
      }
      return null;
  }
  public static List<Taikhoan> queryTaikhoan(Connection conn) throws SQLException {
      String sql = "Select a.usernameC, a.passwordC, a.sodtC, a.gioitinhC, a.diachiC, a.phanquyenC from taikhoanTb a ";
 
      PreparedStatement pstm = conn.prepareStatement(sql);
 
      ResultSet rs = pstm.executeQuery();
      List<Taikhoan> list = new ArrayList<Taikhoan>();
      while (rs.next()) {
    	  Taikhoan user = new Taikhoan();
          user.setM_usernameC(rs.getString("usernameC"));
          user.setM_passwordC(rs.getString("passwordC"));
          user.setM_sodtC(rs.getString("sodtC"));
          user.setM_gioitinhC(rs.getString("gioitinhC"));
          user.setM_diachiC(rs.getString("diachiC"));
          user.setM_phanquyenC(rs.getString("phanquyenC"));
          list.add(user);
      }
      return list;
  }
  
  public static List<Artical> getAllArticalByPermision(Connection conn) throws SQLException {
      String sql = "select * from news where is_activeC !=0";
 
      PreparedStatement pstm = conn.prepareStatement(sql);
 
      ResultSet rs = pstm.executeQuery();
      List<Artical> list = new ArrayList<Artical>();

      while (rs.next()) {

    	  Artical art = new Artical();
    	  art.setM_idNewC(rs.getInt("idNewC"));
    	  art.setM_id_userC(rs.getInt("id_userC"));
    	  art.setM_titleC(rs.getString("titleC"));
    	  art.setM_short_detailC(rs.getString("short_detailC"));
    	  art.setM_long_detailC(rs.getString("long_detailC"));
    	  art.setM_imageC(rs.getString("imageC"));
    	  art.setM_date_createC(rs.getString("date_createC"));
    	  art.setM_date_updateC(rs.getString("date_updateC"));
          list.add(art);
      }
      return list;
  }
  
  public static List<Artical> getAllArtical(Connection conn) throws SQLException {
      String sql = "select * from news";
 
      PreparedStatement pstm = conn.prepareStatement(sql);
 
      ResultSet rs = pstm.executeQuery();
      List<Artical> list = new ArrayList<Artical>();

      while (rs.next()) {

    	  Artical art = new Artical();
    	  art.setM_idNewC(rs.getInt("idNewC"));
    	  art.setM_id_userC(rs.getInt("id_userC"));
    	  art.setM_titleC(rs.getString("titleC"));
    	  art.setM_short_detailC(rs.getString("short_detailC"));
    	  art.setM_long_detailC(rs.getString("long_detailC"));
    	  art.setM_imageC(rs.getString("imageC"));
    	  art.setM_date_createC(rs.getString("date_createC"));
    	  art.setM_date_updateC(rs.getString("date_updateC"));
          list.add(art);
      }
      return list;
  }
  
  public static List<Sanpham> querySanpham(Connection conn) throws SQLException {
      String sql = "Select a.idC, a.tensanphamC, a.giaC from sanphamTb a ";
 
      PreparedStatement pstm = conn.prepareStatement(sql);
 
      ResultSet rs = pstm.executeQuery();
      List<Sanpham> list = new ArrayList<Sanpham>();
      while (rs.next()) {
          String code = rs.getString("idC");
          String name = rs.getString("tensanphamC");
          float price = rs.getFloat("giaC");
          Sanpham product = new Sanpham();
          product.setM_idC(code);
          product.setM_tensanphamC(name);
          product.setM_giaC(price);
          list.add(product);
      }
      return list;
  }
 
  public static Sanpham findSanpham(Connection conn, String code) throws SQLException {
      String sql = "Select a.idC, a.tensanphamC, a.giaC from sanphamTb a where a.idC=?";
 
      PreparedStatement pstm = conn.prepareStatement(sql);
      pstm.setString(1, code);
 
      ResultSet rs = pstm.executeQuery();
 
      while (rs.next()) {
          String name = rs.getString("tensanphamC");
          float price = rs.getFloat("giaC");
          Sanpham product = new Sanpham(code, name, price);
          return product;
      }
      return null;
  }
 
  public static void updateSanpham(Connection conn, Sanpham product) throws SQLException {
      String sql = "Update sanphamTb set tensanphamC =?, giaC=? where idC=? ";
 
      PreparedStatement pstm = conn.prepareStatement(sql);
 
      pstm.setString(1, product.getM_tensanphamC());
      pstm.setFloat(2, product.getM_giaC());
      pstm.setString(3, product.getM_idC());
      pstm.executeUpdate();
  }
 
  public static void updateTaikhoan(Connection conn, Taikhoan user) throws SQLException {
      String sql = "Update taikhoanTb set passwordC =?, sodtC=?, gioitinhC= ?, diachiC= ?, phanquyenC = ? where usernameC=? ";
 
      PreparedStatement pstm = conn.prepareStatement(sql);
 
      pstm.setString(1, user.getM_passwordC());
      pstm.setString(2, user.getM_sodtC());
      pstm.setString(3, user.getM_gioitinhC());
      pstm.setString(4, user.getM_diachiC());
      pstm.setString(5, user.getM_phanquyenC());
      pstm.setString(6, user.getM_usernameC());
      pstm.executeUpdate();
  }
  
  
  
  public static void permisionArticle(Connection conn, String idNewC) throws SQLException {
      String sql = "Update news set is_activeC = ? where idNewC= ? ";
 
      PreparedStatement pstm = conn.prepareStatement(sql);

      pstm.setBoolean(1, true);
      pstm.setInt(2, Integer.parseInt(idNewC));
      pstm.executeUpdate();
  }
  
  public static void deleteArtical(Connection conn, String code) throws SQLException {
      String sql = "delete from news where idNewC = ?";
 
      PreparedStatement pstm = conn.prepareStatement(sql);
 
      pstm.setInt(1, Integer.parseInt(code));
 
      pstm.executeUpdate();
  }
  public static void insertSanpham(Connection conn, Sanpham product) throws SQLException {
      String sql = "Insert into sanphamTb(idC, tensanphamC,giaC) values (?,?,?)";
 
      PreparedStatement pstm = conn.prepareStatement(sql);
 
      pstm.setString(1, product.getM_idC());
      pstm.setString(2, product.getM_tensanphamC());
      pstm.setFloat(3, product.getM_giaC());
 
      pstm.executeUpdate();
  }
 
  public static void deleteSanpham(Connection conn, String code) throws SQLException {
      String sql = "delete from sanphamTb where idC = ?";
 
      PreparedStatement pstm = conn.prepareStatement(sql);
 
      pstm.setString(1, code);
 
      pstm.executeUpdate();
  }
  
  public static void deleteAriticle(Connection conn, String code) throws SQLException {
      String sql = "delete from news where idNewC = ?";
 
      PreparedStatement pstm = conn.prepareStatement(sql);
 
      pstm.setString(1, code);
 
      pstm.executeUpdate();
  }
  
  public static void deleteTaikhoan(Connection conn, String code) throws SQLException {
      String sql = "delete from taikhoanTb where usernameC = ?";
 
      PreparedStatement pstm = conn.prepareStatement(sql);
 
      pstm.setString(1, code);
 
      pstm.executeUpdate();
  }
  //---------------------------BAO-------------------------------------------------
  public static void insertTaiKhoan(Connection conn, Taikhoan TK) throws SQLException {
      String sql = "Insert into taikhoantb"
      		+ "(usernameC, sodtC, gioitinhC, diachiC, passwordC, phanquyenC) "
      		+ "values (?,?,?,?,?,?)";
 
      PreparedStatement pstm = conn.prepareStatement(sql);
      
      pstm.setString(1, TK.getM_usernameC());
      pstm.setInt(2, Integer.parseInt(TK.getM_sodtC()));
      pstm.setString(3, TK.getM_gioitinhC());
      pstm.setString(4, TK.getM_diachiC());
      pstm.setString(5, TK.getM_passwordC());
      pstm.setString(6, TK.getM_phanquyenC());
 
      pstm.executeUpdate();
  }
  
  public static List<Bill> getBill(Connection conn) throws SQLException
  {
	 String sql = "Select a.idGioHangC, a.usernameC, a.ngaylapC, a.isActiveC from giohangTb a ";  
	 PreparedStatement pstm = conn.prepareStatement(sql); 
     ResultSet rs = pstm.executeQuery();
	 List<Bill> list = new ArrayList<Bill>();
	 while (rs.next()) {
         int idGioHang = rs.getInt("idGioHangC");
         String username = rs.getString("usernameC");
         Date ngaylap = rs.getDate("ngaylapC");
         boolean isActive = rs.getBoolean("isActiveC");
         Bill bill = new Bill();
         bill.setM_idGiohangC(idGioHang);
         bill.setM_usernameC(username);
         bill.setM_ngaylapC(ngaylap);
         bill.setM_isActiveC(isActive);
         list.add(bill);
     }
	return list;
  }
 public static Bill findBill(Connection conn, int code)throws SQLException
  {
	  String sql = "Select a.usernameC, a.ngaylapC, a.isActiveC from giohangTb a where a.idGioHangC=?";
	  PreparedStatement pstm = conn.prepareStatement(sql);
      pstm.setInt(1, code);
      ResultSet rs = pstm.executeQuery();
      while (rs.next()) {
          String username = rs.getString("usernameC");
          Date ngaylap = rs.getDate("ngaylapC");
          boolean isActive = rs.getBoolean("isActiveC");
          Bill bill = new Bill(code, username, ngaylap,isActive);
          return bill;
      }
      return null;
  }
 public static List<CTBill> getCTBill(Connection conn, int code)throws SQLException
  {
	  String sql = "Select a.tensanphamC, a.giaC, b.soluongC from ctgiohangTb b,sanphamTb a where b.idGiohangC = ? and a.idC=b.idc";  
	  PreparedStatement pstm = conn.prepareStatement(sql);
	  pstm.setInt(1, code);	
	  ResultSet rs = pstm.executeQuery();
	  List<CTBill> list = new ArrayList<CTBill>();
	  while (rs.next()) {
	         String teansanpham =  rs.getString("tensanphamC");
	         float gia = rs.getFloat("giaC");
	         int soluong = rs.getInt("soluongC");
	         CTBill ctbill = new CTBill();
	         ctbill.setM_teansanphamC(teansanpham);
	         ctbill.setM_giaC(gia);
	         ctbill.setM_soluongC(soluong);
	         list.add(ctbill);
	  }
	  return list;
  }
 public static void deleteBill(Connection conn, int code)throws SQLException
 {
	 String sql = "delete from giohangTb where idGioHangC =?";
	 String sql1 = "delete from ctgiohangTb where idGioHangC =?";
	 PreparedStatement pstm = conn.prepareStatement(sql);
	 PreparedStatement pstm1 = conn.prepareStatement(sql1);
	 pstm.setInt(1, code);
	 pstm1.setInt(1, code);
	 pstm.executeUpdate();
	 pstm1.executeUpdate();
 }
  //----------------------------BAO-----------------------------------------------------
 
 //---------------------------HIEU-------------------------------------------------
 public static List<Contact> queryContact(Connection conn) throws SQLException {
     String sql = "Select * from contactTb";

     PreparedStatement pstm = conn.prepareStatement(sql);

     ResultSet rs = pstm.executeQuery();
     List<Contact> list = new ArrayList<Contact>();
     while (rs.next()) {
         String fullname = rs.getString("usernameC");
         String address = rs.getString("addressC");
         String email = rs.getString("emailC");
         String phone = rs.getString("phoneC");
         String title = rs.getString("titleC");
         String description = rs.getString("descripstionC");
         Contact contact = new Contact();
         contact.setM_usernameC(fullname);
         contact.setM_addressC(address);
         contact.setM_emailC(email);
         contact.setM_phoneC(phone);
         contact.setM_titleC(title);
         contact.setM_descripstionC(description);
         list.add(contact);
     }
     return list;
 }
 
 public static void insertContact(Connection conn, Contact contact) throws SQLException {
     String sql = "Insert into contactTb(usernameC, addressC, emailC, phoneC, titleC, descripstionC, dateCreateC) "
     		+ "values (?,?,?,?,?,?,?)";

     PreparedStatement pstm = conn.prepareStatement(sql);

     pstm.setString(1, contact.getM_usernameC());
     pstm.setString(2, contact.getM_addressC());
     pstm.setString(3, contact.getM_emailC());
     pstm.setString(4, contact.getM_phoneC());
     pstm.setString(5, contact.getM_titleC());
     pstm.setString(6, contact.getM_descripstionC());
     pstm.setDate(7, new java.sql.Date(System.currentTimeMillis()));
     
     pstm.executeUpdate();
 }
//---------------------------HIEU-------------------------------------------------
}