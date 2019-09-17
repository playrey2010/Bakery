import java.util.ArrayList;
import java.util.Scanner;

public class BakeryApp {
    public static void main(String[] args) {
        process();
    }

    public static void process() {
        Scanner sc = new Scanner(System.in);
        ItemDB idb = new ItemDB();
        DietDB ddb = new DietDB();
        String restriction = "";
//        System.out.println(idb.good2eat("gluten-free"));

        System.out.print("Type in restriction you need (e.g. \"gluten-free\"), \"restrictions\" for all diet restrictions or \"all\" for all items: ");
        restriction = sc.nextLine();
        if (restriction.equalsIgnoreCase("all")) {
            System.out.println(idb.allItems());
        } else if (restriction.equalsIgnoreCase("restrictions")) {
            System.out.println(ddb.getDiets());
        } else {
            // this displays items with specific restriction
            System.out.println(idb.good2eat(restriction));
        }
    }
}