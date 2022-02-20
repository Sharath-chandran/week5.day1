package testNG;

import org.testng.annotations.Test;

public class Attributes {

	@Test
	public void Method1() {
		System.out.println("Output_1");
	}

	@Test(priority = 1, invocationCount = 5)
	public void Method2() {
		System.out.println("Invocation");
	}

	@Test(priority = 2, enabled = true)
	public void Method3() {
		System.out.println("Output_True");
	}

	@Test(enabled = false)
	public void Method4() {
		System.out.println("No Output");
	}

}
