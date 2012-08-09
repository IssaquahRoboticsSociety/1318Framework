package org.usfirst.frc1318.shared.constants;

import edu.wpi.first.wpilibj.SensorBase;

public interface PortRef {
	int JS_LEFT_PORT = 1;
	int JS_RIGHT_PORT = 2;
	int ENC_LEFT_A_CHNL = 6;
	int ENC_LEFT_B_CHNL = 7;
	int ENC_RIGHT_A_CHNL = 8;
	int ENC_RIGHT_B_CHNL = 9;
	
	int MTR_SLOT = SensorBase.getDefaultDigitalModule();
	int MTR_LEFT_CHNL = 1;
	int MTR_LEFT_SLOT = MTR_SLOT;
	int MTR_RIGHT_CHNL = 2;
	int MTR_RIGHT_SLOT = MTR_SLOT;
	

}
