package com.java.customerapp;

import java.util.HashSet;
import java.util.Iterator;

public class CustomerOperations {

	HashSet<Customer> customers=new HashSet<>();
	public CustomerOperations()
	{
	customers.add(new Customer(101,"Rahul","Sharma",'M'));
	customers.add(new Customer(102,"Priya","Reddy",'F'));
	customers.add(new Customer(103,"Arjun","Kumar",'M'));
	customers.add(new Customer(104,"Sneha","Rao",'F'));
	customers.add(new Customer(105,"Kiran","Patel",'M'));
	}
	public boolean addCustomer(int id, String firstname, String lastname, char gender)
	{
		boolean isAdded=false;
		Customer c1=new Customer(id,firstname,lastname,gender);
		isAdded=customers.add(c1);
		return isAdded;
	}
	public boolean updateCustomer(int customerId, String firstname, String lastname, char gender) {
		boolean isUpdated=false;
		Iterator<Customer> person1=customers.iterator();
		while(person1.hasNext())
		{
			Customer person=person1.next();
			if(person.getId()==customerId)
			{
				person.setFirstName(firstname);
				person.setLastName(lastname);
				person.setGender(gender);
				isUpdated=true;
			}
		}
		return isUpdated;
	}
	public boolean deleteCustomer(int customerId)
	{
		boolean isDeleted=false;
		Iterator<Customer> person1=customers.iterator();
		while(person1.hasNext())
		{
			Customer person=person1.next();
			if(person.getId()==customerId)
			{
				isDeleted=customers.remove(person);
				break;
			}
		}
		return isDeleted;
	}
	public HashSet<Customer> getCustomers()
	{
		return customers;
	}
	public Customer findCustomerById(int customerId) 
	{
		for(Customer customer:customers)
		{
			if(customer.getId()==customerId)
			{
				return customer;
			}
		}
		return null;
	}
	public Customer findCustomerByFirstname(String firstname) 
	{
		for(Customer customer:customers)
		{
			if(customer.getFirstName().equals(firstname))
			{
				return customer;
			}
		}
		return null;
	}
	
}
