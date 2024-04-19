package AssertionsPractise;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAsserions {

	@Test
		public void stringValue() {
			SoftAssert sa = new SoftAssert();
			System.out.println("--line 1--");
			System.out.println("--line 2--");
			
			sa.assertSame("A","a");
			
			System.out.println("--line 3--");
			
			sa.assertAll();
			}
	}

