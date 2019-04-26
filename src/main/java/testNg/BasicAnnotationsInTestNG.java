//Comment
package testNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BasicAnnotationsInTestNG {

	@BeforeTest
	public void test1() {
		System.out.println("you are in your before test");
	}

	@BeforeClass
	public void test2() {
		System.out.println("you are in your before class");
	}

	@BeforeMethod
	public void test3() {
		System.out.println("you are in your befor emethod");
	}

	@Test
	public void test4() {
		System.out.println("you are in your 1st test metho");
	}

	@Test
	public void test5() {
		System.out.println("you are in your 2nd test metho");
	}


	@AfterTest
	public void test6() {
		System.out.println("you are in your after test");
	}

	@AfterClass
	public void test7() {
		System.out.println("you are in your  after class");
	}

	@AfterMethod
	public void test8() {
		System.out.println("you are in your  after method");
	}
}
