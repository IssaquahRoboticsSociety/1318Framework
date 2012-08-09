package org.usfirst.frc1318.components.debug;

import static org.mockito.Mockito.verify;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.usfirst.frc1318.components.ComponentTest;
import org.usfirst.frc1318.components.controllers.TankDriveController;
import org.usfirst.frc1318.components.debug.WheelMotorDebugger;

import edu.wpi.first.wpilibj.SpeedController;

public class WheelMotorDebuggerTest extends ComponentTest{
	@Mock SpeedController left;
	@Mock SpeedController right;
	
	TankDriveController controller;
	WheelMotorDebugger integrator;
	
	@Before
	public void setUp(){
		MockitoAnnotations.initMocks(this);
		controller = new TankDriveController(left, right);
		integrator = new WheelMotorDebugger(controller);
	}
	
	@Test
	public void sendsMotorsTestVoltage(){
		integrator.teleopPeriodic();
		verify(left).set(WheelMotorDebugger.TEST_VOLTAGE);
		verify(right).set(WheelMotorDebugger.TEST_VOLTAGE);
	}

}
