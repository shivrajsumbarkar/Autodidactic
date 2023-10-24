package com.prac.demo;
/**
 * Association is a relation between two separate classes which establishes through their Objects.
 * Association can be one-to-one, one-to-many, many-to-one, many-to-many. 
 * In Object-Oriented programming, an Object communicates to another object to use functionality and services provided by that object.
 * Composition and Aggregation are the two forms of association. 
 * 
 * Aggregation :::
 * HAS-A relationship Employee HAS-A Address
 * Child can exist without parent 
 * When use Aggregation?
   Code reuse is also best achieved by aggregation when there is no is-a relationship.
   Inheritance should be used only if the relationship is-a is maintained throughout the lifetime of the objects involved; otherwise, aggregation is the best choice.

   It represents Has-A’s relationship.
   It is a unidirectional association i.e. a one-way relationship. For example, a department can have students but vice versa is not possible and thus unidirectional in nature.
   In Aggregation, both the entries can survive individually which means ending one entity will not affect the other entity.
   
 * @author SHIVRAJ S. UMBARKAR
 *
 */
public class Aggregation {

	public static void main(String[] args) {
		A_Address address1=new A_Address("Mumbai","MH","IND");
		A_Address address2=new A_Address("Pune","MH","IND");
		
		A_Employee emp1=new A_Employee("John", "01", address1);
		A_Employee emp2=new A_Employee("Park", "02", address2);

		 
	}

}

class A_Address 
{
	private String city;
	private String state;
	private String country;
	
	public A_Address(String city,String state,String country)
	{
		this.city=city;
		this.state=state;
		this.country=country;
	}
	public String getCity() {
		return city;
	}
	public String getState() {
		return state;
	}
	public String getCountry() {
		return country;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setState(String state) {
		this.state = state;
	}
	public void setCountry(String country) {
		this.country = country;
	}

}
class A_Employee
{
	private String name; 
	private String id; 
	private A_Address address;
	
	public A_Employee(String name, String id, A_Address address)
	{
		this.name=name;
		this.id=id;
		this.address=address;
	}
	
	public String getName() {
		return name;
	}
	public String getId() {
		return id;
	}
	public A_Address getAddress() {
		return address;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setAddress(A_Address address) {
		this.address = address;
	}
	
	
}