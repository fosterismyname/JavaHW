package ru.mirea.fourthpart.secondPart;

public class Trousers extends Clothes implements FemaleClothes, MaleClothes{
    public Trousers(Sizes size, String color) {
        super(size, color);
    }

    public Trousers(Sizes size, String color, double cost) {
        super(size, color, cost);
    }

    @Override
    public String toString() {
        return "Штаны[" +
                "размер = " + getSize() +
                ", цена = " + getAmount() + " грн" +
                ", цвет = " + getColor() +
                "]";
    }
}
