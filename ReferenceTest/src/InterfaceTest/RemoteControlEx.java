package InterfaceTest;

import poly.Audio;

public class RemoteControlEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoteControl rControl = new Television();
		rControl.turnOn();
		rControl.setVolume(8);
		rControl.turnOff();
		
		System.out.println();
		
		RemoteControl rc1 = new RemoteControl() {
			
			private int volume;

			@Override
			public void turnOn() {
				System.out.println("TV�� �մϴ�.");
				
			}
			
			@Override
			public void turnOff() {
				System.out.println("TV�� ���ϴ�.");
				
			}
			
			@Override
			public void setVolume(int volume) {
				// TODO Auto-generated method stub
				if (volume > RemoteControl.Max_Volume)
					this.volume = RemoteControl.Max_Volume;
				else if (volume < RemoteControl.Min_Volume)
					this.volume = RemoteControl.Min_Volume;
				else {
					this.volume = volume;
				}

				System.out.println("���纼��: " + this.volume);
				
			}
		};
	
	}

}
