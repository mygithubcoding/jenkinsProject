import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * 
 */

/**
 * @author deept
 *
 */
public class JenkinsTestClass {
	@Test
	public void m1() {
		System.out.println("Jenkins first method");
		Assert.assertEquals(true, true);
	}
	
	@Test
	public void m2() {
		System.out.println("Jenkins second method");
		Assert.assertEquals(true, false);
	}
	
	@Test
	public void m3() {
		System.out.println("Jenkins third method");
		Assert.assertEquals(true, true);
	}
}
