package business_site;

import java.util.ArrayList;


public class productList {

	private ArrayList <Products> products = new ArrayList<Products> ();
	
	
	int i, l = products.size();
	
	
	
	public void add(int productName, int buyPrice, int sellPrice, int availableProductNum){
		Products newProduct = new Products(productName, buyPrice, sellPrice, availableProductNum);
		products.add(newProduct);
	}
	
	
	// Delet Product
	public void delete(int productName) {
		
		if(l == 0) {
			System.out.println("The Product list Empty!");
			return;
		}
		
		int flag = 0;
		for(i = 0 ; i < l; i++) {
			Products p = products.get(i);
			if(p.getproductName() == productName) {
				flag = 1;
				break;
			}
		}
		if(flag != 0) {
			products.remove(flag); // remove the product
			System.out.println("Products " + productName + " is deleted!");
		}
		else {
			System.out.println("The Product is not in the Product List!");
		}
	}
	
	
	public void buy(int productName, int number) {
		/// when a product is bought the amount is added 
		for(i = 0 ; i < l ; i++) {
			Products p = products.get(i);
			if(p.getproductName() == productName) {
				p.addProduct(number); 
				products.set(i, p); // Add new product of the product list
				 
				// Total Cost also reduce
				availableBalance.balance -= number * p.getbuyPrice();
				System.out.println("Product is bought");
				break;
			}
		}
	}
	
	

	public void sell(int productName, int number) {
		
		for(i = 0 ; i < l; i++) {
			Products p = products.get(i);
			if(p.getproductName() == productName) { 
				//profit from sell and buy
				int Profit = number * (p.getsellPrice() - p.getbuyPrice()); 
				
				p.sellProduct(number); // reduce product number
				p.updateProfit(Profit); // Update Profit
				
				// adding the sell price
				
				availableBalance.balance += number* p.getsellPrice();
				System.out.println("The Product is sold!");
				
				products.set(i, p); // update new product list
				
				return;
			}
		}
	}
	
	
	
	public void showList() {
		/// Function to print the entire product list
		int i, l = products.size();
		for(i = 0 ; i <l ; ++i) {
			Products product = products.get(i);
			product.getproductName();
			product.getbuyPrice();
			product.getsellPrice();
			
			System.out.println("Product number: " + (i + 1));
			
			product.displayproductInfo();
			
		
			System.out.println("");
		}
		
	}
	
	
}