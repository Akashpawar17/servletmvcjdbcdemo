package com.capgemini;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.capgemini.dao.AvatarDao;
import com.capgemini.model.Avatar;

public class getAvatarController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public getAvatarController() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int aid = Integer.parseInt(request.getParameter("aid"));
		AvatarDao dao = new AvatarDao();
		
		Avatar avatar = new Avatar();
		/*RequestDispatcher rd = request.getRequestDispatcher("showAvatar.jsp");
		
		request.setAttribute("Avatar", aid);
		rd.forward(request,response);
		
		
		
*/
		HttpSession session = request.getSession();
		session.setAttribute("avatar", avatar);
		
		response.sendRedirect("showAvatar.jsp");
		
	}

}
