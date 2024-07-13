package model;

public class Mantance {
	int mid,uid;
	double amount,maintenance_Ammount;
	String status,date;

	
	public double getMaintenance_Ammount() {
		return maintenance_Ammount;
	}

	public void setMaintenance_Ammount(double maintenance_Ammount) {
		this.maintenance_Ammount = maintenance_Ammount;
	}

	public int getMid() {
		return mid;
	}

	public void setMid(int mid) {
		this.mid = mid;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Mantance [mid=" + mid + ", uid=" + uid + ", amount=" + amount + ", maintenance_Ammount="
				+ maintenance_Ammount + ", status=" + status + ", date=" + date + "]";
	}

}
