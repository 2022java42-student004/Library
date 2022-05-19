package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.DAOException;
import dao.TopLoginDAO;

@WebServlet("/TopLoginServlt")
public class TopLoginServlt extends HttpServlet {
    public TopLoginServlt() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		int inputID = Integer.parseInt(request.getParameter("id"));
		String inputPass = request.getParameter("pass");
		
		boolean bLogin = false;
		try {
			TopLoginDAO loginDAO = new TopLoginDAO();
			bLogin = loginDAO.isLogin(inputID, inputPass);
		}catch(DAOException e) {
			request.setAttribute("message", "エラー：JDBCドライバの登録に失敗");
			gotoPage(request,response,"errinternal.jsp");
		}
		
		if(bLogin)
		{
			HttpSession session = request.getSession();
			session.setAttribute("login", true);
		}
		else
		{
			request.setAttribute("loginConf", false);
			gotoPage(request,response,"TopLogin.jsp");
		}
	}
	
	private void gotoPage(HttpServletRequest request, HttpServletResponse response,String page) throws ServletException, IOException 
	{
		RequestDispatcher rd = request.getRequestDispatcher(page);
		rd.forward(request, response);
	}

}
