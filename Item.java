package mp2;

class Item {
	private String name;
	private double price;
	private int amount;

	Item(String name, double price, int amount){
		this.name = name;
		this.price = price;
		this.amount = amount;
	}
	
	String getName() {
		return name;
	}
	
	double getPrice(){
		return price;
	}
	
	int getAmount(){
		return amount;
	}
	
	void decrementAmount() {
		amount--;
	}
}