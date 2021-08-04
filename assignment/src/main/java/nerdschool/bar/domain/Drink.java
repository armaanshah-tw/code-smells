// IMPORTANT NOTE, USUALLY EACH CLASS / INTERFACE HERE WOULD BE ITS OWN FILE
package nerdschool.bar.domain;

public abstract class Drink {
    public static final int STUDENT_DISCOUNT_PERCENTAGE = 10;

    public abstract int getPrice();

    public int getStudentDiscountPrice() { return getPrice(); };

    public boolean hasDrinkLimit() { return false; }

    protected int unitOfRumPrice() { return 65; }

    protected int unitOfGrenadinePrice() { return 10; }

    protected int unitOfLimeJuicePrice() { return 10; }

    protected int unitOfGreenStuffPrice() { return 10; }

    protected int unitOfTonicWaterPrice() { return 20; }

    protected int unitOfGinPrice() { return 85; }
}


