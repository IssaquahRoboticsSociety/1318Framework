package org.usfirst.frc1318.shared;

import org.usfirst.frc1318.shared.data.TankDriveSetPoints;

public class KinematicData {
	private static KinematicData instance;
	
	public static KinematicData getInstance() {
		if(instance == null)
			instance = new KinematicData();
		return instance;
	}
	
	private TankDriveSetPoints tdsp;
	
	private KinematicData() {}

	public void clear() {
		instance = new KinematicData();
	}

	public TankDriveSetPoints getTankDriveSetPoints() {
		if(tdsp == null)
			tdsp = new TankDriveSetPoints();
		return tdsp;
	}

}
