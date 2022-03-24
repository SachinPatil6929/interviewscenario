package com.prowings.interviewscenario.immutableclass;

public class TestImmutability {
	public static void main(String[] args) {
		Address address = new Address();
		address.setCity("Pune");
		address.setCountry("India");
		address.setPin(416211);
		ImmutableEmployee emp1 = new ImmutableEmployee(123,"Sachin",address);
		System.out.println("emp1 befor modification "+emp1);
		emp1.getAddress().setCity("Kolhapur");
		System.out.println("emp1 after modification "+emp1);
		
		
	}

}
