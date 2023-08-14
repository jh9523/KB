package web0814.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/registServlet")
public class RegistServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public RegistServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String tel = request.getParameter("tel");
		String gender = request.getParameter("gender");
		String major = request.getParameter("major");
		System.out.println("이름: "+name);
//		response.setCharacterEncoding("UTF-8");		
		response.setContentType("text/html");
		response.setCharacterEncoding("EUC-KR");	// 한글전용
		response.getWriter().append("이름: "+name);
		response.getWriter().append("<br>연락처: "+tel);
		response.getWriter().append("<br>성별: "+gender);
		response.getWriter().append("<br>전공: "+major);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
