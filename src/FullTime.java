public class FullTime extends Employee{
    private double monthlySal;

    public FullTime(String Name, int Empid, double monthlySal){
        super(Name,Empid);   // if you want to use the constructor of the parent class then we use super keyword
        this.monthlySal = monthlySal;
    }

    @Override
    public double calculateSalary(){
        return monthlySal;
    }
}
