package mp2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Item item1 = new Item("Sandals", 200, 35);
		Item item2 = new Item("Hellraiser VHS", 20, 350);
		DiscountedItem item3 = new DiscountedItem("Party tent", 1000, 5, 25);
		Customer customer = new Customer();
		int menuAlternative = 0;
		
		do {
			System.out.println("1. Buy " + item1.getName() + ", " + item1.getPrice() + " SEK, " + item1.getAmount() + " left");
			System.out.println("2. Buy " + item2.getName() + ", " + item2.getPrice() + " SEK, " + item2.getAmount() + " left");
			System.out.println("3. Buy " + item3.getName() + ", " + item3.getPrice() + " SEK, " + item3.getAmount() + " left");
			System.out.println("4. Quit");
			System.out.print("Choose your option: ");
			menuAlternative = scanner.nextInt();
			System.out.println();
			switch (menuAlternative){
				case 1:
					if(item1.getAmount() == 0) {
						System.out.println("The item is sold out.");
					}else {
						customer.purchase(item1.getPrice());
						item1.decrementAmount();
					}
					break;
				case 2:
					if(item2.getAmount() == 0) {
						System.out.println("The item is sold out.");
					}else {
						customer.purchase(item2.getPrice());
						item2.decrementAmount();
					}
					break;
				case 3:
					if(item3.getAmount() == 0) {
						System.out.println("The item is sold out.");
					}else {
						customer.purchase(item3.getPrice());
						item3.decrementAmount();
					}
					break;
				case 4: 
					System.out.println("You purchased a total of " + customer.getAmountOfItems() + " items. The total cost was " + customer.getSumOfPurchase() + " SEK");
					break;
				default:
					System.out.println("Menu alternative does not exist, try another");
					System.out.println();
			}
			
		} while (menuAlternative != 4);
		scanner.close();

	}

}
