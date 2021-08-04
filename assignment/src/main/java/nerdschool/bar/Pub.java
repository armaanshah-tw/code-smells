package nerdschool.bar;

import nerdschool.bar.domain.*;

public class Pub {

    public static final int MAX_DRINKS = 2;

    public int computeCost(String drinkRequest, boolean student, int amount) {
        DrinkFactory drinkFactory = new DrinkFactory();
        Drink drink = drinkFactory.getDrinkType(drinkRequest);

        if (drink.hasDrinkLimit() && amount > MAX_DRINKS) {
            throw new RuntimeException(String.format("Too many drinks, max %d.", MAX_DRINKS));
        }

        int price;

        if(student) {
            price = drink.getStudentDiscountPrice();
        } else {
            price = drink.getPrice();
        }

        return price*amount;
    }
}
