package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.DaoImpl.memberDaoImpl;
import vo.member;


@WebServlet("/addmemberController")
public class addmemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public addmemberController() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String Name = request.getParameter("name");
		String Username = request.getParameter("username");
		String Password = request.getParameter("password");
		
		member m = new member(Name,Username,Password);
		
		new memberDaoImpl().add(m);
		
		response.sendRedirect("Login.jsp");
		
	}

}
