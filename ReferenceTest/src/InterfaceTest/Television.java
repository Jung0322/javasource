package InterfaceTest;

public class Television implements RemoteControl, searchable {
	private int volume;

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("TV¸¦ ÄÕ´Ï´Ù.");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("TV¸¦ ²ü´Ï´Ù.");
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

		System.out.println("ÇöÀçº¼·ý: " + this.volume);
	}

	@Override
	public void search(String url) {
		// TODO Auto-generated method stub
		System.out.println(url + "°Ë»ö");
	}

}
