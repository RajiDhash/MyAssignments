package week1.day3;

public class Library {
	String addBook(String bookTitle)
	{
		System.out.println(bookTitle +"Book Added successfully");
		return bookTitle;
		
	}
	
	void issueBook()
	{
		System.out.println("Book is Issued successfully");
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Library Book = new Library();
Book.addBook("Maths");
Book.issueBook();
	}

}
