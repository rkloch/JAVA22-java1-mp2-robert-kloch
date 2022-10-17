package mp2;

class DiscountedItem extends Item{
	private double discountPercentage;
	
	DiscountedItem(String name, double price, int amount, double discountPercentage) {
		super(name, price, amount);
		this.discountPercentage = discountPercentage;
	}
	
	double getPrice() {
		return super.getPrice() * (1 - discountPercentage / 100);
	}
}
