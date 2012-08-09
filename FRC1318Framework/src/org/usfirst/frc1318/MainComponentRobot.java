package org.usfirst.frc1318;

import org.usfirst.frc1318.components.controllers.*;
import org.usfirst.frc1318.components.reference.*;
import org.usfirst.frc1318.components.kinematics.*;
import org.usfirst.frc1318.components.debug.*;

public class MainComponentRobot extends IterativeComponentRobot {

	public BotVector currentRobotComponents() {
		return fullTankDrive();
	}
	
	public BotVector fullTankDrive(){
		BotVector components = new BotVector();
		components.add(new JoystickReader());
		components.add(new EncoderReader());
		components.add(new TankDriveSetPointKinematics());
		components.add(new TankDriveController());
		return components;
	}
	
	public BotVector debugWheelMotor(){
		BotVector components = new BotVector();
		components.add(new WheelMotorDebugger());
		return components;
	}
	
	public BotVector debugWheelEncoder(){
		BotVector components = new BotVector();
		components.add(new WheelEncoderDebugger());
		return components;
	}
	
	public BotVector debugJoystickAxis(){
		BotVector components = new BotVector();
		components.add(new JoystickAxisDebugger());
		return components;
	}

}
