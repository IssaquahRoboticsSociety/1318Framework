package org.usfirst.frc1318.shared.data;

import org.junit.Test;

/**
 * All data structure tests should test the equals methods and copy functions of their data
 * structure classes. A valid equals method is imperative for other tests to build on the data structures,
 * and a valid copy method is vital for copying to and from the shared data structures.
 * @author violette
 *
 */
public abstract class DataStructureTest {
	@Test 
	public abstract void equals();
	
	@Test 
	public abstract void copies();
}
