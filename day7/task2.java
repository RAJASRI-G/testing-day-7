package day7;

import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class task2 {
	int a=1,b=2,c=0;
	@Test(priority=2)
	public void add(){
		c=a+b;
		Assert.assertEquals(3, c);
		System.out.println("ADDITION "+c);
	}
	@Test(priority=2)
	public void sub(){
		c=b-a;
		Assert.assertEquals(1, c);
		System.out.println("SUBTRACTION "+c);
	}
	@Test(priority=3)
	public void multiply(){
		c=a*b;
		Assert.assertEquals(2, c);
		System.out.println("MULTIPLICATION "+c);
	}
	@Test(priority=4)
	public void division(){
		c=b/a;
		Assert.assertEquals(2, c);
		System.out.println("DIVISION "+c);
	}

}
