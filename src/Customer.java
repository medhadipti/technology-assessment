import java.util.Date;

class Customer {
	String name;
	long contact;
	Date joiningDate;
	
	boolean isEmployee;
	boolean isAffiliate;
	
	Customer(String name, int contact, Date joiningDate, boolean isEmployee, boolean isAffiliate) {
		this.name = name;
		this.contact = contact;
		this.joiningDate = joiningDate;
		this.isEmployee = isEmployee;
		this.isAffiliate = isAffiliate;
	}
	
	boolean isTwoYearOldCustomer() {		
		// todo - check if customer is 2 year old.
		// System.out.println(this.joiningDate);

		return false;
	}
}

