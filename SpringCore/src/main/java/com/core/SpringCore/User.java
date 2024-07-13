package com.core.SpringCore;

import java.util.Set;

public class User {
	private int id;
	private String name;
	private Set<Long> contact;
	
//	public User(int id, String name, Set<Long> contact) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.contact = contact;
//	}
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
	public Set<Long> getContact() {
		return contact;
	}
	public void setContact(Set<Long> contact) {
		this.contact = contact;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", contact=" + contact + "]";
	} 

}
