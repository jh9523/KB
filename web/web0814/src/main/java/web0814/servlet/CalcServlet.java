package web0814.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalcServlet
 */
@WebServlet("/calcServlet")		// 얘가 호출명
public class CalcServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalcServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String n1 = request.getParameter("n1");
		String n2 = request.getParameter("n2");
		int i1 = Integer.parseInt(n1);
		int i2 = Integer.parseInt(n2);
		String opr = request.getParameter("opr");
		int result = 0;
		if(opr.equals("+")) {
			result = i1+i2;
		} else if(opr.equals("-")){
			result = i1-i2;
		} else if(opr.equals("*")){
			result = i1*i2;
		} else if(opr.equals("/")){
			result = i1/i2;
		}
		
		response.getWriter().append(""+result);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
