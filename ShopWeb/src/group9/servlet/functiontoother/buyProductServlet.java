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

import group9.bean.Sanpham;
import group9.util.DBUtils;
import group9.util.MyUtils;

@WebServlet(urlPatterns = { "/buyProduct" })
public class buyProductServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Override
	
	   protected void doGet(HttpServletRequest request, HttpServletResponse response)
	           throws ServletException, IOException {
	 
		
		
		Connection conn = MyUtils.getStoredConnection(request);
		
		String idC = (String) request.getParameter("m_idC");
		String giaC = (String) request.getParameter("m_giaC");
		String tenC = (String) request.getParameter("m_tensanphamC");
		
		Sanpham product = new Sanpham(idC,tenC,Float.parseFloat(giaC));
		
		request.setAttribute("product", product);
		
		//Buy product
	      // Lưu thông tin vào request attribute trước khi forward sang views.
	
		RequestDispatcher dispatcher = request.getServletContext()
	              .getRequestDispatcher("/WEB-INF/views/enterQuantityView.jsp");
	      dispatcher.forward(request, response);
	 
	        
	        
	   }
	 
	   @Override
	   protected void doPost(HttpServletRequest request, HttpServletResponse response)
	           throws ServletException, IOException {
	       doGet(request, response);
	   }
}
