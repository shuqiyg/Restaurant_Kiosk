package meal;

public class Customer {
	String name;
	String phoneNo;
	Customer(){}
	Customer(String name, String phoneNo){
		setName(name);
		setPhoneNo(phoneNo);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	public String getPhoneNo() {
		return this.phoneNo;
	}
}
