package group9.servlet.functiontoother;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import group9.util.DBUtils;
import group9.util.MyUtils;

@WebServlet(urlPatterns = { "/deleteArtical" })
public class deleteArticalServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	
	   protected void doGet(HttpServletRequest request, HttpServletResponse response)
	           throws ServletException, IOException {
	 
		
		
		Connection conn = MyUtils.getStoredConnection(request);
		
		String m_idNewC = request.getParameter("m_idNewC");
		 
	      try {
	          DBUtils.deleteArtical(conn,m_idNewC);
	      } catch (SQLException e) {
	          e.printStackTrace();
	      }
	      // Lưu thông tin vào request attribute trước khi forward sang views.
	
	      
	       response.sendRedirect(request.getContextPath() + "/manageArticle"); 
	        
	        
	   }
	 
	   @Override
	   protected void doPost(HttpServletRequest request, HttpServletResponse response)
	           throws ServletException, IOException {
	       doGet(request, response);
	   }


}
