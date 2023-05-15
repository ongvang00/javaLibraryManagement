public class LibraryApp {
    public static void main(String[] args) {
        LibraryManager<LibraryItem> libraryManager = new LibraryManager<>();

        DVD dvd1 = new DVD("DVD ABC", 2003, "Director1", 102);
        libraryManager.addItem(dvd1);


        // Add an item to the library
        Book book3 = new Book("Book ABC", 1913, "Author3", "11342425451");
        libraryManager.addItem(book3);


        // Remove an item from the library
        libraryManager.removeItem(dvd1);

        // Display the list of items in the library
        libraryManager.displayItems();

    }
}
