package org.usfirst.frc1318.shared.data;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;

public class TankDriveSetpointsTest extends DataStructureTest{
	TankDriveSetPoints one;
	TankDriveSetPoints two;
	
	@Before
	public void setUp(){
		one = new TankDriveSetPoints();
		one.setAll(1000.0, 2000.0);
		two = new TankDriveSetPoints();
		two.setAll(-1200.0, 500.0);
	}
	
	@Override
	public void equals() {
		assertTrue(one.equals(one));
		assertFalse(one.equals(null));
		assertFalse(one.equals("not the same type"));
		assertFalse(one.equals(two));
		TankDriveSetPoints oneCopy = new TankDriveSetPoints();
		oneCopy.setAll(1000.0, 2000.0);
		assertEquals(one, oneCopy);
	}

	@Override
	public void copies() {
		assertFalse(one.equals(two));
		one.copyTo(two);
		assertEquals(one, two);
	}

}
