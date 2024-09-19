import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
    Payroll payrollsys = new Payroll();
    FullTime emp_ftp = new FullTime("Aesh",1022,10982.21);
    PartTime emp_ptp = new PartTime("Aditya", 199, 20192,19211);

    payrollsys.addEmployee(emp_ftp);
    payrollsys.addEmployee(emp_ptp);
    System.out.println("Initial Employee Details: ");
    payrollsys.displayEmployee();
    System.out.println("Removing employee: ");
    payrollsys.removeEmployee(199);
    System.out.println("Remaining Employees: ");
    payrollsys.displayEmployee();
    }
}