package org.usfirst.frc1318.shared.data;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;

public class TankDriveInputTest extends DataStructureTest{
	TankDriveInput one;
	TankDriveInput two;
	
	@Before
	public void setUp(){
		one = new TankDriveInput();
		two = new TankDriveInput();
		one.setAll(-1.0, 1.0);
		two.setAll(0.0, 0.25);
	}
	
	@Override
	public void equals() {
		assertTrue(one.equals(one));
		assertFalse(one.equals(null));
		assertFalse(one.equals("not the same type"));
		assertFalse(one.equals(two));
		TankDriveInput oneCopy = new TankDriveInput();
		oneCopy.setAll(-1.0, 1.0);
		assertEquals(one, oneCopy);
		
	}

	@Override
	public void copies() {
		assertFalse(one.equals(two));
		one.copyTo(two);
		assertEquals(one, two);
	}
	
	
	

}
