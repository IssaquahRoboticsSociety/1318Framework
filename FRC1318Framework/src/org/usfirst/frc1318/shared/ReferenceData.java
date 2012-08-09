package org.usfirst.frc1318.shared;

import org.usfirst.frc1318.shared.data.DrivetrainEncoderData;
import org.usfirst.frc1318.shared.data.TankDriveInput;

public class ReferenceData {
	
	private static ReferenceData instance;
	
	public static ReferenceData getInstance() {
		if(instance == null)
			instance = new ReferenceData();
		return instance;
	}
	
	private DrivetrainEncoderData dted;
	private TankDriveInput tdin;
	
	private ReferenceData() {}

	public void clear() {
		instance = new ReferenceData();
	}

	public DrivetrainEncoderData getDrivetrainEncoderData() {
		if(dted == null)
			dted = new DrivetrainEncoderData();
		return dted;
	}

	public TankDriveInput getTankDriveInput() {
		if(tdin == null)
			tdin = new TankDriveInput();
		return tdin;
	}
	


}
