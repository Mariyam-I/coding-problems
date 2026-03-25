package objects;

public class Movie {
	String title ;
	String director ;
	int releaseYear ;
	String generatedRevenue ;
	String duration ;
	
	public void playMovie() {
		System.out.println("Jawan started streaming on Netflix at 7 PM. ");
	}
	public void pauseMovie() {
		System.out.println("Can pause the movie in middle while watching");
	}
	public void stopMovie() {
		System.out.println("Can stop watching ");
	}
	public void showDetails() {
		System.out.println("The OTT platform displayed details like director, cast, and release year");
	}
}

	
	

	