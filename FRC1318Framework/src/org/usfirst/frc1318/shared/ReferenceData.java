package org.usfirst.frc1318.shared;

import org.usfirst.frc1318.shared.data.DrivetrainEncoderData;

public class ReferenceData {
	
	private static ReferenceData instance;
	
	public static ReferenceData getInstance() {
		if(instance == null)
			instance = new ReferenceData();
		return instance;
	}
	
	private DrivetrainEncoderData dted;
	
	private ReferenceData() {}

	public void clear() {
		instance = new ReferenceData();
	}

	public DrivetrainEncoderData getDrivetrainEncoderData() {
		if(dted == null)
			dted = new DrivetrainEncoderData();
		return dted;
	}
	


}
