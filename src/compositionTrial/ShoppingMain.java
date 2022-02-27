package compositionTrial;

public class ShoppingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShoppingMall shoppingMall = new ShoppingMall();
		shoppingMall.setName("Bramlea Mall");
		Store store1 = new Store();
		store1.setName("BestBuy");
		String[] items = {"TV", "Appliances", "Computers"};
		store1.setItemsSold(items);
		store1.setArea(5431.22);
		store1.setNumberOFPeoplePermitted(55);
		
		
		

	}

}
