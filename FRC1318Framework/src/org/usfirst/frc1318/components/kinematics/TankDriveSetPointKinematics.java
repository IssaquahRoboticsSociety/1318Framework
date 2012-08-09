package org.usfirst.frc1318.components.kinematics;

import org.usfirst.frc1318.components.RobotComponentBase;
import org.usfirst.frc1318.shared.KinematicData;
import org.usfirst.frc1318.shared.ReferenceData;
import org.usfirst.frc1318.shared.constants.RobotSpecs;
import org.usfirst.frc1318.shared.data.TankDriveInput;
import org.usfirst.frc1318.shared.data.TankDriveSetPoints;

public class TankDriveSetPointKinematics extends RobotComponentBase{
	private final TankDriveInput currentInput;
	private final TankDriveSetPoints calculatedSetpoints;
	
	public TankDriveSetPointKinematics(){
		currentInput = new TankDriveInput();
		calculatedSetpoints = new TankDriveSetPoints();
	}
	
	
	public void teleopPeriodic(){
		ReferenceData.getInstance().getTankDriveInput().copyTo(currentInput);
		
		calculatedSetpoints.setAll(currentInput.getLeftSpeed() * RobotSpecs.MAX_WHEEL_RATE,
				currentInput.getRightSpeed() * RobotSpecs.MAX_WHEEL_RATE);
		
		calculatedSetpoints.copyTo(KinematicData.getInstance().getTankDriveSetPoints());
	}
	
}
