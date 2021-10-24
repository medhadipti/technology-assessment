import java.util.Date;

public class Assessment {

	public static void main(String[] args) {
		Customer medha = new Customer("Medha", 1, new Date(), true, false);
		Shopping purchase = new Shopping(900, "electronic");
		
		int discountPercentage = getDiscountPercentage(medha, purchase);
		float paymentAfterDiscount = ((100 - discountPercentage) * purchase.billAmount) / 100;
		
		float extraDiscount = getExtraDiscount(paymentAfterDiscount);
		float paymentAfterExtraDiscount = paymentAfterDiscount - extraDiscount;
		
		
		System.out.println("Total Bill (before discount): " + purchase.billAmount);
		System.out.println(medha.name + " got %age discount: " + discountPercentage + "%");
		System.out.println("Total Bill (after %age discount): " + paymentAfterDiscount);

		System.out.println(medha.name + " got extra discount: " + extraDiscount);
		System.out.println("Total Bill (after extra discount): " + paymentAfterExtraDiscount);
	}
	

	static int getDiscountPercentage(Customer customer, Shopping purchase) {
		int discountPercentage = 0;

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
	
	static float getExtraDiscount(float amount) {
		float discountAmount = (float) (Math.floor(amount/100) * 5);
		return discountAmount;
	}

}
