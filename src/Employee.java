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

    // use of polymorphism due to multiple use of same methods
    @Override
    public String toString(){
        return "Employee[Name="+Name + ", Employee id="+Empid + ", Salary="+calculateSalary()+"]";
    }
}
