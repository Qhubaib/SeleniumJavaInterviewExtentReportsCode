package seleniuminterviewtopics;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionExample {
	
	/***
	 * In case of softAssertion -- if we execute the testcase without calling assertion.assertAll() Method
	 *   it won't fail any assertion we written in the code - even though the code is having mismatch between expected vs actual
	 *   it will simply pass the testcase
	 *   so compulsory we need to use assertion.assertAll() method in the end -- so that it will execute all the validations
	 *     if any validation got failed it wont stop the execution at that step & it will continue the program till the end
	 *     if any failed it will make entire testcase as failed
	 *     
	 * In case hard Assertion -- if any validation is getting failed it will stop the execution at that particular step
	 *    and it will fail the entire testcase immediately --> it wont move for further step also
	 */
	
	@Test(priority=1)
	public void softAssertTest()
	{
		SoftAssert assertion = new SoftAssert();
		assertion.assertEquals(12, 789,"Assertion Softing got failed");
		System.out.println("Soft Assertion successfully completed -- PASS");
		assertion.assertFalse(true, "This condition is true");
		assertion.assertAll();
		
	}
	
	@Test(priority=2)
	public void hardAssertTest()
	{
		Assert.assertNotEquals(12, 11,"hard assertion got failed");
		System.out.println("Hard Assertion successfully completed -- PASS");
		
		Assert.assertTrue(true,"This statement is not true");
	}
	

}
