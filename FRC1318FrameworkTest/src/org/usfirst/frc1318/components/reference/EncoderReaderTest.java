package org.usfirst.frc1318.components.reference;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.usfirst.frc1318.components.ComponentTest;
import org.usfirst.frc1318.shared.ReferenceData;
import org.usfirst.frc1318.shared.data.DrivetrainEncoderData;

import edu.wpi.first.wpilibj.Encoder;

public class EncoderReaderTest extends ComponentTest{
	@Mock Encoder leftWheel;
	@Mock Encoder rightWheel;
	EncoderReader reader;
	DrivetrainEncoderData expectedData;
	
	@Before
	public void setUp(){
		MockitoAnnotations.initMocks(this);
		reader = new EncoderReader(leftWheel, rightWheel);
		expectedData = new DrivetrainEncoderData();
		expectedData.setAll(100.0, 20.0, 90.0, 10.0);
	}
	
	@Test
	public void readsAngularVelocity(){
		when(leftWheel.getRate()).thenReturn(20.0);
		when(leftWheel.getDistance()).thenReturn(100.0);
		when(rightWheel.getRate()).thenReturn(10.0);
		when(rightWheel.getDistance()).thenReturn(90.0);
		
		reader.teleopPeriodic();
		
		assertEquals(expectedData, ReferenceData.getInstance().getDrivetrainEncoderData());
		
	}

}
