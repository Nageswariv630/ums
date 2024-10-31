package org.jsp.ums;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {
	public User() {

	}

	public User(int id, String name, String username, String email, long phone, String password) {
		super();
		this.id = id;
		this.name = name;
		this.username = username;
		Email = email;
		this.phone = phone;
		this.password = password;
	}

	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String username;
	private String Email;
	private long phone;
	private String password;
	private long adr;

	public long getAdr() {
		return adr;
	}

	public void setAdr(long adr) {
		this.adr = adr;
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

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", username=" + username + ", Email=" + Email + ", phone=" + phone
				+ ", password=" + password + "]";
	}

}
