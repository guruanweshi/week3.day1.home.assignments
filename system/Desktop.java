package org.system;

public class Desktop extends Computer {
	public static void main(String[] args) {
		
		Desktop obj = new Desktop();
		obj.computerModel();
		System.out.println("Desktop Size Is "+obj.desktopSize()+" Inches");
		
	}
	
	
	public static int desktopSize() {
		return(27);
	}

}
