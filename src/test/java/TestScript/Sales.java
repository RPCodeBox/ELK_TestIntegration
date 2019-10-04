package TestScript;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Sales {
	@Test(description = "Login")
	public void TS01_Login() {
		Assert.assertTrue(true);
	}

	@Test(description = "Search for flights")
	public void TS02_Search() {
		Assert.assertTrue(true);
	}

	@Test(description = "Select flight")
	public void TS03_Select() {
		Assert.assertTrue(true);
	}

	@Test(description = "Book flight")
	public void TS04_Book() {
		Assert.assertTrue(true);
	}

	@Test(description = "Add to Cart")
	public void TS05_AddCart() {
		Assert.assertTrue(false);
	}
}
