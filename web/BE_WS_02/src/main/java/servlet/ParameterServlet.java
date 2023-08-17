package servlet;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.ParameterDto;

@WebServlet("/params")
public class ParameterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HashMap<String, String> map = new HashMap<String, String>();
		
		String job = request.getParameter("job");
        String pageNo = request.getParameter("pageNo");
        String searchWord = request.getParameter("searchWord");
        
        map.put("job", job);
        map.put("pageNo", pageNo);
        map.put("searchWord", searchWord);
        
        RequestDispatcher dispatcher = request.getRequestDispatcher("/getResult.jsp");
        
		request.getRequestDispatcher("/getResult.jsp").forward(request, response);	// 포워드 밑은 빈칸으로

	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("UTF-8");
		
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String gender = request.getParameter("gender");
		String[] hobby = request.getParameterValues("hobby");
		String favorite = request.getParameter("favorite");
		String desc = request.getParameter("desc");
		
		ParameterDto dto = new ParameterDto(name, email, gender, hobby, favorite, desc);
		
		request.setAttribute("parameterDto", dto);
		
        // forwarding 하기
		RequestDispatcher dispatcher = request.getRequestDispatcher("/postResult.jsp");
        dispatcher.forward(request, response);
		
	}

}