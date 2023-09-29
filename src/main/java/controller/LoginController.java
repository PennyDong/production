package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Dao.DaoImpl.memberDaoImpl;
import vo.member;


@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		boolean x = new memberDaoImpl().queryUser(username);
		
		//member m = m=new memberDaoImpl().queryMember(username,password);
		
		
		if(x) {
			boolean y = new memberDaoImpl().queryPassword(password);
			if(y) {
				member m = new memberDaoImpl().queryMember(username, password);
				HttpSession session = request.getSession();
				session.setAttribute("M", m);
				response.sendRedirect("porder.jsp");
			}else {
				System.out.println("密碼錯誤");
				response.sendRedirect("LoginError.jsp");
			}
		}else {
			System.out.println("查無使用者");
			response.sendRedirect("LoginError.jsp");
		}
		
	}
}
