public class LibraryApp {
    public static void main(String[] args) {
        LibraryManager<LibraryItem> libraryManager = new LibraryManager<>();

        DVD dvd1 = new DVD("DVD ABC", 2003, "Director1", 102);
        Book book1 = new Book("Book ABC", 1913, "Author3", "11342425451");

        // Add an item to the library
        libraryManager.addItem(book1);
        libraryManager.addItem(dvd1);

        // Remove an item from the library
        libraryManager.removeItem(dvd1);

        // Display the list of items in the library
        libraryManager.displayItems();

    }
}
