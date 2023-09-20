package Week2.Day1Assignment;

public class Fibonacci {
	
	public static void main(String[] args) {
	
	int FirstNumber1=0;
	int SecondNumber1=1;
	int Sum=0;
	
	System.out.println("First Number is=" +FirstNumber1+"\n"+"Second Number is=" +SecondNumber1+"\n");
	
		
	for(int i = 1; i <= 11; i++) { 
		
			Sum=FirstNumber1+SecondNumber1;
			
			System.out.println(Sum);
			
			FirstNumber1=SecondNumber1;
			
			SecondNumber1=Sum;
			
			

		}
	  
	}
  
}
