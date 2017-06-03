package group9.servlet.menutofuntion;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import group9.bean.Taikhoan;
import group9.util.DBUtils;
import group9.util.MyUtils;

@WebServlet(urlPatterns = { "/manageUser"})
public class manageUserServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	 @Override
	  protected void doGet(HttpServletRequest request, HttpServletResponse response)
	          throws ServletException, IOException {
	 
		 Connection conn = MyUtils.getStoredConnection(request);
		 
	      List<Taikhoan> list = null;
	      try {
	          list = DBUtils.queryTaikhoan(conn);
	      } catch (SQLException e) {
	          e.printStackTrace();
	      }
	      // Lưu thông tin vào request attribute trước khi forward sang views.
	      request.setAttribute("userList", list);
	      
	      // Forward sang /WEB-INF/views/productListView.jsp
	      RequestDispatcher dispatcher = request.getServletContext()
	              .getRequestDispatcher("/WEB-INF/views/manageUserView.jsp");
	      dispatcher.forward(request, response);
	      
	  }
	 
	  @Override
	  protected void doPost(HttpServletRequest request, HttpServletResponse response)
	          throws ServletException, IOException {
	      doGet(request, response);
	  }

}
