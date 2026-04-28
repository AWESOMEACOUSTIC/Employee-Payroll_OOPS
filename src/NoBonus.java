public class NoBonus implements BonusStrategy {
    @Override
    public double calculateBonus(double salary) {
        return 0;
    }
}