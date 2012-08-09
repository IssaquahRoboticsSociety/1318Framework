package org.usfirst.frc1318.shared.data;

public class TankDriveSetPoints {
	private double leftSpeed;
	private double rightSpeed;
	
	public void setAll(double leftSpeed, double rightSpeed) {
		setLeftSpeed(leftSpeed);
		setRightSpeed(rightSpeed);
	}
	
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(leftSpeed);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(rightSpeed);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TankDriveSetPoints other = (TankDriveSetPoints) obj;
		if (Double.doubleToLongBits(leftSpeed) != Double
				.doubleToLongBits(other.leftSpeed))
			return false;
		if (Double.doubleToLongBits(rightSpeed) != Double
				.doubleToLongBits(other.rightSpeed))
			return false;
		return true;
	}



	public double getLeftSpeed() {
		return leftSpeed;
	}

	public void setLeftSpeed(double leftSpeed) {
		this.leftSpeed = leftSpeed;
	}

	public double getRightSpeed() {
		return rightSpeed;
	}

	public void setRightSpeed(double rightSpeed) {
		this.rightSpeed = rightSpeed;
	}

	public void copyTo(TankDriveSetPoints other) {
		other.setAll(this.leftSpeed, this.rightSpeed);
	}
	
	

}
