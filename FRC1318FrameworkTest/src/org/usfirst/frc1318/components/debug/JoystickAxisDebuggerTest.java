package org.usfirst.frc1318.components.debug;

import static org.mockito.Mockito.*;

import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.usfirst.frc1318.components.RobotComponentBase;
import org.usfirst.frc1318.components.reference.JoystickReader;

import edu.wpi.first.wpilibj.Joystick;

public class JoystickAxisDebuggerTest extends RobotComponentBase {
	private static final String format = "JS_L_X: %s JS_L_Y: %s JS_R_X: %s JS_R_Y: %s";
	@Mock PrintStream reportStream;
	@Mock Joystick left;
	@Mock Joystick right;
	
	JoystickReader reader;
	JoystickAxisDebugger debug;
	
	@Before
	public void setUp(){
		MockitoAnnotations.initMocks(this);
		reader = new JoystickReader(left, right);
		debug = new JoystickAxisDebugger(reader, reportStream);
	}
	
	@Test
	public void reportsJSValues(){
		when(left.getX()).thenReturn(1.0);
		when(left.getY()).thenReturn(0.0);
		when(right.getX()).thenReturn(-0.5);
		when(right.getY()).thenReturn(0.65);
		
		debug.teleopPeriodic();
		
		verify(reportStream).println(String.format(
				format, 1.0, 0.0, -0.5, 0.65));
	}

}
