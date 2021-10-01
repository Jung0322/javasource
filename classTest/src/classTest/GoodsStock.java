package classTest;

public class GoodsStock {
	int total;
	String code;
	public GoodsStock(int total,  String code) {
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
}
