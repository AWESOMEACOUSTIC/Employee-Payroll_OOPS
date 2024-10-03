import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
    Payroll payrollsys = new Payroll();
//    FullTime emp_ftp = new FullTime("Aesh",1022,10982.21);
//    PartTime emp_ptp = new PartTime("Aditya", 199, 20192,19211);
//
//    payrollsys.addEmployee(emp_ftp);
//    payrollsys.addEmployee(emp_ptp);
//    System.out.println("Initial Employee Details: ");
//    payrollsys.displayEmployee();
//    System.out.println("Removing employee: ");
//    payrollsys.removeEmployee(199);
//    System.out.println("Remaining Employees: ");
//    payrollsys.displayEmployee();
        FullTime emp1 = new FullTime("Adi",22101,2291012.2);
        FullTime emp2 = new FullTime("Sushi",223101,2291099312.2);

        payrollsys.addEmployee(emp1);
        payrollsys.addEmployee((emp2));
        payrollsys.displayEmployee();
        payrollsys.apply_forleave(22101,15);
    }
}