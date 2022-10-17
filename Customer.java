package mp2;

class Customer {
	private double sumOfPurchase = 0;
	private int amountOfItems = 0;
	
	double getSumOfPurchase() {
		return sumOfPurchase;
	}
	
	int getAmountOfItems() {
		return amountOfItems;
	}
	
	void purchase(double price) {
		sumOfPurchase += price;
		amountOfItems++;
	}
	
}
