package com.java.customerapp;

import java.util.HashSet;

public class CustomerMain {

	public static void main(String[] args) {
		CustomerOperations co=new CustomerOperations();
		//Displaying all customers initially available in the collection. 
		HashSet<Customer> customers=co.getCustomers();
		for(Customer customer:customers)
		{
			System.out.println(customer);
		}
		//Adding a new customer with ID 106, first name Ananya, last name Verma, and gender 'F'. 
		if(co.addCustomer(106, "Ananya", "Verma", 'F'))
		{
			System.out.println("Customer added successfully");
		}
		else
		{
			System.out.println("Customer not added");
		}
		//Updating the customer with ID 103 to the following details: o First name: Arjun o Last name: Reddy o Gender: 'M' 
		if(co.updateCustomer(103, "Arjun", "Reddy", 'M'))
		{
			System.out.println("Customer updated successfully");
		}
		else
		{
			System.out.println("Customer not updated");
		}
		//Deleting the customer with ID 104. 
		if(co.deleteCustomer(104))
		{
			System.out.println("Customer deleted successfully");
		}
		else
		{
			System.out.println("Customer not deleted");
		}
		// Finding and display the customer with ID 102. 
		Customer person1=co.findCustomerById(102);
		System.out.println("Id : "+person1.getId()+"\nFirst Name : "+person1.getFirstName()+"\nLast Name : "
		+person1.getLastName()+"\nGender : "+person1.getGender());
		// Finding and display the customer whose first name is Kiran. 
		Customer person2=co.findCustomerByFirstname("Kiran");
		System.out.println("Id : "+person2.getId()+"\nFirst Name : "+person2.getFirstName()+"\nLast Name : "
		+person2.getLastName()+"\nGender : "+person2.getGender());
		// Attempting to find a customer with ID 999 and handling the case where the customer does not exist. 
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
		// Displaying all customers after completing the operations. 
		for(Customer customer:customers)
		{
			System.out.println(customer);
		}
	}

}
