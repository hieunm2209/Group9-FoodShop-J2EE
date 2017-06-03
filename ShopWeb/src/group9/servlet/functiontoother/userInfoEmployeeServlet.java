package group9.servlet.functiontoother;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import group9.bean.Taikhoan;
import group9.util.MyUtils;

@WebServlet(urlPatterns = { "/userInfoEmployee" })
public class userInfoEmployeeServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	
	 public userInfoEmployeeServlet() {
	      super();
	  }
	 
	  @Override
	  protected void doGet(HttpServletRequest request, HttpServletResponse response)
	          throws ServletException, IOException {
	      HttpSession session = request.getSession();
	 
	      // Kiểm tra người dùng login chưa
	      Taikhoan loginedUser = MyUtils.getLoginedUser(session);
	 
	      // Chưa login.
	      if (loginedUser == null) {
	          // Chuyển hướng về trang login.
	          response.sendRedirect(request.getContextPath() + "/login");
	          return;
	      }
	      // Ghi thông tin vào request trước khi forward.
	      request.setAttribute("user", loginedUser);
	 
	      // Đã login rồi thì chuyển tiếp sang /WEB-INF/views/userInfoView.jsp
	      RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/WEB-INF/views/userInfoEmployeeView.jsp");
	      dispatcher.forward(request, response);
	 
	  }
	 
	  @Override
	  protected void doPost(HttpServletRequest request, HttpServletResponse response)
	          throws ServletException, IOException {
	      doGet(request, response);
	  }
}
