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

import group9.bean.Artical;
import group9.bean.Sanpham;
import group9.util.DBUtils;
import group9.util.MyUtils;

@WebServlet(urlPatterns = { "/Catalog"})
public class CatalogServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
	           throws ServletException, IOException {
	 
	       // Forward toi trang /WEB-INF/views/homeView.jsp
	       // (Người dùng không bao giờ truy cập trực tiếp được vào các trang JSP
	       // đặt trong WEB-INF)
		
		
		  Connection conn = MyUtils.getStoredConnection(request);
		 
	      List<Sanpham> list = null;
	      try {
	          list = DBUtils.querySanpham(conn);
	      } catch (SQLException e) {
	          e.printStackTrace();
	      }
	      request.setAttribute("catalog",list);
	      // Lưu thông tin vào request attribute trước khi forward sang views.
	
	      request.setAttribute("articallist",list);
		
		
		
		
	       RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/WEB-INF/views/CatalogView.jsp");
	        
	       dispatcher.forward(request, response);
	        
	   }
	 
	   @Override
	   protected void doPost(HttpServletRequest request, HttpServletResponse response)
	           throws ServletException, IOException {
	       doGet(request, response);
	   }
}
