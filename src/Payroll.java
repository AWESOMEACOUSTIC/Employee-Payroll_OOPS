import java.util.*;
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
                System.out.println("No one is removed");
            }
        }
    }
    public Employee findEmployeeById(int Empid){
        for(Employee employee: employeeList){
            if(employee.getEmpid() == Empid){
                return employee;
            }
        }
        return null;
    }

    // leave management
    public void apply_forleave(int Empid, int days){
        Employee employee = findEmployeeById(Empid);
        if(employee != null){
            int available_leave = employee.getAvailableLeaves();
            if(days <= available_leave){
                employee.useLeaves(days);
                System.out.println(employee.getName() + " has taken " + days + " days leave.");
            }else{
                System.out.println("Insufficient leave balance");
            }
        }
    }

    public void displayEmployee(){
        for(Employee employee : employeeList){
            System.out.println(employee);
        }
    }
}
