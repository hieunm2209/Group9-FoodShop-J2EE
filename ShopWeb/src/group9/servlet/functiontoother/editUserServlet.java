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

@WebServlet(urlPatterns = { "/editUser" })
public class editUserServlet  extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	
	@Override
	  protected void doGet(HttpServletRequest request, HttpServletResponse response)
	          throws ServletException, IOException {
	      Connection conn = MyUtils.getStoredConnection(request);
	 
	      String code = (String) request.getParameter("m_usernameC");
	 
	      Taikhoan user = null;
	 
	      String errorString = null;
	 
	      try {
	    	  user = DBUtils.findTaikhoan(conn, code);
	      } catch (SQLException e) {
	          e.printStackTrace();
	          errorString = e.getMessage();
	      }
	 
	      // Không có lỗi.
	      // TK không tồn tại để edit.
	      // Redirect sang trang danh sách User.
	      if (errorString != null && user == null) {
	          response.sendRedirect(request.getServletPath() + "/manageUser");
	          return;
	      }
	 
	      // Lưu thông tin vào request attribute trước khi forward sang views.
	      request.setAttribute("errorString", errorString);
	      request.setAttribute("user", user);
	 
	      RequestDispatcher dispatcher = request.getServletContext()
	              .getRequestDispatcher("/WEB-INF/views/editUserView.jsp");
	      dispatcher.forward(request, response);
	 
	  }
	 
	  @Override
	  protected void doPost(HttpServletRequest request, HttpServletResponse response)
	          throws ServletException, IOException {
	      doGet(request, response);
	  }
	
	
}
