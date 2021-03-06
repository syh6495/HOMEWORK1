package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Customer;
import service.CustomerService;

@WebServlet("/DoLogin")
public class DoLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DoLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		
		CustomerService service = (CustomerService) CustomerService.getInstance();
		Customer customer = service.login(id,password);
		
		String page;
		
		
		if(customer==null){
			page = "/view/loginFail.jsp";
		//	request.setAttribute("id",id);
		}
		else { // 아이디 비밀번호 매칭 논리 구현
			if(customer.getPassword().equals(password)) {
			page = "/view/loginSuccess.jsp";
			request.setAttribute("customer", customer);
			}
			else
				page = "/view/loginFail.jsp";
		}
		
		RequestDispatcher dispatcher= request.getRequestDispatcher(page);
		dispatcher.forward(request,response);

}
}
