package ru.mirea.fourthpart.fourthPart;

public class Ram {

    private int size;
    private double freq;

    public Ram(int size, double freq) {
        this.size = size;
        this.freq = freq;
    }

    public double getFreq() {
        return freq;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Оперативная память[размер: " + getSize() + " Гб, частота: " + getFreq() + "Гц]";
    }
}
