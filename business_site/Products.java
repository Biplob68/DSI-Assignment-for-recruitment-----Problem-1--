package business_site;

import java.util.*;


public class Products {

	private int productName, buyPrice, sellPrice, availableProductNum, totalProfit;
	
	//A constructor to set Product informations 
	Products(int productName, int buyPrice, int sellPrice, int availableProductNum){
		this.productName = productName;
		this.buyPrice = buyPrice;
		this.sellPrice = sellPrice;
		this.availableProductNum = availableProductNum;
		totalProfit = 0; // Initially total profit is Zero
		
	}
	
	public int getproductName() {
		return productName;
	}
	
	public int getbuyPrice() {
		return buyPrice;
	}
	
	public int getsellPrice() {
		return sellPrice;
	}
	
	public int availableProduct() {
		return availableProductNum;
	}
	
	
	public void updateProfit(int number) {
		totalProfit += number;
	}
	
	public void addProduct (int number) {
		availableProductNum += number;
	}
	
	public void sellProduct(int number) {
		availableProductNum -= number;
	}
	
	
	public void displayproductInfo() {
		/// A method to return the whole product information
	
		System.out.println("product Name: " +productName);
		System.out.println("Buy Price: " +buyPrice);
		System.out.println("Sell Price: " +sellPrice);
		System.out.println("Available number in the inventory: " +availableProductNum);
		System.out.println("Total profit " +totalProfit);
	}
	
}
