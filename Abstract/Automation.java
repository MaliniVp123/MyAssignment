package Abstract;

public class Automation extends MultipleLanguage{

	@Override
	public void python() {
		System.out.println("Learn Python");
	}
	public static void main(String[] args) {
		Automation ml=new Automation();
		ml.Java();
		ml.Selenium();
		ml.python();
	}

}
