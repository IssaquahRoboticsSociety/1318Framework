package org.usfirst.frc1318.components.debug;

import java.io.PrintStream;

import org.usfirst.frc1318.components.RobotComponentBase;
import org.usfirst.frc1318.components.reference.EncoderReader;

public class WheelEncoderDebugger extends RobotComponentBase {
	private final EncoderReader reader;
	private final PrintStream report;
	
	public WheelEncoderDebugger(EncoderReader reader, PrintStream report) {
		this.reader = reader;
		this.report = report;
	}
	
	public WheelEncoderDebugger() {
		this(new EncoderReader(), System.out);
	}
	
	public void teleopPeriodic(){
		report.println(
				"ENC_R_POS: " + (int) reader.getLeftEnc().getDistance()+
				" ENC_L_RATE: " + (int) reader.getLeftEnc().getRate() + 
				" ENC_R_POS: " + (int) reader.getRightEnc().getDistance() + 
				" ENC_R_RATE: " + (int) reader.getRightEnc().getRate()
				);
	}

}
