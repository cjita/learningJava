//Library Book Tracker: Develop a class representing a book with attributes like title, author, and ISBN. Create multiple book objects and display their details.

class Book{
    private String title;
    private String author;
    private String isbn;
    
    public Book(String title,String author,String isbn){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
    
    public String getTitle(){
        return title;
    }
    
    public String getAuthor(){
        return author;
    }
    
    public String getIsbn(){
        return isbn;
    }
    
    public void getBookDetails(){
        System.out.println("Book title is: "+title);
        System.out.println("Book author is: "+author);
        System.out.println("Book isbn is: "+isbn);
    }
}


public class Main
{
	public static void main(String[] args) {
		Book book1 = new Book("Harry Potter","JK Rowling","856565-8954-52145");
		Book book2 = new Book("Village by the Sea","Ramsas","78595-8945-52196");
		Book book3 = new Book("2 States","Chethan Bagat","263785-985625-9254652");
		
		book1.getBookDetails();
		book2.getBookDetails();
		book3.getBookDetails();

	}
}
