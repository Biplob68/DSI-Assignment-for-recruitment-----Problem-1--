package business_site;

import java.util.*;


public class SmallShop {
	
	public void Shop() {
		Scanner sc = new Scanner (System.in);
		productList arra = new productList();
		int operations = 1000000;
		
		for(int i = 1 ; i <= operations ; i++) {
			System.out.println("Enter Operation Number: ");
			
			int number = sc.nextInt();
			int name, buy, sell, count;
					
			if (number == 1) {
				//Add a product
				System.out.println("Enter Product name: ");
				name = sc.nextInt();
				System.out.println("Enter Buy price: ");
				buy = sc.nextInt();
				System.out.println("Enter Sell price: ");
				sell = sc.nextInt();
				System.out.println("Available number in the inventory to sell: ");
			    count = sc.nextInt();
				
				
				arra.add(name, buy, sell, count);
				
				System.out.println("The Product is added!");
			}
			
			else if(number == 2) {
				// Delete a Product
				
				System.out.println("Enter the name of the product that want to delete: ");
				name = sc.nextInt();
				arra.delete(name);
			}
			
			else if(number == 3) {
				// Buy product
				
				System.out.println("Enter the product name that want to buy: ");
				name = sc.nextInt();
				System.out.println("Enter the amount of product that want to buy: ");
				int amount = sc.nextInt();
				
				arra.buy(name, amount);
				
			}
			
			else if(number == 4) {
				/// Sell product
				
				System.out.println("Enter the product name that want to sell: ");
			    name = sc.nextInt();
				System.out.println("Enter the amount of product that want to sell: ");
				int amount = sc.nextInt();
				
				arra.sell(name, amount);
			}
			
			
			else if(number == 5) {
				/// Show product list
				
				System.out.println("Available product list:\n");
				arra.showList();
			}
			
			else if(number == 6) {
				/// check available balance
				
				//System.out.println("Total balance: " + availableBalance.balance);
				System.out.println("Total balance: "+productList.balance);
				
			}
			
			else {
				System.exit(0);
			}
				
		}
	}
			
}
