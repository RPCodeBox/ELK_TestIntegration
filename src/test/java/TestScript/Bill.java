package TestScript;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Bill {
	@Test(description = "Sales")
	public void TS01_Sales() {
		Assert.assertTrue(true);
	}

	@Test(description = "Checkout Cart")
	public void TS02_Checkout() {
		Assert.assertTrue(true);
	}

	@Test(description = "Select Mode")
	public void TS03_SelectMode() {
		Assert.assertTrue(false);
	}

	@Test(description = "Pay credit card")
	public void TS04_Payment() {
		Assert.assertTrue(true);
	}

	@Test(description = "Logout")
	public void TS05_Logout() {
		Assert.assertTrue(false);
	}
}
