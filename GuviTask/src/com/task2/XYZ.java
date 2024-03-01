package com.task2;

import java.util.Scanner;

public class XYZ {
	 public static void main(String[] args) {
		    //getting number of products and storing in array
		    Scanner sc=new Scanner(System.in);
		    System.out.println("Enter the number of products");
		    int n=sc.nextInt();
		    Product[] productInfo=new Product[n];

		    for(int i=0;i<n;i++){
		        System.out.println("Enter details for product " + (i+1) + ":");
		        System.out.print("Enter pid: ");
		        int pid = sc.nextInt();
		        System.out.print("Enter price: ");
		        double price = sc.nextDouble();
		        System.out.print("Enter quantity: ");
		        int quantity = sc.nextInt();
		        productInfo[i] = new Product(pid, price, quantity);

		     }
		    
		    //calculating highest Price
		        int maxPriceIndex = 0;
		        for (int i = 1; i < productInfo.length; i++) {
		            if (productInfo[i].price > productInfo[maxPriceIndex].price) {
		                maxPriceIndex = i;
		            }
		        }
		     //Displaying highest price and total amount spent on all products
		        System.out.println("Product with the highest price has pid: " + productInfo[maxPriceIndex].pid);
		        double totalAmount = calculateTotalAmount(productInfo);
		        System.out.println("Total amount spent on all products: " + totalAmount);


		    }

	 //Calculating Total amount
	 
	private static double calculateTotalAmount(Product[] productInfo) {
		double totalAmount = 0;
     for (Product product : productInfo) {
         totalAmount += product.price * product.quantity;
     }
     return totalAmount;
		
	}

}
