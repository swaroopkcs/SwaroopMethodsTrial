package compositionTrial;

public class Store {
	private String name;
	private String[] itemsSold;
	private double area;
	private int numberOFPeoplePermitted;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String[] getItemsSold() {
		return itemsSold;
	}
	public void setItemsSold(String[] itemsSold) {
		this.itemsSold = itemsSold;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public int getNumberOFPeoplePermitted() {
		return numberOFPeoplePermitted;
	}
	public void setNumberOFPeoplePermitted(int numberOFPeoplePermitted) {
		this.numberOFPeoplePermitted = numberOFPeoplePermitted;
	}

}
