package com.demo.sabitha.java8.assignment;

public class Employe {
	private Integer id;
	private String name;
	private Double salary;
	private String Geneder;
	private Long phoneNum;
	private String Email;
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Double getSalary() {
		return salary;
	}
	
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	public String getGeneder() {
		return Geneder;
	}
	
	public void setGeneder(String geneder) {
		Geneder = geneder;
	}
	
	public Long getPhoneNum() {
		return phoneNum;
	}
	
	public void setPhoneNum(Long phoneNum) {
		this.phoneNum = phoneNum;
	}
	
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	@Override
	public String toString() {
		return "Employe [id=" + id + ", name=" + name + ", salary=" + salary + ", Geneder=" + Geneder + ", phoneNum="
				+ phoneNum + ", Email=" + Email + "]";
	}
	public Employe(Integer id, String name, Double salary, String geneder, Long phoneNum, String email) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		Geneder = geneder;
		this.phoneNum = phoneNum;
		Email = email;
	}

	public Employe() {
		// TODO Auto-generated constructor stub
	}

}
