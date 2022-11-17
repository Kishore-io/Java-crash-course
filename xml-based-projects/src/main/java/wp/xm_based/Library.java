package wp.xm_based;

public class Library {

	private String libraryName;
	private String address;
	private Book book;
	
	public Library() {
		// TODO Auto-generated constructor stub
	}

	public Library(String libraryName, String address, Book book) {
		super();
		this.libraryName = libraryName;
		this.address = address;
		this.book = book;
	}

	public String getLibraryName() {
		return libraryName;
	}

	public void setLibraryName(String libraryName) {
		this.libraryName = libraryName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	@Override
	public String toString() {
		return "Library [libraryName=" + libraryName + ", address=" + address + ", book=" + book + "]";
	}
	
	
}
