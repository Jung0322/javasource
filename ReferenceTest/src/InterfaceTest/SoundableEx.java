package InterfaceTest;

import javax.management.loading.PrivateClassLoader;

public class SoundableEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printSound(new Cat());
		printSound(new Dog());
		
		
	}
	private static void printSound(Soundable soundable) {
		System.out.println(soundable.sound());
	}

}
