import java.util.Scanner;


public class DigitalLibrary {
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      BookManager bookManager = new BookManager();

      while (true) {
          System.out.println("--- Digital Library Menu ---");
          System.out.println("1. Add a Book");
          System.out.println("2. View All Books");
          System.out.println("3. Search Book by ID");
          System.out.println("4. Update Book Details");
          System.out.println("5. Delete a Book");
          System.out.println("6. Exit");
          System.out.print("Enter your choice: ");
          int choice = scanner.nextInt();
          scanner.nextLine();

          switch (choice) {
              case 1:
                  System.out.print("Enter Book ID: ");
                  String bookId = scanner.nextLine();
                  System.out.print("Enter Title: ");
                  String title = scanner.nextLine();
                  System.out.print("Enter Author: ");
                  String author = scanner.nextLine();
                  System.out.print("Enter Genre: ");
                  String genre = scanner.nextLine();
                  System.out.print("Enter Availability Status (Available/Checked Out): ");
                  String status = scanner.nextLine();
                  bookManager.addBook(new Book(bookId, title, author, genre, status));
                  break;
              case 2:
                  bookManager.viewAllBooks();
                  break;
              case 3:
                  System.out.print("Enter Book ID or Title: ");
                  String searchQuery = scanner.nextLine();
                  bookManager.searchBook(searchQuery);
                  break;
              case 4:
                  System.out.print("Enter Book ID to update: ");
                  String updateId = scanner.nextLine();
                  System.out.print("Enter new Title: ");
                  String newTitle = scanner.nextLine();
                  System.out.print("Enter new Author: ");
                  String newAuthor = scanner.nextLine();
                  System.out.print("Enter new Genre: ");
                  String newGenre = scanner.nextLine();
                  System.out.print("Enter new Availability Status: ");
                  String newStatus = scanner.nextLine();
                  bookManager.updateBook(updateId, newTitle, newAuthor, newGenre, newStatus);
                  break;
              case 5:
                  System.out.print("Enter Book ID to delete: ");
                  String deleteId = scanner.nextLine();
                  bookManager.deleteBook(deleteId);
                  break;
              case 6:
                  System.out.println("Exiting... Thank you for using Digital Library!");
                  scanner.close();
                  return;
              default:
                  System.out.println("Invalid choice! Please try again.");
          }
      }
  }
}
