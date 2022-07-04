package com.junit1;

import static org.junit.Assert.*;

import org.junit.Test;

import com.junit.WithOutTestCase;

public class WithTestCase {
	
	@Test
	
	public void testFindMax(){  
  assertEquals(4,WithOutTestCase.findMax(new int[]{1,3,4,2}));  
  assertEquals(1,WithOutTestCase.findMax(new int[]{-12,-1,-3,-4,-2}));  
}
}
