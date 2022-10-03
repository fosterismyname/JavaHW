package ru.mirea.fourthpart.fourthPart;

public class HardDisk {

    private final int size;
    private final int speed;

    public HardDisk(int size, int speed) {
        this.size = size;
        this.speed = speed;
    }

    public int getSize() {
        return size;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public String toString() {
        return "Жесткий диск[размер: " + getSize() + " Гб, скорость записи/чтения: " + getSpeed() + "Кб/C]";
    }
}
