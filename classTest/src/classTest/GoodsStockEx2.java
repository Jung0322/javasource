package classTest;

public class GoodsStockEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GoodsStock2 goodsStock = new GoodsStock2(100, "p12345");
		int tot = goodsStock.getter();
		tot = goodsStock.totalDown(5);
		System.out.println(tot);
		goodsStock.totalUp(4);
	}

}
