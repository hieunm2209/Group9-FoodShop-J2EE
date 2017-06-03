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

import group9.bean.Contact;
import group9.bean.Taikhoan;
import group9.util.DBUtils;
import group9.util.MyUtils;
import jdk.internal.org.objectweb.asm.tree.TableSwitchInsnNode;

@WebServlet(urlPatterns = { "/doSendContact" })
public class doSendContactServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String fullname = request.getParameter("fullname");
		String address = request.getParameter("address");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String title = request.getParameter("title");
		String description = request.getParameter("description");
		
		Contact contact = new Contact();
		contact.setM_usernameC(fullname);
		contact.setM_addressC(address);
		contact.setM_emailC(email);
		contact.setM_phoneC(phone);
		contact.setM_titleC(title);
		contact.setM_descripstionC(description);
	    
	    Connection conn = MyUtils.getStoredConnection(request);
	    try {
			DBUtils.insertContact(conn, contact);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
//		RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/WEB-INF/views/homeView.jsp");
//	      
//	      dispatcher.forward(request, response);
	
	response.sendRedirect("getAllContact");
	
	
	}


	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}
}
