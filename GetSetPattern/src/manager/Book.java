package manager;
 
public class Book {
	
	private String name = "";
	private String author = "";
	private String publisher = "";
	private int price = 0;
	private String authorDate = "";

	public Book() {
		super();
	}

	public Book(String name, String author, String publisher, int price, String authorDate) {
		super();
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
		this.authorDate = authorDate;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
		
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	
	public String getPublisher() {
		return publisher;
	}
	
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
			
	
	public String getAuthorDate() {
		return authorDate;
	}
	
	public void setAuthorDate(String authorDate) {
		this.authorDate = authorDate;
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", author=" + author + ", publisher=" 
				+ publisher + ", price=" + price + ", authorDate=" + authorDate + "]";
	}	
	
	
	
	
	
	
	
	
	
	
	
}
