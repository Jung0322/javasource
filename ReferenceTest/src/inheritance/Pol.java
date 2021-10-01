package inheritance;

public class Pol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent2 parent2 = new Child3();
		
		parent2.field1="";
		parent2.method1();
		parent2.method2();
		
		Child3 child3 = (Child3) parent2;
		
		child3.method3();
		
		Parent2 objParent2 = new Parent2();
		Child3 c2 = (Child3) objParent2;
		c2.method3();
	}

}
