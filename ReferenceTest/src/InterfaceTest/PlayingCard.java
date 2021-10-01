package InterfaceTest;

public interface PlayingCard {
	//pulbic static final 생략가능
	int SPADE = 4 ;
	int DIAMOND = 3; 
	int Heart = 2;
	
	//public abstract 생략가능
	String getCardKind();

	String getCardNumber();
}
