public class DVD extends LibraryItem {
    private String director;
    private int duration;

    public DVD(String title, int releaseYear, String director, int duration) {
        super(title, releaseYear);
        this.director = director;
        this.duration = duration;
    }

    @Override
    public String getItemType() {
        return "This is a DVD";
    }

    @Override
    public String getItemDetails() {
        return "Item Details" + "\nDVD Title: " + getTitle() + "\nDVD Director: " + director +
                "\nDVD Duration: " + duration + " minutes" + "\nDVD Release Year: " + getReleaseYear();
    }
}