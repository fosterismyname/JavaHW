package ru.mirea.fourthpart.secondPart;

public class TeeShirt extends Clothes  implements FemaleClothes, MaleClothes{

    TeeShirt(Sizes size, String color) {
        super(size, color);
    }

    TeeShirt(Sizes size, String color, double amount) {
        super(size, color, amount);
    }

    @Override
    public String toString() {
        return "Футболка[размер = " + getSize() + ", цвет = " + getColor() + ", стоимость = " + getAmount() + "]";
    }
}
