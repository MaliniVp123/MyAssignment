package Abstract;

public abstract class MultipleLanguage implements TestTool {

	@Override
	public void Java() {
		System.out.println("LearnJava");
		
	}

	@Override
	public void Selenium() {
		System.out.println("LearnSelenium");
		
	}
	public abstract void python();

}
