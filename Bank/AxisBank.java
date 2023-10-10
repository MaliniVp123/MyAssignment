package Bank;

public class AxisBank extends BankInfo {
public void deposit() {
	System.out.println("Deposit Balance Amount");
}
	public static void main(String[] args) {
		AxisBank bi=new AxisBank();
		bi.Saving();
		bi.Fixed();
		bi.deposit();

	}
	

}
