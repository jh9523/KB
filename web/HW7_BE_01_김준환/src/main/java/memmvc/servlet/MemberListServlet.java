package memmvc.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import member.dao.MemberDao;
import member.dao.MemberdDaoImpl;
import member.dto.MemberDto;

@WebServlet("/member/list")
public class MemberListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MemberDao dao = new MemberdDaoImpl();
		String url = "/member_list.jsp";
		try {
			List<MemberDto> list = dao.list();
			request.setAttribute("list", list);
		} catch(SQLException e) {
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
