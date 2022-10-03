package ru.mirea.fourthpart.secondPart;

public abstract class Clothes {
    private final Sizes size;
    private final String color;
    private double amount;

    public Clothes(Sizes size, String color) {
        this.size = size;
        this.color = color;
    }

    public Clothes(Sizes size, String color, double amount) {
        this.size = size;
        this.color = color;
        this.amount = amount;
    }

    public Sizes getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public double getAmount() {
        return amount;
    }

    public void setCost(double amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Clothes)) return false;

        Clothes currentClothes = (Clothes) o;

        if (Double.compare(currentClothes.amount, amount) != 0) return false;
        if (size != currentClothes.size) return false;
        return color.equals(currentClothes.color);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = size.hashCode();
        temp = Double.doubleToLongBits(amount);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + color.hashCode();
        return result;
    }
}