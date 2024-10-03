public abstract class Employee {
    private String Name;
    private int Empid;


    public Employee(String Name, int Empid){
        this.Name = Name;
        this.Empid = Empid;
    }

    // getter and setter method --> Encapsulation : User need to call this methods to get the details which is increasing the security
    public String getName(){
        return Name;
    }

    public int getEmpid(){
        return Empid;
    }

    public abstract double calculateSalary();        // abstract method is made without any body. Whichever class will call the method will have it's body in it.
    public int getAvailableLeaves() {
        return 21;   // for now the default set to be 21
    }

    // calculate the the number of leaves that is left
    public int useLeaves(int days){
        return 21 - days;
    }
    // use of polymorphism due to multiple use of same methods
    @Override
    public String toString(){
        return "Employee[Name="+Name + ", Employee id="+Empid + ", Salary="+calculateSalary()+"]";
    }


}
