package collectionType;

import java.util.List;
import java.util.Set;

public class User {
	private int id;
	private String name;
	private Set<Long> contact;
	private List<String> address;
	
	public User() {
		// TODO Auto-generated constructor stub
	}
	public User(int id, String name, Set<Long> contact, List<String> address) {
		super();
		this.id = id;
		this.name = name;
		this.contact = contact;
		this.address = address;
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
	public Set<Long> getContact() {
		return contact;
	}
	public void setContact(Set<Long> contact) {
		this.contact = contact;
	}
	public List<String> getAddress() {
		return address;
	}
	public void setAddress(List<String> address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", contact=" + contact + ", address=" + address + "]";
	}
	

}
