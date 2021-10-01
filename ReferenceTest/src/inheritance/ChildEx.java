package inheritance;

public class ChildEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child child = new Child(25);
		System.out.println("child age: "+child.getAge());
		
		Parent parent = new Child(26);
		System.out.print("child age: "+parent.getAge());
	}

}
