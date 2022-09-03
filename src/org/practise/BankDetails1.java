package org.practise;
//childclass
public class BankDetails1 extends BankDetails{

	@Override
	public void accNo() {
System.out.println("9876543");	
	}

	@Override
	public void phNo() {
System.out.println("0987654329");		
	}

	
	@Override
	public void brach() {
System.out.println("kandhanchavdi");		
	}
public static void main(String[] args) {
	BankDetails1 bankdetails=new BankDetails1();
			bankdetails.empName();
			bankdetails.accNo();
			
			bankdetails.phNo();
			bankdetails.brach();
	}
}
