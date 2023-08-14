package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LifeCycleServlet
 */
@WebServlet("/lifeCycleServlet")
public class LifeCycleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LifeCycleServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    @Override
    public void init() throws ServletException {
    	System.out.println("** INIT **");
    }
    
    @Override
    public void destroy() {
    	System.out.println("** DESTROY **");
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("** DOGET **");
		response.setCharacterEncoding("EUC-KR");
		response.setContentType("text/html");
		response.getWriter().append("<h1>안녕하세요, LifeCycleServlet입니다.</h1>"
				+ "<U>Tomcat v8.5 Server at localhost [Apache Tomcat]</U>"
				+ "<p>LifeCycleServlet() is called!!</p>");
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("** DOPOST **");
		doGet(request, response);
	}

}
