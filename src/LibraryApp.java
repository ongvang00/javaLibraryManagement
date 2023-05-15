public class LibraryApp {
    public static void main(String[] args) {
        LibraryManager<LibraryItem> libraryManager = new LibraryManager<>();

        //Instantiate objects of Book and DVD classes
        DVD dvd1 = new DVD("DVD ABC", 2003, "Director1", 102);
        Book book1 = new Book("Book ABC", 1913, "Author1", "11342425451");

        //Add and remove items from the library
        libraryManager.addItem(book1);
        libraryManager.addItem(dvd1);
        libraryManager.removeItem(dvd1);

        // Display the list of items in the library
        libraryManager.displayItems();

    }
}
