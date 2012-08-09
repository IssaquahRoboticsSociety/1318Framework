package org.usfirst.frc1318.components.debug;
import static org.mockito.Mockito.*;

import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.usfirst.frc1318.components.ComponentTest;
import org.usfirst.frc1318.components.debug.WheelEncoderDebugger;
import org.usfirst.frc1318.components.reference.EncoderReader;

import edu.wpi.first.wpilibj.Encoder;

public class WheelEncoderDebuggerTest extends ComponentTest {
	private static final String format = "ENC_R_POS: %s ENC_L_RATE: %s ENC_R_POS: %s ENC_R_RATE: %s";
	@Mock Encoder left;
	@Mock Encoder right;
	@Mock PrintStream report;
	
	EncoderReader reader;
	WheelEncoderDebugger debugger;
	
	@Before
	public void setUp(){
		MockitoAnnotations.initMocks(this);
		reader = new EncoderReader(left, right);
		debugger = new WheelEncoderDebugger(reader, report);
	}
	
	@Test
	public void reportsEncoderReadings(){
		when(left.getDistance()).thenReturn(1.0, 12.3);
		when(left.getRate()).thenReturn(100.0, -6.6);
		when(right.getDistance()).thenReturn(40.0, 23.5);
		when(right.getRate()).thenReturn(27.0, 89.1);
		
		debugger.teleopPeriodic();
		
		verify(report).println(String.format(
				format, 1, 100, 40, 27));
		
		debugger.teleopPeriodic();
		verify(report).println(String.format(
				format, 12, -6, 23, 89));
	}

}
