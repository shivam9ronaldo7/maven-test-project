package test;

import org.junit.jupiter.api.Test;

public class TestAll {
	
	@Test
	public void test1() {
		WelcomeAll wel = new WelcomeAll();
		System.out.println();
		System.out.println("Introductory message: ");
		wel.welcome();
		System.out.println();
		System.out.println("Machine Details: ");
		wel.getMachineDetails();
		System.out.println();
	}
}
