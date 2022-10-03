package ru.mirea.fourthpart.fourthPart;

public class Processor {

    private final String model;
    private final double freq;

    public Processor(String model, double freq) {
        this.model = model;
        this.freq = freq;
    }

    public String getModel() {
        return model;
    }

    public double getFreq() {
        return freq;
    }

    @Override
    public String toString() {
        return "Процессор[Производитель: " + getModel() + ", частота: " + getFreq() + "Гц]";
    }
}
