package com.rana;

import java.util.List;

public class Application {

	 private static final String SHOP_NAME="Coke A";
	 
	 public static void main(String [] args)
	 {
		 ShopLocator ob = new ShopLocator(new PepsiShops());
		 
//		 To Change The Constructor Dependency to new CocaColaShops 
//		 ShopLocator ob = new ShopLocator(new CocaColaShops());
		 
		 List<Shops> shops = ob.find(SHOP_NAME, "2222");
		 
		 for(Shops shop : shops)
		 {
			 System.out.println("Search Shows  "+shop.getShopName() +"\n"
					 +"And  Products Available  "+shop.getKeyword());
		 }
	 }
}
