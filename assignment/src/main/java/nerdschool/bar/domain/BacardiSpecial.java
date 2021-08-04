package nerdschool.bar.domain;

public class BacardiSpecial extends Drink {

    @Override
    public int getPrice() {
        return unitOfGinPrice() / 2 + unitOfRumPrice() + unitOfGrenadinePrice() + unitOfLimeJuicePrice();
    }

    @Override
    public boolean hasDrinkLimit() {
        return true;
    }
}
