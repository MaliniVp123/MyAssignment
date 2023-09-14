package Day1.Assignment;

public class Car {
	public void ApplyBreak () {
		System.out.println("ApplyBreak");
	}
	
	public void PlayMusic() {
		System.out.println("PlayMusic");
	}
	
	public void SwitchOnAC() {
		System.out.println("SwitchOnAC");
	}
	
	public void Indicator() {
		System.out.println("Indicator");
	}
	
	public static void main(String[] args) {
		Car toyota=new Car();
		toyota.ApplyBreak();
		toyota.PlayMusic();
		toyota.SwitchOnAC();
		toyota.Indicator();
		}
	    
	    
}

