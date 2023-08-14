package web0814.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/guguDanServlet")
public class GuguDanServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public GuguDanServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String result = "";
		response.setCharacterEncoding("EUC-KR");
		String dan = request.getParameter("dan");
		try {
			int ddan = Integer.parseInt(dan);
			
			if(ddan <2 ) {
				throw new IllegalArgumentException("2보다 작습니다.");
			}
			if(ddan>9) {
				throw new IllegalArgumentException("9보다 큽니다.");
			}
			for(int i =1; i<10; i++) {
				result += "<br>"+ddan+" X "+ i +" = "+ (ddan*i);
			}
		} catch (Exception e) {
			e.printStackTrace();
			result = "잘못된 입력입니다."+e.getMessage();
		}
		response.getWriter().append(result);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
