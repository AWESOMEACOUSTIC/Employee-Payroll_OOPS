public class StandardTax implements TaxStrategy {
    @Override
    public double calculateTax(double salary) {
        return salary * 0.15; // 15% tax
    }
}