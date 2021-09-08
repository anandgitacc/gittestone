package org.computer;

public class Desktop extends Computer {
	
	public void desktopSize() {
		System.out.println("Desktop Size : Medium");
	}
	public static void main(String[] args) {
		Desktop a = new Desktop();
		a.computerMode1();
		a.desktopSize();
	}

}
