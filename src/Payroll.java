import java.util.ArrayList;

public class Payroll {
    private ArrayList<Employee> employeeList;  //datatype in the liat is employee.Employee is a class

    public Payroll(){
        employeeList = new ArrayList<>(); // use of new: it creates a constructor and allocates a new memory
    }

    public void addEmployee(Employee employee){
        employeeList.add(employee); // we can add values to the list
    }

    public void removeEmployee(int Empid){ // Assume the employee id to be unique to be more precise it is a primary key
        Employee employeeToremove = null;
        for(Employee employee : employeeList){
            if(employee.getEmpid() == Empid){
                employeeToremove = employee;
                break;
            }
            else if(employeeToremove != null){
                employeeList.remove(employeeToremove);
                System.out.println(employeeToremove);
            }else{
                System.out.println("Mo one is removed");
            }
        }
    }

    public void displayEmployee(){
        for(Employee employee : employeeList){
            System.out.println(employee);
        }
    }
}
