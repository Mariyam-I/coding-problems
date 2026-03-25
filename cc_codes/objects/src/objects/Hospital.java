package objects;

public class Hospital {


	String hospitalName ;
	String location ;
	int numberOfBeds ;
	String departments ;
	double rating ;
	
	public void admitPatient() {
		System.out.println("A patient with a heart attack was admitted");
	}
	public void dischargePatient() {
		System.out.println("The doctor discharged a recovering patient after two weeks");
	}
	public void scheduleSurgery() {
		System.out.println("surgery was scheduled for next Monday");
	}
	public void provideEmergencyCare() {
		System.out.println("Emergency care will be provided");
	}
}
		