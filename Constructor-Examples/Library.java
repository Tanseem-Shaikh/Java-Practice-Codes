package mypackage;

public class Library {
	String lib_name;
	String lib_add;
	String book_name;
	String author_name;
	int noOfBooks;

	public Library(String lib_name, String lib_add, String book_name, String author_name, int noOfBooks) {
		this.lib_name = lib_name;
		this.lib_add = lib_add;
		this.noOfBooks = noOfBooks;
		this.book_name = book_name;
		this.author_name = author_name;
	}

	public void display() {
		System.out.println("Library information");
		System.out.println("Library Name : " + lib_name);
		System.out.println("Address : " + lib_add);
		System.out.println("Total No Of Books : " + noOfBooks);
		System.out.println("Book Name : " + book_name);
		System.out.println("Author Name : " + author_name);

	}
}
