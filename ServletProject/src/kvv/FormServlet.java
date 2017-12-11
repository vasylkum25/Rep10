package kvv;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class FormServlet extends HttpServlet{
	
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException{
		
		req.getRequestDispatcher("/registration.jsp").forward(req, resp);
	}
	
	
	List<User> users = new ArrayList<>();
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException{
		
		String login = req.getParameter("login");
		String password = req.getParameter("password");
		User user = new User(login, password);
		users.add(user);
		
		HttpSession session = req.getSession();
		session.setAttribute("user", users);
		resp.sendRedirect("/ServletProject/index.jsp");
		
	}

}
