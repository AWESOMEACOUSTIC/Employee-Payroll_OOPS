public class Main {
    public static void main(String[] args) {
        Payroll payroll = new Payroll();

        // 1. Define strategies
        TaxStrategy standardTax = new StandardTax();
        TaxStrategy internTax = new InternTax();
        BonusStrategy perfBonus = new PerformanceBonus();
        BonusStrategy zeroBonus = new NoBonus();

        // 2. Create employees with specific strategies
        Employee emp1 = new FullTime("Alice", 101, 5000.0, standardTax, zeroBonus);
        Employee emp2 = new FullTime("Bob", 102, 6000.0, standardTax, perfBonus);
        Employee emp3 = new PartTime("Charlie", 103, 20.0, 100, internTax, zeroBonus);

        payroll.addEmployee(emp1);
        payroll.addEmployee(emp2);
        payroll.addEmployee(emp3);

        System.out.println("Initial Payroll:");
        payroll.displayEmployees();

        // 3. Runtime Strategy Switching (The "Magic" of the pattern)
        System.out.println("\n--- Updating Alice: Giving Bonus and changing Tax ---");
        Employee alice = payroll.getEmployee(101);
        if (alice != null) {
            alice.setBonusStrategy(perfBonus); // Promotion/Reward
            alice.setTaxStrategy(internTax);   // Relocation to tax-free zone
        }

        payroll.displayEmployees();
    }
}