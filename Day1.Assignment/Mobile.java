package Day1.Assignment;

public class Mobile {
	public void SwitchOn() {
		System.out.println("SwitchOn");
	}
	
	public void PlayMusic() {
		System.out.println("PlayMusic");
	}
	
	public void Message() {
		System.out.println("Message");
	}
	
	public void ShareReels() {
		System.out.println("ShareReels");
	}
	public void SwitchOff() {
		System.out.println("SwitchOff");
	}
	
	public static void main(String[] args) {
		Mobile redmi=new Mobile();
		redmi.SwitchOn();
		redmi.PlayMusic();
		redmi.Message();
		redmi.ShareReels();
		redmi.SwitchOff();
		}

}
