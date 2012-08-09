package org.usfirst.frc1318.components.reference;

import org.usfirst.frc1318.components.RobotComponentBase;
import org.usfirst.frc1318.shared.ReferenceData;
import org.usfirst.frc1318.shared.data.DrivetrainEncoderData;

import edu.wpi.first.wpilibj.Encoder;

public class EncoderReader extends RobotComponentBase {
	private final Encoder leftWheel;
	private final Encoder rightWheel;
	private final DrivetrainEncoderData currentWheelReadings;
	
	
	public EncoderReader(Encoder leftWheel, Encoder rightWheel) {
		this.leftWheel = leftWheel;
		this.rightWheel = rightWheel;
		currentWheelReadings = new DrivetrainEncoderData();
	}
	
	public void teleopPeriodic(){
		currentWheelReadings.setLeftDistance(leftWheel.getDistance());
		currentWheelReadings.setLeftRate(leftWheel.getRate());
		currentWheelReadings.setRightDistance(rightWheel.getDistance());
		currentWheelReadings.setRightRate(rightWheel.getRate());
		
		currentWheelReadings.copyTo(ReferenceData.getInstance().getDrivetrainEncoderData());
	}

}
