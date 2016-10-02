package service;

import java.util.HashMap;
import java.util.Map;

import model.Customer;

public class CustomerService {

	private Map<String, Customer> customers;

	private static final CustomerService instance = new CustomerService();
	
	private CustomerService() {

		this.customers = new HashMap<String, Customer>();

	
	}
	
	public static CustomerService getInstance() {
		
		return instance;
	}

	public void addCustomer(Customer customer) {
		customers.put(customer.getId(), customer);
	}

	public Customer findCustomer(String id) {
		if (id != null)
			return (customers.get(id.toLowerCase()));
		else
			return null;
	}

	public Customer login(String id, String password) {
		
		if(findCustomer(id) != null)	{ // ���̵� ��й�ȣ ��Ī �Լ��� �̰����� ������ �� �ȵż� doLogin���� ������
			
				return findCustomer(id);
			
		}
		
		else
		return null;
	}
	
	public String passid(String id, String password) {

		if(findCustomer(id) != null)	{
			
				return findCustomer(id).getPassword();
			
		}
		else
		return null;
	}
}
