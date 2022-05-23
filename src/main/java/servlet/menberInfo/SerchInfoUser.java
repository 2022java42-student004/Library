package servlet.menberInfo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.RentalBean;
import bean.UserBean;
import dao.DAOException;
import dao.RentalDAO;
import dao.UserDAO;

@WebServlet("/SerchInfoUser")
public class SerchInfoUser extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String menberMail = request.getParameter("menberMail");
		String page = request.getParameter("rePage");
		UserBean user = null;
		List<RentalBean> rental = new ArrayList<RentalBean>();
		
		if(menberMail == null || menberMail.length() == 0)
		{
			gotoPage(request,response,request.getHeader("REFERER").substring(36));
		}
		
		//会員を探す
		try
		{
			UserDAO userDAO = new UserDAO();
			user = userDAO.GetUser(menberMail);
		}catch(DAOException e) {
			e.printStackTrace();
			request.setAttribute("message", "エラー：SQLエラー1");
			gotoPage(request,response,"/errInternal.jsp");
			return;
		}
		
		if(user == null)
		{
			gotoPage(request,response,request.getHeader("REFERER").substring(36));
		}
			
		
		// 借りている本を探す
		try {
			RentalDAO rentalDAO = new RentalDAO();
			rental = rentalDAO.ListUserRentalInfo(user.getiID());
		}catch(DAOException e){
			e.printStackTrace();
			request.setAttribute("message", "エラー：SQLエラー2");
			gotoPage(request,response,"/errInternal.jsp");
			return;
		}
		
		request.setAttribute("bookTitle", "聖書");
		request.setAttribute("isbm", "0123456789000");
		request.setAttribute("menberInfo", user);
		request.setAttribute("rentalInfo", rental);
		gotoPage(request,response,request.getHeader("REFERER").substring(36));
	}
	
	private void gotoPage(HttpServletRequest request, HttpServletResponse response,String page) throws ServletException, IOException 
	{
		RequestDispatcher rd = request.getRequestDispatcher(page);
		rd.forward(request, response);
	}
}
