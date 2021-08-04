package nerdschool.bar.domain;

public class ProperCider extends Drink {

    @Override
    public int getPrice() {
        return 110;
    }

    @Override
    public int getStudentDiscountPrice() {
        int price = getPrice();
        return price - price/STUDENT_DISCOUNT_PERCENTAGE;
    }
}
