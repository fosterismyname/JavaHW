package ru.mirea.fourthpart.thirdPart;

public class Food {

    private final String name;
    private final double amount;

    Food(String name, double amount) {
        this.name = name;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Товар[наименование: " + getName() + ", стоимость: " + getAmount() + "]";
    }
}
