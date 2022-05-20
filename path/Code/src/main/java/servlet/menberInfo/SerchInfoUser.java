package servlet.menberInfo;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.UserBean;
import dao.DAOException;
import dao.UserDAO;

@WebServlet("/SerchInfoUser")
public class SerchInfoUser extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String menberMail = request.getParameter("menberMail");
		String page = request.getParameter("rePage");
		UserBean user = null;
		
		//会員を探す
		try
		{
			UserDAO userDAO = new UserDAO();
			user = userDAO.GetMenber(menberMail);
		}catch(DAOException e) {
			e.printStackTrace();
			request.setAttribute("message", "エラー：SQLエラー1");
			gotoPage(request,response,"/errInternal.jsp");
			return;
		}
		
		// 借りている本を探す
		try {
			RentalDAO rentalDAO = new User
		}catch(DAOException e){
			
		}
		
		request.setAttribute("menberInfo", user);
		gotoPage(request,response,page);
	}
	
	//会員を探す
	public UserBean userSertch()
	{
		
	}
	
	private void gotoPage(HttpServletRequest request, HttpServletResponse response,String page) throws ServletException, IOException 
	{
		RequestDispatcher rd = request.getRequestDispatcher(page);
		rd.forward(request, response);
	}
}
