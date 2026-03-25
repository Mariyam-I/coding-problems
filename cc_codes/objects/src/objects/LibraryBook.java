package objects;

public class LibraryBook {
	int bookId ;
	String title ;
	String author ;
	String genre ;
	int publicationYear ;
	boolean isAvailable ;
	
	public void issueBook() {
		System.out.println("Book is issued");
	}
	public void returnBook() {
		System.out.println("Stll Book is not returend");
	}
	public void checkAvailability() {
		System.out.println("Not Available");
	}
	public void reserveBook() {
		System.out.println("Reversing Book");
	}
}
