import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;

public class Item {
    private String name;                    // Name of the bakery good
    private double price;
    private Date expDate;
    private ArrayList<String> dietRest;
    private int quantity = 0;
    NumberFormat formatter = NumberFormat.getCurrencyInstance();

    // Constructors
    Item() {
        this.name = "NO NAME";
        this.price = 0.0;
        this.expDate = new Date();
        this.dietRest = null;
        this.quantity = 0;
    }

    Item (String name, Double price, Date expDate, ArrayList dietRest, Integer quantity) {
        this.name = name;
        this.price = price;
        this.expDate = expDate;
        this.dietRest = dietRest;
        this.quantity = quantity;
    }

    Item (String name, Double price, Date expDate, Integer quantity) {
        DietDB db = new DietDB();
        this.name = name;
        this.price = price;
        this.expDate = expDate;
//        this.dietRest = dietRest;
        this.quantity = quantity;
        this.dietRest = db.randomizeDietRestrictions();
    }

    public int dietRestSize () {
        return dietRest.size();
    }

//    public String printItem() {
//        StringBuilder sb = new StringBuilder();
//        sb.append("The name of the item is: ");
//        sb.append(name);
//        sb.append("\nThe price is: ");
//        sb.append(formatter.format(price));
//        sb.append("\nThe quantity is: ");
//        sb.append(quantity);
//
//        // converting a date to a string
//        sb.append("\nThe expiration date is: ");
//        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
//        sb.append(dateFormat.format(expDate));
//
//        if (dietRest.size() > 0) {
//            sb.append("\nThe following are the diet restrictions: \n");
//            for (String restStr : dietRest ) {
//                sb.append("\t");
//                sb.append(restStr);
//                sb.append("\n");
//            }
//            sb.append("\n");
//        }
//        else {
//            sb.append("\nThere are no diet restrictions.\n\n");
//        }
//        return sb.toString();
//    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Date getExpDate() {
        return expDate;
    }

    public void setExpDate(Date expDate) {
        this.expDate = expDate;
    }

    public ArrayList<String> getDietRest() {
        return dietRest;
    }

    public void setDietRest(ArrayList<String> dietRest) {
        this.dietRest = dietRest;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}