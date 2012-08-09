package org.usfirst.frc1318.components.reference;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.usfirst.frc1318.components.ComponentTest;
import org.usfirst.frc1318.shared.ReferenceData;
import org.usfirst.frc1318.shared.data.TankDriveInput;

import edu.wpi.first.wpilibj.Joystick;

public class JoystickReaderTest extends ComponentTest{
	@Mock Joystick rightJoystick;
	@Mock Joystick leftJoystick;
	
	JoystickReader reader;
	
	TankDriveInput expected;
	
	@Before
	public void setUp(){
		MockitoAnnotations.initMocks(this);
		expected = new TankDriveInput();
		reader = new JoystickReader(leftJoystick, rightJoystick);
	}
	
	@Test
	public void mapsToTankDrive() {
		when(rightJoystick.getY()).thenReturn(1.0);
		when(leftJoystick.getY()).thenReturn(0.5);
		expected.setAll(0.5, 1.0);
		
		reader.teleopPeriodic();
		
		assertEquals(expected, 
				ReferenceData.getInstance().getTankDriveInput());
	}
	
	@Test
	public void doesNotReadInAutonomousMode(){
		when(rightJoystick.getY()).thenReturn(1.0);
		when(leftJoystick.getY()).thenReturn(0.5);
		
		reader.autonomousPeriodic();
		
		assertEquals(new TankDriveInput(), 
				ReferenceData.getInstance().getTankDriveInput());
	}
	

}
