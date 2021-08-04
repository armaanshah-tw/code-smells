package nerdschool.bar.domain;

public class Beer extends Drink {

    @Override
    public int getPrice() {
        return 74;
    }

    @Override
    public int getStudentDiscountPrice() {
        int price = getPrice();
        return price - price/STUDENT_DISCOUNT_PERCENTAGE;
    }
}
