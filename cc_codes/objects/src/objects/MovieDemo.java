package objects;

public class MovieDemo {

	public static void main(String[] args) {
		
		Movie m = new Movie();
		
		m.title = "Jawan";
		m.director = "Atlee ";
		m.releaseYear = 2023 ;
		m.generatedRevenue  = " ₹1100 Crore  ";
		m.duration = " 2 hours 50 minutes  ";

		System.out.println("Title = " + m.title);
		System.out.println("Director = " + m.director);
		System.out.println("Release Year = " +m.releaseYear);
		System.out.println("Generated Revenue = " + m.generatedRevenue);
		System.out.println("Duration = " + m.duration);
		
		System.out.println("---------Methods Call--------");	
		
		m.playMovie();
		m.pauseMovie();
		m.stopMovie();
		m.showDetails();
	}

}




/*
Title = Jawan
Director = Atlee 
Release Year = 2023
Generated Revenue =  ₹1100 Crore  
Duration =  2 hours 50 minutes  
---------Methods Call--------
Jawan started streaming on Netflix at 7 PM. 
Can pause the movie in middle while watching
Can stop watching 
The OTT platform displayed details like director, cast, and release year
*/