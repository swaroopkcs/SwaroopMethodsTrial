package compositionTrial;

public class ShoppingMall {
	private String name;
	Store[] store = new Store[5];
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Store[] getStore() {
		return store;
	}
	public void setStore(Store[] store) {
		this.store = store;
	}

}
