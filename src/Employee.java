public abstract class Employee {
    private String name;
    private int empId;
    private int leaveBalance = 21;

    // Composition: Strategy references
    protected TaxStrategy taxStrategy;
    protected BonusStrategy bonusStrategy;

    public Employee(String name, int empId, TaxStrategy ts, BonusStrategy bs) {
        this.name = name;
        this.empId = empId;
        this.taxStrategy = ts;
        this.bonusStrategy = bs;
    }

    // Setters allow changing strategy at runtime (e.g., a promotion)
    public void setTaxStrategy(TaxStrategy ts) { this.taxStrategy = ts; }
    public void setBonusStrategy(BonusStrategy bs) { this.bonusStrategy = bs; }

    public abstract double getBaseSalary();

    public double calculateFinalPay() {
        double base = getBaseSalary();
        return base + bonusStrategy.calculateBonus(base) - taxStrategy.calculateTax(base);
    }

    public boolean requestLeave(int days) {
        if (days <= leaveBalance) {
            leaveBalance -= days;
            return true;
        }
        return false;
    }

    public String getName() { return name; }
    public int getEmpId() { return empId; }

    @Override
    public String toString() {
        return String.format("ID: %-5d | Name: %-10s | Final Pay: $%-10.2f | Leaves: %d",
                empId, name, calculateFinalPay(), leaveBalance);
    }
}