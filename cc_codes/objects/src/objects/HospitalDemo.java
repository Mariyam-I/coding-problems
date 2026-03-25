package objects;

public class HospitalDemo {

	public static void main(String[] args) {

		Hospital h = new Hospital();
		

		h.hospitalName = "All India Institute of Medical Sciences (AIIMS)" ;
		h.location = "New Delhi  " ;
		h.numberOfBeds =  2500 ;
		h.departments = "Cardiology, Neurology, Orthopedics, Pediatrics";
		h.rating = 4.7 ;
		
		System.out.println("Hospital Name = " +h.hospitalName);
		System.out.println("Location = " +h.location);
		System.out.println("Number Of Beds = " +h.numberOfBeds);
		System.out.println("Departments = " +h.departments);
		System.out.println("Rating out of (5) = " +h.rating);
		
		System.out.println("-------Methods Call-------");
		h.admitPatient();
		h.dischargePatient();
		h.scheduleSurgery();
		h.provideEmergencyCare();
	}

}



/*
Hospital Name = All India Institute of Medical Sciences (AIIMS)
Location = New Delhi  
Number Of Beds = 2500
Departments = Cardiology, Neurology, Orthopedics, Pediatrics
Rating out of (5) = 4.7
-------Methods Call-------
A patient with a heart attack was admitted
The doctor discharged a recovering patient after two weeks
surgery was scheduled for next Monday
Emergency care will be provided
*/
