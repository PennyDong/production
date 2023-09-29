package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.DaoImpl.memberDaoImpl;

@WebServlet("/memberPasswordController")
public class memberPasswordController extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public memberPasswordController() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String password = request.getParameter("password");
		String newPassword = request.getParameter("newPassword");
		
		boolean y = new memberDaoImpl().queryPassword(password);
		
		if(y) {
			new memberDaoImpl().updatePassword(newPassword, password);
			System.out.println("密碼更新成功");
			//response.sendRedirect("porderSuccess.jsp");
			response.sendRedirect("success.html");
		}else {
			System.out.println("密碼變更失敗");
			//response.sendRedirect("porderError.jsp");
			response.sendRedirect("error.html");
		};
	}

}
