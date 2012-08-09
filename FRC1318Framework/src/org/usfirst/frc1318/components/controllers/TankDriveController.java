package org.usfirst.frc1318.components.controllers;

import org.usfirst.frc1318.components.RobotComponentBase;
import org.usfirst.frc1318.shared.KinematicData;
import org.usfirst.frc1318.shared.constants.RobotSpecs;
import org.usfirst.frc1318.shared.data.TankDriveSetPoints;

import edu.wpi.first.wpilibj.SpeedController;

public class TankDriveController extends RobotComponentBase {
	private final SpeedController left;
	private final SpeedController right;
	private final TankDriveSetPoints currentSetPoints;
	
	public TankDriveController(SpeedController left, SpeedController right) {
		this.left = left;
		this.right = right;
		currentSetPoints = new TankDriveSetPoints();
		
	}
	
	
	public void teleopPeriodic() {
		KinematicData.getInstance().getTankDriveSetPoints().copyTo(currentSetPoints);
		
		left.set(currentSetPoints.getLeftSpeed() / RobotSpecs.MAX_WHEEL_RATE);
		right.set(currentSetPoints.getRightSpeed() / RobotSpecs.MAX_WHEEL_RATE);
	}

}
