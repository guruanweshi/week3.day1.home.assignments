package org.bank;

public class AxisBank extends BankInfo {
	
	public static void main(String[] args) {
		
		AxisBank obj = new AxisBank();
		
		obj.saving();
		obj.fixed();
		obj.deposit();
		
	}
	
	public  void deposit() {
		System.out.println("Money Deposited to your account in the Axis Bank");
	}

}
