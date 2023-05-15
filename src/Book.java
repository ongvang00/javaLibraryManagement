public class Book extends LibraryItem {
    private String author;
    private String ISBN;

    public Book(String title, int releaseYear, String author, String ISBN) {
        super(title, releaseYear);
        this.author = author;
        this.ISBN = ISBN;
    }

    @Override
    public String getItemType() {
        return "This is a Book";
    }

    @Override
    public String getItemDetails() {
        return "Item Details" + "\nBook Title: " + getTitle() + "\nBook Author: " + author +
                "\nBook ISBN: " + ISBN + "\nBook Release Year: " + getReleaseYear();
    }
}