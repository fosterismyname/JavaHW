package ru.mirea.fourthpart.secondPart;


public class Skirt extends Clothes implements FemaleClothes {
    public Skirt(Sizes size, String color) {
        super(size, color);
    }

    public Skirt(Sizes size, String color, double amount) {
        super(size, color, amount);
    }

    @Override
    public String toString() {
        return "Юбка[размер = " + getSize() + ", цвет = " + getColor() + ", стоимость = " + getAmount() + "]";
    }
}
