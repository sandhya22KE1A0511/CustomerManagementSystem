package com.java.customerapp;

import java.util.HashSet;

public class CustomerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomerOperations co=new CustomerOperations();
		HashSet<Customer> customers=co.getCustomers();
		for(Customer customer:customers)
		{
			System.out.println(customer);
		}
		if(co.addCustomer(106, "Ananya", "Verma", 'F'))
		{
			System.out.println("Customer added successfully");
		}
		else
		{
			System.out.println("Customer not added");
		}
		if(co.addCustomer(106, "Ananya", "Verma", 'F'))
		{
			System.out.println("Customer added successfully");
		}
		else
		{
			System.out.println("Customer not added");
		}
		if(co.updateCustomer(103, "Arjun", "Reddy", 'M'))
		{
			System.out.println("Customer updated successfully");
		}
		else
		{
			System.out.println("Customer not updated");
		}
		if(co.deleteCustomer(104))
		{
			System.out.println("Customer deleted successfully");
		}
		else
		{
			System.out.println("Customer not deleted");
		}
		Customer person1=co.findCustomerById(102);
		System.out.println("Id : "+person1.getId()+"\nFirst Name : "+person1.getFirstName()+"\nLast Name : "
		+person1.getLastName()+"\nGender : "+person1.getGender());
		Customer person2=co.findCustomerByFirstname("Kiran");
		System.out.println("Id : "+person2.getId()+"\nFirst Name : "+person2.getFirstName()+"\nLast Name : "
		+person2.getLastName()+"\nGender : "+person2.getGender());
		if(co.findCustomerById(999)!=null)
		{
			Customer person3=co.findCustomerByFirstname("Kiran");
			System.out.println("Id : "+person3.getId()+"\nFirst Name : "+person3.getFirstName()+"\nLast Name : "
			+person3.getLastName()+"\nGender : "+person3.getGender());
		}
		else
		{
			System.out.println("Customer does not exist");
		}
		for(Customer customer:customers)
		{
			System.out.println(customer);
		}
	}

}
