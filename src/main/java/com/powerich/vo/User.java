package com.powerich.vo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;


@Entity
public class User {

	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String address;
	private int age;
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GTM+8")
	private Date birthday;
	
	public User(int id, String name, String address, int age, Date birthday) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.age = age;
		this.birthday = birthday;
	}

	public User() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", address=" + address + ", age=" + age + ", birthday=" + birthday
				+ "]";
	}
	
	
}
