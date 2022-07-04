package com.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class WithTestCase {

	@Test
	public void test() {
		Square obj=new Square();
		obj.cal(3);
	}

}
