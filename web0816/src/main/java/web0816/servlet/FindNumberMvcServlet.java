package web0816.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/findNumberMvcServlet")
public class FindNumberMvcServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private int com_num = new java.util.Random().nextInt(100)+1;	//  둘 다 1~100 사이 난수
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String result = "";
		response.setCharacterEncoding("EUC-KR");
		String snum = request.getParameter("num");
		int num = Integer.parseInt(snum);
		System.out.println(com_num);
		System.out.println(num);
		if(com_num==num) {
			result = "정답입니다";
		} else if(com_num>num) {
			result = "올려주세요";
		} else {
			result = "내려주세요";
		}
		
		request.setAttribute("msg", result);
		request.getRequestDispatcher("/find_number_mvc.jsp").forward(request, response);	// 포워드 밑은 빈칸으로
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
