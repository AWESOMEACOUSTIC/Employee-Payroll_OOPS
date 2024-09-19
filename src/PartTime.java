public class PartTime extends Employee{
    private int hoursWorked;
    private double hoursRate;

    public PartTime(String Name, int Empid, int hoursRate, int hoursWorked){
        super(Name, Empid);
        this.hoursRate = hoursRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary(){
        return (hoursWorked*hoursRate);
    }
}
