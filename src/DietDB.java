import java.util.ArrayList;
import java.util.Random;

public class DietDB {
    private ArrayList<String> diets;

    public DietDB() {
        diets = new ArrayList<String>();
        diets.add("gluten-free");
        diets.add("dairy-free");
        diets.add("egg-free");
        diets.add("soy-free");
    }

    public ArrayList<String> getDiets() {
        return diets;
    }

    public void setDiets(ArrayList<String> diets) {
        this.diets = diets;
    }

    public ArrayList<String> randomizeDietRestrictions() {
        Random r = new Random();
        ArrayList<String> randomDiets = new ArrayList<>();
        randomDiets.add(diets.get(r.nextInt(diets.size())));
        return randomDiets;
    }
}
