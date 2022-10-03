package ru.mirea.fourthpart.firstPart;

public enum Seasons {

    WINTER (-10),
    SUMMER (23) {
        public String getDescription() {
            return "Теплое время года";
        }
    },
    AUTUMN (9),
    SPRING (6);

    private final int description;

    Seasons(int description) {
        this.description = description;
    }

    public String getDescription() {
        return "Холодное время года";
    }

    @Override
    public String toString() {
        return "[" + "Средняя температура = " + description + "]";
    }
}