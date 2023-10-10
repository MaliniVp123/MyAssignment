package org.system;

public class Desktop extends Computer {

	@Override
	public void computerModel() {
		System.out.println("Xiami");
	}

	public void DeskStopSize() {
		System.out.println("15");
	}
	
public static void main(String[] args) {
	Desktop dk=new Desktop();
	dk.computerModel();
	dk.DeskStopSize();
	
}
}
