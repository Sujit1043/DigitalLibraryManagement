import java.util.HashMap;
import java.util.Map;


class BookManager {
  private final Map<String, Book> bookCollection = new HashMap<>();

  public void addBook(Book book) {
      if (bookCollection.containsKey(book.getBookId())) {
          System.out.println("Book with ID " + book.getBookId() + " already exists.");
      } else {
          bookCollection.put(book.getBookId(), book);
          System.out.println("Book added successfully!");
      }
  }

  public void viewAllBooks() {
      if (bookCollection.isEmpty()) {
          System.out.println("No books available.");
      } else {
          bookCollection.values().forEach(System.out::println);
      }
  }

  public void searchBook(String searchQuery) {
      boolean found = false;
      for (Book book : bookCollection.values()) {
          if (book.getBookId().equalsIgnoreCase(searchQuery) || book.getTitle().equalsIgnoreCase(searchQuery)) {
              System.out.println(book);
              found = true;
          }
      }
      if (!found) {
          System.out.println("Book not found.");
      }
  }

  public void updateBook(String bookId, String title, String author, String genre, String availabilityStatus) {
      if (bookCollection.containsKey(bookId)) {
          Book book = bookCollection.get(bookId);
          book.setTitle(title);
          book.setAuthor(author);
          book.setGenre(genre);
          book.setAvailabilityStatus(availabilityStatus);
          System.out.println("Book updated successfully!");
      } else {
          System.out.println("Book ID not found.");
      }
  }

  public void deleteBook(String bookId) {
      if (bookCollection.remove(bookId) != null) {
          System.out.println("Book deleted successfully!");
      } else {
          System.out.println("Book ID not found.");
      }
  }
}
