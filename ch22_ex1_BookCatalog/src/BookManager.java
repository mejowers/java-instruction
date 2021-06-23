import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class BookManager {
    private List<Book> bookList;
    
    public BookManager() {
        bookList = new BookCatalog().getCatalog();
    }
        
    public List<Book> getBooks(Predicate<Book> condition) {
    	List<Book> getBooks = new ArrayList<>();
    	for (Book b : bookList) {
    		if (condition.test(b)) {
    			getBooks.add(b);
    		}
    	}
    	return getBooks;
    }
}