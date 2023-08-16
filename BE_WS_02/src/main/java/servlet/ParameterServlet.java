package servlet;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.ParameterDto;

@WebServlet("/parameterServlet")
public class ParameterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HashMap<String, String[]> map = new HashMap<String, String[]>();
		
		String job = request.getParameter("job");
        String pageNo = request.getParameter("pageNo");
        String searchWord = request.getParameter("searchWord");
        
        String arr[][] = {{pageNo, searchWord}};
        
        map.put(job, arr[0]);
        request.setAttribute("map", map);
        request.setAttribute("job", job);
		request.getRequestDispatcher("/getResult.jsp").forward(request, response);	// 포워드 밑은 빈칸으로

	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ParameterDto dto = new ParameterDto();
		response.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("UTF-8");
		
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String gender = request.getParameter("gender");
		String[] hobby = request.getParameterValues("hobby");
		String favorite = request.getParameter("favorite");
		String desc = request.getParameter("desc");
		
		dto.setName("name");
		dto.setEmail("email");
		dto.setGender("gender");
		dto.setName("name");
		
        
        
		
	}

}