package ru.mirea.fourthpart.fourthPart;

import java.util.Random;

public class Computer {
    private Processor currentProcessor;
    private Ram currentRam;
    private HardDisk currentDisk;
    private boolean currentPower;

    public Computer(Processor currentProcessor, Ram currentRam, HardDisk currentDisk, boolean currentPower) {
        this.currentProcessor = currentProcessor;
        this.currentRam = currentRam;
        this.currentDisk = currentDisk;
    }

    public Computer(Processor currentProcessor, Ram currentRam, HardDisk currentDisk) {
    }

    public void turnOn() {
        currentPower = true;
    }

    public void turnOff() {
        currentPower = false;
    }


}
