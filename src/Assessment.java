import java.util.Date;

public class Assessment {

	public static void main(String[] args) {
		Customer medha = new Customer("Medha", 1, new Date(), true, false);
		Shopping purchase = new Shopping(900, "electronic");
		
		float discountPercentage = getDiscountPercentage(medha, purchase);
		

		float pyamentAfterDiscount = ((100 - discountPercentage) * purchase.billAmount) / 100;

		System.out.println("Total Bill (before discount): " + purchase.billAmount);
		System.out.println(medha.name + " got discount: " + discountPercentage + "%");
		System.out.println("Total Bill (after discount): " + pyamentAfterDiscount);
	}
	

	static int getDiscountPercentage(Customer customer, Shopping purchase) {
		int discountPercentage = 0;
		
		System.out.println(purchase.type);

		// No discount if grocery
		if (purchase.type == "grocery") {
			discountPercentage = 0;
			return discountPercentage;
		}
		
		// Employee
		if (customer.isEmployee) {
			discountPercentage = 30;
			return discountPercentage;
		}

		// Affiliate
		if (customer.isAffiliate) {
			discountPercentage = 10;
			return discountPercentage;
		}

		// 2 year old customer
		if (customer.isTwoYearOldCustomer()) {
			discountPercentage = 5;
			return discountPercentage;
		}

		// default
		return 0;
	}
	

}
