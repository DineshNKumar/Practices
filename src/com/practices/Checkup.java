package com.practices;

public class Checkup {

	int patientNumber = 0;

	String systolic, diastolic; // Blood pressure

	double LDL, HDL; // Cholesterol

	public int getPatientNumber() {
		return patientNumber;
	}

	public void setPatientNumber(int patientNumber) {
		this.patientNumber = patientNumber;
	}

	public String getSystolic() {
		return systolic;
	}

	public void setSystolic(String systolic) {
		this.systolic = systolic;
	}

	public String getDiastolic() {
		return diastolic;
	}

	public void setDiastolic(String diastolic) {
		this.diastolic = diastolic;
	}

	public double getLDL() {
		return LDL;
	}

	public void setLDL(double lDL) {
		LDL = lDL;
	}

	public double getHDL() {
		return HDL;
	}

	public void setHDL(double hDL) {
		HDL = hDL;
	}

	public void coputeRetio() {
		System.out.println(LDL / HDL);
	}

	public void explainRetio() {
		if (LDL > 3.5) {
			System.out.println("good cholesterol");
		} else {
			System.out.println("optimum");
		}
	}

}
