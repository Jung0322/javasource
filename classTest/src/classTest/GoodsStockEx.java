package classTest;

public class GoodsStockEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GoodsStock goodsStock = new GoodsStock(100, "p12345");
		int tot = goodsStock.total;
		tot = goodsStock.totalDown(5);
		System.out.println(tot);
		goodsStock.totalUp(4);
	}

}
