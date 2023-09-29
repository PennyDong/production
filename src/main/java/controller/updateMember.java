package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.DaoImpl.memberDaoImpl;


@WebServlet("/updateMember")
public class updateMember extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public updateMember() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username=request.getParameter("username");
		String newName=request.getParameter("newName");
		boolean x=new memberDaoImpl().queryUser(username);
		
		if(x) {
			new memberDaoImpl().updateUsername(newName, username);
			response.sendRedirect("success.html");
		}else {
			response.sendRedirect("error.html");
		}
	}

}
