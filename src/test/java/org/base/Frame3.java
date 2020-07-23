package org.base;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class Frame3 {
@Test
	public void t4() {
	       Assert.assertTrue(true);
	       Assert.assertTrue(true);
	       Assert.assertTrue(true);
	       Assert.assertTrue(false);
	       Assert.assertTrue(true);
	}

@Ignore
@Test
	public void t5() {
		Assert.assertTrue(true);
		Assert.assertTrue(true);
		Assert.assertTrue(true); 
		Assert.assertTrue(false);
		Assert.assertTrue(true);
	}

@Test
	public void t6() {
			Assert.assertTrue(true);
			Assert.assertTrue(true);
			Assert.assertTrue(true);
			Assert.assertTrue(true);
			Assert.assertTrue(true);
			
		
	}
	  
	   
		
	}




