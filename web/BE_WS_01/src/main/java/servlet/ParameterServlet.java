package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/parameterServlet")
public class ParameterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ParameterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("EUC-KR");
		String result = null;
		result = "<h2> job : insert </h2>";
		result += "<h2> pageNo : 10 </h2>";
		result += "<h2> searchWord : bank </h2>";
		
		response.getWriter().append(result);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String gender = request.getParameter("gender");
		String hobby = request.getParameter("hobby");
		String favorite = request.getParameter("favorite");
		String desc = request.getParameter("desc");
		response.setCharacterEncoding("euc-kr");
		
		out.print("<h3>name : "+ name +"</h3>");
		
		response.getWriter().append("<h3>name : "+ name +"</h3>");
		response.getWriter().append("<h3>email : "+ email +"</h3>");
		response.getWriter().append("<h3>gender : "+ gender +"</h3>");
		response.getWriter().append("<h3>hobby : "+ hobby +"</h3>");
		response.getWriter().append("<h3>favorite : "+ favorite +"</h3>");
		response.getWriter().append("<h3>desc : "+ desc +"</h3>");
		
		
	}

}
