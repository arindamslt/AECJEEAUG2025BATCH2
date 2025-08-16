package master.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import master.dao.FoodDao;
import master.dao.RegisterDao;
import master.dto.FoodDto;
import master.dto.RegisterDto;

/**
 * Servlet implementation class RegisterAddServe
 */
@WebServlet("/RegisterAddServe")
public class RegisterAddServe extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		String uname=request.getParameter("uname");
		String pass=request.getParameter("pass");
		String nm=request.getParameter("nm");
		RegisterDto rdto=new RegisterDto();
		rdto.setUname(uname);
		rdto.setPass(pass);
		rdto.setNm(nm);
		RegisterDao rdao=new RegisterDao();
		rdao.insertData(rdto);
		 response.sendRedirect("RegistrationSuccess.jsp");
	   
	}

}
