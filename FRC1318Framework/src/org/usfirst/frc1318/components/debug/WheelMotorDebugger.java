package org.usfirst.frc1318.components.debug;

import org.usfirst.frc1318.components.RobotComponentBase;
import org.usfirst.frc1318.components.controllers.TankDriveController;

public class WheelMotorDebugger extends RobotComponentBase {
	public static final double TEST_VOLTAGE = 0.3;
	private final TankDriveController controller;
	
	public WheelMotorDebugger(TankDriveController controller) {
		this.controller = controller;
	}
	
	public WheelMotorDebugger(){
		this(new TankDriveController());
	}
	
	public void teleopPeriodic() {
		controller.getLeftController().set(TEST_VOLTAGE);
		controller.getRightController().set(TEST_VOLTAGE);
	}
}
