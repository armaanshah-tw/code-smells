package nerdschool.bar;

import nerdschool.bar.domain.*;

import java.util.HashMap;

public class DrinkFactory {
    public static final String ONE_BEER = "hansa";
    public static final String ONE_CIDER = "grans";
    public static final String A_PROPER_CIDER = "strongbow";
    public static final String GT = "gt";
    public static final String BACARDI_SPECIAL = "bacardi_special";
    HashMap<String, Drink> drinkMap;

    public DrinkFactory() {
        drinkMap = new HashMap<>();

        drinkMap.put(ONE_BEER, new Beer());
        drinkMap.put(ONE_CIDER, new Cider());
        drinkMap.put(A_PROPER_CIDER, new ProperCider());
        drinkMap.put(GT, new GinTonic());
        drinkMap.put(BACARDI_SPECIAL, new BacardiSpecial());
    }

    public Drink getDrinkType(String drink) throws RuntimeException {
        if (drinkMap.containsKey(drink)) {
            return drinkMap.get(drink);
        }

        throw new RuntimeException("No such drink exists");
    }
}
