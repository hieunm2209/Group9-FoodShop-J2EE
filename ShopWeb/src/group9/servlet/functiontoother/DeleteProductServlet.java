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
 
@WebServlet(urlPatterns = { "/deleteProduct" })
public class DeleteProductServlet extends HttpServlet {
  private static final long serialVersionUID = 1L;
 
  public DeleteProductServlet() {
      super();
  }
 
  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException {
      Connection conn = MyUtils.getStoredConnection(request);
 
      String code = (String) request.getParameter("m_idC");
 
      String errorString = null;
 
      try {
          DBUtils.deleteSanpham(conn, code);
      } catch (SQLException e) {
          e.printStackTrace();
          errorString = e.getMessage();
      }
      
      // Nếu có lỗi forward sang trang báo lỗi.
      if (errorString != null) {
          // Lưu thông tin vào request attribute trước khi forward sang views.
          request.setAttribute("errorString", errorString);
          //
          RequestDispatcher dispatcher = request.getServletContext()
                  .getRequestDispatcher("/WEB-INF/views/deleteProductErrorView.jsp");
          dispatcher.forward(request, response);
      }
      // Nếu mọi thứ tốt đẹp.
      // Redirect sang trang danh sách sản phẩm.
      else {
          response.sendRedirect(request.getContextPath() + "/productList");
      }
 
   
  }
 
  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException {
      doGet(request, response);
  }
 
}