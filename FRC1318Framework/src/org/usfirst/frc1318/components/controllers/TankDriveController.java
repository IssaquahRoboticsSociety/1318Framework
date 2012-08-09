package org.usfirst.frc1318.components.controllers;

import org.usfirst.frc1318.components.RobotComponentBase;
import org.usfirst.frc1318.shared.KinematicData;
import org.usfirst.frc1318.shared.constants.PortRef;
import org.usfirst.frc1318.shared.constants.RobotSpecs;
import org.usfirst.frc1318.shared.data.TankDriveSetPoints;

import edu.wpi.first.wpilibj.Jaguar;
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
	
	
	public TankDriveController() {
		this(new Jaguar(PortRef.MTR_LEFT_SLOT, PortRef.MTR_LEFT_CHNL),
			new Jaguar(PortRef.MTR_RIGHT_SLOT, PortRef.MTR_RIGHT_CHNL)				
		);
	}


	public void teleopPeriodic() {
		KinematicData.getInstance().getTankDriveSetPoints().copyTo(currentSetPoints);
		
		left.set(currentSetPoints.getLeftSpeed() / RobotSpecs.MAX_WHEEL_RATE);
		right.set(currentSetPoints.getRightSpeed() / RobotSpecs.MAX_WHEEL_RATE);
	}

}
