public class InternTax implements TaxStrategy {
    @Override
    public double calculateTax(double salary) {
        return 0; // Tax-free
    }
}