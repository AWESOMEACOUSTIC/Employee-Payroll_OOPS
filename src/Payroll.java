import java.util.*;

public class Payroll {
    private Map<Integer, Employee> employeeMap = new HashMap<>();

    public void addEmployee(Employee emp) {
        employeeMap.put(emp.getEmpId(), emp);
    }

    public void displayEmployees() {
        if (employeeMap.isEmpty()) System.out.println("No employees in system.");
        employeeMap.values().forEach(System.out::println);
    }

    public Employee getEmployee(int id) {
        return employeeMap.get(id);
    }
}