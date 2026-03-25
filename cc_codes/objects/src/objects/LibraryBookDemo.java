package objects;

public class LibraryBookDemo {

	public static void main(String[] args) {
		LibraryBook lB = new LibraryBook();
		
		lB.bookId = 132;
		lB.title = "Ignorance" ;
		lB.author = " Milan Kundera" ;
		lB.genre = "Novel";
		lB.publicationYear = 2000;
		lB.isAvailable = true ;
		
		System.out.println("Book Id = " + lB.bookId);
		System.out.println("Title = " + lB.title);
		System.out.println("Author = " + lB.author);
		System.out.println("Gerne = " + lB.genre);
	 	System.out.println("Publication Year = " + lB.publicationYear);
	 	System.out.println("Is Available = " + lB.isAvailable);
		
	 	System.out.println("--------Methods Call-------");
		lB.issueBook();
		lB.returnBook();
		lB.checkAvailability();
		lB.reserveBook();		
	}
}




/*
Book Id = 132
Title = Ignorance
Author =  Milan Kundera
Gerne = Novel
Publication Year = 2000
Is Available = true
--------Methods Call-------
Book is issued
Stll Book is not returend
Not Available
Reversing Book

 */