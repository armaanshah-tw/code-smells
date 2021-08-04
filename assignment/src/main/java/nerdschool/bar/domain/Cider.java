package nerdschool.bar.domain;

public class Cider extends Drink {

    @Override
    public int getPrice() {
        return 103;
    }

    @Override
    public int getStudentDiscountPrice() {
        int price = getPrice();
        return price - price/STUDENT_DISCOUNT_PERCENTAGE;
    }
}
