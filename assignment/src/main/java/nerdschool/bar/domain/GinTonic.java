package nerdschool.bar.domain;

public class GinTonic extends Drink {

    @Override
    public int getPrice() {
        return unitOfGinPrice() + unitOfTonicWaterPrice() + unitOfGreenStuffPrice();
    }

    @Override
    public boolean hasDrinkLimit() {
        return true;
    }
}
