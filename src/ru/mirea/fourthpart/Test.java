package ru.mirea.fourthpart.fourthPart;

public class Test {

    public static void main(String[] args) {
        Ram currentRam = new Ram(8, 3.7);
        System.out.println(currentRam);
        HardDisk currentDisk = new HardDisk(500, 6576);
        System.out.println(currentDisk);
        Processor currentProcessor = new Processor("Intel", 4.1);
        System.out.println(currentProcessor);

        Computer currentComputer = new Computer(currentProcessor, currentRam, currentDisk);
        System.out.println(currentComputer);
        currentComputer.turnOff();
        System.out.println(currentComputer);
        currentComputer.turnOn();
        System.out.println(currentComputer);
    }
}
