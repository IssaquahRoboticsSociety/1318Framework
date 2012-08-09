package org.usfirst.frc1318.components.debug;

import java.io.PrintStream;

import org.usfirst.frc1318.components.RobotComponentBase;
import org.usfirst.frc1318.components.reference.JoystickReader;

public class JoystickAxisDebugger extends RobotComponentBase{
	private final JoystickReader reader;
	private final PrintStream report;
	
	
	public JoystickAxisDebugger(JoystickReader reader, PrintStream report) {
		this.reader = reader;
		this.report = report;
	}
	
	public JoystickAxisDebugger(){
		this(new JoystickReader(), System.out);
	}
	
	public void teleopPeriodic() {
		report.println("JS_L_X: " + reader.getLeftJS().getX() +
				" JS_L_Y: " + reader.getLeftJS().getY() +
				" JS_R_X: " + reader.getRightJS().getX() +
				" JS_R_Y: " + reader.getRightJS().getY()
				);
	}

}
