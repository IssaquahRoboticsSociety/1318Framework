package org.usfirst.frc1318.components.kinematics;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.usfirst.frc1318.components.ComponentTest;
import org.usfirst.frc1318.shared.KinematicData;
import org.usfirst.frc1318.shared.ReferenceData;
import org.usfirst.frc1318.shared.constants.RobotSpecs;
import org.usfirst.frc1318.shared.data.TankDriveInput;
import org.usfirst.frc1318.shared.data.TankDriveSetPoints;

public class TankDriveKinematicsTest extends ComponentTest{
	TankDriveInput inputData;
	TankDriveSetPoints expected;
	
	TankDriveSetPointKinematics calc;
	
	@Before
	public void setUp(){
		inputData = new TankDriveInput();
		expected = new TankDriveSetPoints();
		calc = new TankDriveSetPointKinematics();
	}
	
	
	@Test
	public void convertsInputToEncoderTicks(){
		inputData.setAll(-0.25, 0.5);
		expected.setAll(-0.25 * RobotSpecs.MAX_WHEEL_RATE, 0.5 *RobotSpecs.MAX_WHEEL_RATE);
		
		inputData.copyTo(ReferenceData.getInstance().getTankDriveInput());
		
		calc.teleopPeriodic();
		
		assertEquals(expected, KinematicData.getInstance().getTankDriveSetPoints());
	}
}
