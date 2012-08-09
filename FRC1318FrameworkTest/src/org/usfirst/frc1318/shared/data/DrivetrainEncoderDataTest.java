package org.usfirst.frc1318.shared.data;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class DrivetrainEncoderDataTest {
	DrivetrainEncoderData one;
	DrivetrainEncoderData two;
	
	@Before
	public void setUp() {
		one = new DrivetrainEncoderData();
		one.setAll(1.0, 20.0, 3.0, 40.0);
		two = new DrivetrainEncoderData();
		two.setAll(3.0, 20.0, 5.0, 50.0);
	}
	
	@Test
	public void copies(){
		assertFalse(one.equals(two));
		one.copyTo(two);
		assertEquals(one, two);
	}
	
	@Test
	public void equals(){
		assertTrue(one.equals(one));
		assertFalse(one.equals(null));
		assertFalse(one.equals("not the same type"));
		assertFalse(one.equals(two));
		DrivetrainEncoderData oneCopy = new DrivetrainEncoderData();
		oneCopy.setAll(1.0, 20.0, 3.0, 40.0);
		assertEquals(one, oneCopy);
	}

}
