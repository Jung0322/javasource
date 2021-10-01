package classTest;

public class GoodsStock2 {
	private int total;
	private String code;
	public GoodsStock2(int total,  String code) {
		// TODO Auto-generated constructor stub
		this.code = code;
		this.total = total;
	}
	
	int totalDown(int i) {
		this.total+=i;
		return this.total;
		
	}
	
	void totalUp(int i) {
		this.total-=i;
		System.out.print(total);
		
	}
	
	int getter() {
		return total;
	}
}
