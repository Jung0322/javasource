package classTest;

public class SubscriberInfo {
	private String name, id, password, tel, address;

	public SubscriberInfo(String name, String id, String password, String tel, String adressString) {
		super();
		this.name = name;
		this.id = id;
		this.password = password;
		this.tel = tel;
		this.address = adressString;
	}

	public SubscriberInfo(String name, String id, String password) {
		super();
		this.name = name;
		this.id = id;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getAdressString() {
		return address;
	}

	public void setAdressString(String adressString) {
		this.address = adressString;
	}
	
	void passchange(String pass) {
		this.password = pass;
	}
	
	void telchange(String tel) {
		this.tel = tel;
	}
	void addchange(String add) {
		this.address = add;
	}
}
