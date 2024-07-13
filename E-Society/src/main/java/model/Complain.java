package model;


public class Complain {
	int cid,uid;
	String name,complain,email,c_status,date,completedate;

	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getCompletedate() {
		return completedate;
	}
	public void setCompletedate(String completedate) {
		this.completedate = completedate;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getComplain() {
		return complain;
	}
	public void setComplain(String complain) {
		this.complain = complain;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getC_status() {
		return c_status;
	}
	public void setC_status(String c_status) {
		this.c_status = c_status;
	}
	
	
	@Override
	public String toString() {
		return "Complain [cid=" + cid + ", uid=" + uid + ", name=" + name + ", complain=" + complain + ", email="
				+ email + ", c_status=" + c_status + ", date=" + date + ", completedate=" + completedate + "]";
	}

}
