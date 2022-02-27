package accessModifiers;

public class Person {
	private String name;

	private long sin;

	private long phone;

	public Person(String name, long sin, long phone) {
		super();
		this.name = name;
		this.sin = sin;
		this.phone = phone;
	}

	public long getSin(boolean bankCalling) {

		if (bankCalling) {
			return sin;
		}

		return 0;
	}

	public String getName() {
		return name;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		if (phone != 0) {
			this.phone = phone;
		}
	}
}
