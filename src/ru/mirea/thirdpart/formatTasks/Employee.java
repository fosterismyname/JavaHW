package ru.mirea.thirdpart.formatTasks;

public class Employee {

    private String fullName = "Surname Name";
    private double salaryVal  = 0.0;

    public Employee (String fullName, double salaryVal) {
        this.fullName = fullName;
        this.salaryVal = salaryVal;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setSalaryVal(double salaryVal) {
        this.salaryVal = salaryVal;
    }

    public String getFullName() {
        return fullName;
    }

    public double getSalaryVal() {
        return salaryVal;
    }

    @Override
    public String toString(){
        return "{fullname: " + fullName + ", salary = " + salaryVal + "}";
    }

}

class Report {

    public Report(Employee[] currArr) { }

    static void generateReport(Employee[] currArr) {
        System.out.println("Generated report: ");
        for (int i = 0; i < currArr.length; i++) {
            System.out.println(currArr[i]);
        }
    }
}

class checkerMain {

    public static void main(String[] args) {

        Employee firstWorker = new Employee("Aaaa Bbbb", 100000);
        Employee secondWorker = new Employee("Cccc Dddd", 80000);
        Employee thirdWorker = new Employee("Eeee Ffff", 70000);
        Employee fourthWorker = new Employee("Gggg Hhhh", 130000);
        Employee fifthWorker = new Employee("Iiii Jjjj", 900000);

        Employee[] subArr = new Employee[5];
        subArr[0] = firstWorker;
        subArr[1] = secondWorker;
        subArr[2] = thirdWorker;
        subArr[3] = fourthWorker;
        subArr[4] = fifthWorker;

        Report currentRep = new Report(subArr);
        currentRep.generateReport(subArr);

    }

}