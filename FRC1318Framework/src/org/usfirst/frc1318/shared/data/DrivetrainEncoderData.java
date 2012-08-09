package org.usfirst.frc1318.shared.data;

public class DrivetrainEncoderData {
	private double leftDistance;
	private double leftRate;
	private double rightDistance;
	private double rightRate;
	

	public void setAll(double leftDistance, double leftRate, double rightDistance, double rightRate) {
		setLeftDistance(leftDistance);
		setRightDistance(rightDistance);
		setLeftRate(leftRate);
		setRightRate(rightRate);
	}

	
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(leftDistance);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(leftRate);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(rightDistance);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(rightRate);
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
		DrivetrainEncoderData other = (DrivetrainEncoderData) obj;
		if (Double.doubleToLongBits(leftDistance) != Double
				.doubleToLongBits(other.leftDistance))
			return false;
		if (Double.doubleToLongBits(leftRate) != Double
				.doubleToLongBits(other.leftRate))
			return false;
		if (Double.doubleToLongBits(rightDistance) != Double
				.doubleToLongBits(other.rightDistance))
			return false;
		if (Double.doubleToLongBits(rightRate) != Double
				.doubleToLongBits(other.rightRate))
			return false;
		return true;
	}



	public double getLeftDistance() {
		return leftDistance;
	}


	public void setLeftDistance(double leftDistance) {
		this.leftDistance = leftDistance;
	}


	public double getLeftRate() {
		return leftRate;
	}


	public void setLeftRate(double leftRate) {
		this.leftRate = leftRate;
	}


	public double getRightDistance() {
		return rightDistance;
	}


	public void setRightDistance(double rightDistance) {
		this.rightDistance = rightDistance;
	}


	public double getRightRate() {
		return rightRate;
	}


	public void setRightRate(double rightRate) {
		this.rightRate = rightRate;
	}


	public void copyTo(DrivetrainEncoderData two) {
		two.setAll(this.leftDistance, this.leftRate, this.rightDistance, this.rightRate);
	}
	
	

}
