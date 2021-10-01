package classTest;

public class Card {
	String kind;
	int number;
	
	static int width = 7, height = 7;

	public Card(String kind, int number) {
		super();
		this.kind = kind;
		this.number = number;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
}
