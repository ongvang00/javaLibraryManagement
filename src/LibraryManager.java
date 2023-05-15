
import java.util.ArrayList;
import java.util.List;
public class LibraryManager<T extends LibraryItem> implements LibraryOperations<T> {
    private List<T> items;
    public LibraryManager() {
        items = new ArrayList<>();
    }
    @Override
    public void addItem(T item) {
        items.add(item);
        System.out.println("This item was added: " + item.getTitle());
    }

    @Override
    public void removeItem(T item) {
        items.remove(item);
        System.out.println("This item was removed: " + item.getTitle());
    }

    @Override
    public void displayItems() {
        if (items.isEmpty()) {
            System.out.println("No items in the Library");
        } else {
            System.out.println("Library items:");
            for (T item : items) {
                System.out.println(item.getItemDetails());

            }
        }
    }
}
