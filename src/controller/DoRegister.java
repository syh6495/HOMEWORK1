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

@WebServlet("/DoRegister")
public class DoRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DoRegister() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		String name = request.getParameter("name");
		String gender = request.getParameter("gender");
		String email = request.getParameter("email");
		
		CustomerService service = (CustomerService) CustomerService.getInstance();
		Customer customer = service.findCustomer(id);
		
		String page;
		 
		
		if(customer==null){ // 가입
			page = "/view/registerSuccess.jsp";
			service.addCustomer(new Customer(id,password ,name,gender,email));
			customer = service.findCustomer(id);
			request.setAttribute("customer", customer);
		}
		else { // 가입불가
			page = "/view/registerFail.jsp";
			request.setAttribute("customer", customer);
			
		}
		
		RequestDispatcher dispatcher= request.getRequestDispatcher(page);
		dispatcher.forward(request,response);

}
}
