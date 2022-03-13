package com.jenkins.Tests;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * 
 */

/**
 * @author deept
 *
 */
public class JenkinsTestClass {
	@Parameters("Browser")
	@Test
	public void m1(String browserName) {
		System.out.println("The browser name is "+browserName);
		Assert.assertEquals(true, true);
	}
	
	@Test
	public void m2() {
		System.out.println("Jenkins second method");
		Assert.assertEquals(true, true);
	}
	
	@Parameters("Browser")
	@Test
	public void m3(String browserName) {
		System.out.println("The browser name is "+browserName);
		Assert.assertEquals(true, true);
	}
	
	@Test
	public void m4() {
		System.out.println("Jenkins fourth method");
		Assert.assertEquals(true, true);
	}
}
