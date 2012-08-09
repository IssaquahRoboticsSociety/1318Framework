package org.usfirst.frc1318.components.reference;

import org.usfirst.frc1318.components.RobotComponentBase;
import org.usfirst.frc1318.shared.ReferenceData;
import org.usfirst.frc1318.shared.constants.PortRef;
import org.usfirst.frc1318.shared.data.TankDriveInput;

import edu.wpi.first.wpilibj.Joystick;

public class JoystickReader extends RobotComponentBase{
	private final Joystick left;
	private final Joystick right;
	private final TankDriveInput tdInput;
	
	public JoystickReader(Joystick left, Joystick right) {
		this.left = left;
		this.right = right;
		tdInput = new TankDriveInput();
	}
	
	public JoystickReader() {
		this(new Joystick(PortRef.JS_LEFT_PORT), new Joystick(PortRef.JS_RIGHT_PORT));
	}

	public void teleopPeriodic(){
		tdInput.setAll(left.getY(), right.getY());
		
		tdInput.copyTo(ReferenceData.getInstance().getTankDriveInput());
	}
	
	public void autonomousPeriodic() {}

}
