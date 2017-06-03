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
import jdk.internal.org.objectweb.asm.tree.TableSwitchInsnNode;

@WebServlet(urlPatterns = { "/doRegister" })
public class doRegisterServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String userName = request.getParameter("username");
		String password = request.getParameter("password");
		String gioitinh = request.getParameter("gioitinh");
		String sodt =  request.getParameter("Sodt");
	    String diachi = request.getParameter("diachi");
	    
		String phanquyen ="";
//		if(MyUtils.getLoginedUser(session).equals("admin"))
//		phanquyen = "employee";
//		else phanquyen = "customer";
		
	    Taikhoan tk = new Taikhoan(userName, gioitinh, password, sodt, diachi,phanquyen);
	    
	    Connection conn = MyUtils.getStoredConnection(request);
	    try {
			DBUtils.insertTaiKhoan(conn, tk);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
		RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/WEB-INF/views/homeView.jsp");
	      
	      dispatcher.forward(request, response);
	}

	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}
}
