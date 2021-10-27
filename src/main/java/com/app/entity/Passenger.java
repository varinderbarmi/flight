package com.app.entity;

import java.util.Objects;

import javax.persistence.Entity;

@Entity
public class Passenger {
	String name;
	String email;
	String gender;
	int age;
	public Passenger(String name, String email, String gender, int age) {
		super();
		this.name = name;
		this.email = email;
		this.gender = gender;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Passenger [name=" + name + ", email=" + email + ", gender=" + gender + ", age=" + age + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(age, email, gender, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Passenger other = (Passenger) obj;
		return age == other.age && Objects.equals(email, other.email) && Objects.equals(gender, other.gender)
				&& Objects.equals(name, other.name);
	}
	
}
