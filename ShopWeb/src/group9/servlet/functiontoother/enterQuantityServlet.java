package group9.servlet.functiontoother;

import group9.bean.*;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = { "/enterQuantity" })
public class enterQuantityServlet extends HttpServlet{

	/**
	 * 
	 */
	public static final String NAME_CART_COOKIE = "CART_COOKIE";
	
	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String code = request.getParameter("m_idC");
		String name = request.getParameter("m_tensanphamC");
		String price = request.getParameter("m_giaC");
		String quantity = request.getParameter("quantity");
		
		for(int i = 0; i < Integer.parseInt(quantity); i++)
		{
			Sanpham sp = new Sanpham(code, name, Float.parseFloat(price));
			Cart.addCart(sp);
			
			Cookie cksp = new Cookie(NAME_CART_COOKIE, sp.getM_idC());
			response.addCookie(cksp);
		}
		
		response.sendRedirect(request.getContextPath() + "/Catalog");
	}

	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}
}
