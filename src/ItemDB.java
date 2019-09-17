import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ItemDB {
    private List<Item> items;
    private Item item;

    public ItemDB() {
        items = new ArrayList<Item>();
        items.add(new Item("bread", 10.0, new Date(2019,9, 21 ), 10));
        items.add(new Item("whole wheat", 3.0, new Date(2020,10, 26 ), 12));
        items.add(new Item("cupcake", 2.0, new Date(2019,10, 11 ), 5));
        items.add(new Item("Pretzel", 3.0, new Date(2019,10, 11 ), 20));
    }
    // this DOES work upon what is included in the constructor
    public ArrayList<String> displayFirstItem () {
        return items.get(0).getDietRest();
    }

    public ArrayList<String> allItems () {
        ArrayList<String> names = new ArrayList<>();
        for (int i = 0; i<items.size(); i++) {
            names.add(items.get(i).getName());
        }
        return names;
    }

    public ArrayList<String> good2eat (String restriction) {
        ArrayList<String> good2eat = new ArrayList<>();
        for (int i = 0; i < items.size(); i++) {
            for (int x = 0; x < items.get(i).dietRestSize(); x++) {
                if (restriction.equalsIgnoreCase(items.get(i).getDietRest().get(x))) {
                    good2eat.add(items.get(i).getName());
                }
            }
        }
        if (good2eat.size() == 0) {
            good2eat.add("No goods found");
            return good2eat;
        }else {
            return good2eat;
        }
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
