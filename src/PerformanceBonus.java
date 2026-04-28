public class PerformanceBonus implements BonusStrategy {
    @Override
    public double calculateBonus(double salary) {
        return salary * 0.10; // 10% bonus
    }
}