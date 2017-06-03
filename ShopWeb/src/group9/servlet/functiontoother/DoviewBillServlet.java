package group9.servlet.functiontoother;

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

import group9.bean.Bill;
import group9.bean.CTBill;
import group9.util.DBUtils;
import group9.util.MyUtils;

@WebServlet(urlPatterns = { "/viewBill" })
public class DoviewBillServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
	          			 throws ServletException, IOException 
	{
		Connection conn = MyUtils.getStoredConnection(request);
		int code = Integer.parseInt( request.getParameter("m_idGiohangC"));
		String errorString = null;
		List<CTBill> lisinf = null;
		Bill bill = null;
		try 	
		{
			bill=DBUtils.findBill(conn, code);
		}
		catch (SQLException e) 
		{
			e.printStackTrace();
			errorString = e.getMessage();
		}
		if (errorString != null && bill == null) {
	          response.sendRedirect(request.getServletPath() + "/manageBill");
	          return;
	      }
		  try {
			  lisinf = DBUtils.getCTBill(conn, code);
	      } catch (SQLException e) {
	          e.printStackTrace();
	          errorString = e.getMessage();
	      }
	      request.setAttribute("bill", bill);
	      request.setAttribute("list", lisinf);
	 
	      RequestDispatcher dispatcher = request.getServletContext()
	              .getRequestDispatcher("/WEB-INF/views/BillView.jsp");
	      dispatcher.forward(request, response);
	 
	}
}
