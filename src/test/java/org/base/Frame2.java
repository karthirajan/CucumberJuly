package org.base;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class Frame2 {
@Test
public void t1() {
	       Assert.assertTrue(true);
	       Assert.assertTrue(true);
	       Assert.assertTrue(true);
	       Assert.assertTrue(false);
	       Assert.assertTrue(true);
	}

@Ignore
@Test
public void t2() {
		Assert.assertTrue(true);
		Assert.assertTrue(true);
		Assert.assertTrue(true);
		Assert.assertTrue(false);
		Assert.assertTrue(true);
	}

@Test
public void t3() {
			Assert.assertTrue(true);
			Assert.assertTrue(true);
			Assert.assertTrue(true);
			Assert.assertTrue(true);
			Assert.assertTrue(true);
			
}
}
