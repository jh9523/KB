package web0814.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/findServlet")
public class FindNumberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	// 컴퓨터 난수
//	private int com_num = (int)(Math.random()*100+1);
	private int com_num = new java.util.Random().nextInt(100)+1;	//  둘 다 1~100 사이 난수
	
    public FindNumberServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String result = "";
		response.setCharacterEncoding("EUC-KR");
		String num = request.getParameter("num");
		try {
			int numn = Integer.parseInt(num);
			if(numn < 1) {
				throw new IllegalArgumentException("1보다 작습니다.");
			}
			if(numn > 100) {
				throw new IllegalArgumentException("100보다 큽니다.");
			}
			if(numn == com_num) {
				result = "ㅊㅋㅊㅋ, 정답입니다.";
			} else if(numn > com_num) {
				result = "내려주세요";
			} else if(numn < com_num) {
				result = "올려주세요";
			}
		} catch (Exception e) {
			e.printStackTrace();
			result = "잘못된 입력입니다."+e.getMessage();
		}
		response.getWriter().append(result);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
