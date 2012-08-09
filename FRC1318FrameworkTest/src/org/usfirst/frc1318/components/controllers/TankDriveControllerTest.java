package org.usfirst.frc1318.components.controllers;

import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.usfirst.frc1318.components.ComponentTest;
import org.usfirst.frc1318.shared.KinematicData;
import org.usfirst.frc1318.shared.constants.RobotSpecs;
import org.usfirst.frc1318.shared.data.TankDriveSetPoints;

import edu.wpi.first.wpilibj.SpeedController;

public class TankDriveControllerTest extends ComponentTest {
	@Mock SpeedController rightMotor;
	@Mock SpeedController leftMotor;
	
	TankDriveController controller;
	TankDriveSetPoints desiredSpeeds;
	
	@Before
	public void setUp(){
		MockitoAnnotations.initMocks(this);
		controller = new TankDriveController(leftMotor, rightMotor);
		desiredSpeeds = new TankDriveSetPoints();
	}
	
	
	@Test
	public void runsOpenLoop(){
		desiredSpeeds.setAll(1.0*RobotSpecs.MAX_WHEEL_RATE, 0.5 *RobotSpecs.MAX_WHEEL_RATE);
		desiredSpeeds.copyTo(KinematicData.getInstance().getTankDriveSetPoints());
		
		controller.teleopPeriodic();
		
		verify(leftMotor).set(1.0);
		verify(rightMotor).set(0.5);
		
	}	
}
