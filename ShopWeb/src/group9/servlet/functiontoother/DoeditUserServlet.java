package group9.servlet.functiontoother;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import group9.bean.Taikhoan;
import group9.util.DBUtils;
import group9.util.MyUtils;

@WebServlet(urlPatterns = { "/DoeditUser" })
public class DoeditUserServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	  protected void doGet(HttpServletRequest request, HttpServletResponse response)
	          throws ServletException, IOException {
	      Connection conn = MyUtils.getStoredConnection(request);

	      String username = (String) request.getParameter("m_usernameC");
	      String pass = (String) request.getParameter("m_passwordC");
	      String sodt =  request.getParameter("m_sodtC");
	      String gioitinh = (String) request.getParameter("m_gioitinhC");
	      String diachi = (String) request.getParameter("m_diachiC");
	      String phanquyen = (String) request.getParameter("m_phanquyenC");
	      
	      
	      Taikhoan user = new Taikhoan(username,gioitinh,pass,sodt,diachi,phanquyen);
	 
	      String errorString = null;
	 
	      try {
	          DBUtils.updateTaikhoan(conn, user);
	      } catch (SQLException e) {
	          e.printStackTrace();
	          errorString = e.getMessage();
	      }
	      // Lưu thông tin vào request attribute trước khi forward sang views.
//	      request.setAttribute("errorString", errorString);
//	      request.setAttribute("user", user);
	 
	      // Nếu có lỗi forward sang trang edit
	      if (errorString != null) {
	          RequestDispatcher dispatcher = request.getServletContext()
	                  .getRequestDispatcher("/WEB-INF/views/editUserView.jsp");
	          dispatcher.forward(request, response);
	      }
	      // Nếu mọi thứ tốt đẹp.
	      // Redirect sang trang danh sách sản phẩm.
	      else {
	          response.sendRedirect(request.getContextPath() + "/manageUser");
	      }
	 
	  }
	 
	  @Override
	  protected void doPost(HttpServletRequest request, HttpServletResponse response)
	          throws ServletException, IOException {
	      doGet(request, response);
	  }
}
