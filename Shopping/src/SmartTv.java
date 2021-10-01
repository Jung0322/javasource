import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class SmartTv extends Product {
	private String resolution;

	public SmartTv(String pname, int price, String resolution) {
		super(pname, price);
		// TODO Auto-generated constructor stub
		this.resolution = resolution;
	}

	@Override
	void printExtra() {
		System.out.println("ÇØ»óµµ: "+resolution);
		
	}



}
