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

import group9.util.DBUtils;
import group9.util.MyUtils;

@WebServlet(urlPatterns = { "/deleteBill" })
public class DeleteBillServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	public DeleteBillServlet()
	{
		super();
	}
	 @Override
	  protected void doGet(HttpServletRequest request, HttpServletResponse response)
	          throws ServletException, IOException {
	      Connection conn = MyUtils.getStoredConnection(request);
	 
	      int code = Integer.parseInt(request.getParameter("m_idGiohangC"));
	 
	      String errorString = null;
	 
	      try {
	          DBUtils.deleteBill(conn, code);
	      } catch (SQLException e) {
	          e.printStackTrace();
	          errorString = e.getMessage();
	      }
	      
	      
	      if (errorString != null) {
	    	  
	          request.setAttribute("errorString", errorString);
	          //
	          RequestDispatcher dispatcher = request.getServletContext()
	                  .getRequestDispatcher("/WEB-INF/views/manageBillView.jsp");
	          dispatcher.forward(request, response);
	      }
	      
	      else {
	          response.sendRedirect(request.getContextPath() + "/manageBill");
	      }
	 
	   
	  }
	 
	  @Override
	  protected void doPost(HttpServletRequest request, HttpServletResponse response)
	          throws ServletException, IOException {
	      doGet(request, response);
	  }
}
