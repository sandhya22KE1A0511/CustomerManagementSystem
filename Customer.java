package com.java.customerapp;

public class Customer {
	private int id;
	public Customer()
	{
		
	}
	public Customer(int id, String firstName, String lastName, char gender) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	private String firstName, lastName;
	char gender;
	@Override
	public String toString() {
		return "Customer [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender
				+ "]";
	}
	@Override
	public boolean equals(Object o)
	{
		boolean areSame=false;
		Customer currentObject=(Customer) this;
		Customer otherObject = (Customer) o;
		int id=currentObject.getId();
		String firstName=currentObject.getFirstName();
		String lastName=currentObject.getLastName();
		char gender=currentObject.getGender();
		int oid=otherObject.getId();
		String ofirstName=otherObject.getFirstName();
		String olastName=otherObject.getLastName();
		char ogender=otherObject.getGender();
		return areSame;
	}
}
