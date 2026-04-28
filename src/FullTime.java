public class FullTime extends Employee {
    private double monthlySalary;

    public FullTime(String name, int empId, double monthlySalary, TaxStrategy ts, BonusStrategy bs) {
        super(name, empId, ts, bs);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double getBaseSalary() {
        return monthlySalary;
    }
}