package memmvc.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import member.dao.MemberDao;
import member.dao.MemberdDaoImpl;
import member.dto.MemberDto;

@WebServlet("/member/update_action")
public class MemberUpdateActionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		MemberDto dto = new MemberDto();
		String id = request.getParameter("id");
		System.out.println(id);
		dto.setId(request.getParameter("id"));
		dto.setName(request.getParameter("name"));
		dto.setPwd(request.getParameter("pwd"));
		dto.setStatus(request.getParameter("status"));
		
		String url = "/member_ok.jsp";
		try {
			MemberDao dao = new MemberdDaoImpl();
			dao.update(dto);
			System.out.println("수정");
			request.setAttribute("msg", "멤버 수정 성공");
		} catch(Exception e) {
			e.printStackTrace();
			url = "/member_error.jsp";
			request.setAttribute("err_msg", e.getMessage());
		}
		request.getRequestDispatcher(url).forward(request, response);
	}
	
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
