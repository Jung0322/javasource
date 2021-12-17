package lambda;

public class TravelCustomer {
	private int age;
	private int price;
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public TravelCustomer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TravelCustomer(String name, int age, int price) {
		super();
		this.name = name;
		this.age = age;
		this.price = price;
	}
	@Override
	public String toString() {
		return "TravelCustomer [name=" + name + ", age=" + age + ", price=" + price + ", getName()=" + getName()
				+ ", getAge()=" + getAge() + ", getPrice()=" + getPrice() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
}
