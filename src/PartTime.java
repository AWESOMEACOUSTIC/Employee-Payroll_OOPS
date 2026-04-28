public class PartTime extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public PartTime(String name, int empId, double hourlyRate, int hoursWorked, TaxStrategy ts, BonusStrategy bs) {
        super(name, empId, ts, bs);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double getBaseSalary() {
        return hourlyRate * hoursWorked;
    }
}