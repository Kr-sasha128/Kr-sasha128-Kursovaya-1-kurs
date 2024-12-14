public class EmployeeBook {
    private Employee[] employees;

    public EmployeeBook(int capacity) {
        employees = new Employee[capacity];
    }

    public boolean addEmployee(Employee employee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = employee;
                return true;
            }
        }
        return false; // Массив заполнен
    }

    public boolean removeEmployee(int id) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getId() == id) {
                employees[i] = null;
                return true;
            }
        }
        return false;
    }

    public Employee getEmployeeById(int id) {
        for (Employee employee : employees) {
            if (employee != null && employee.getId() == id) {
                return employee;
            }
        }
        return null;
    }

    public void printAllEmployees() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }

    public double calculateTotalSalary() {
        double total = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                total += employee.getSalary();
            }
        }
        return total;
    }

    public Employee getEmployeeWithMinSalary() {
        Employee minSalaryEmployee = null;
        for (Employee employee : employees) {
            if (employee != null && (minSalaryEmployee == null || employee.getSalary() < minSalaryEmployee.getSalary())) {
                minSalaryEmployee = employee;
            }
        }
        return minSalaryEmployee;
    }

    public Employee getEmployeeWithMaxSalary() {
        Employee maxSalaryEmployee = null;
        for (Employee employee : employees) {
            if (employee != null && (maxSalaryEmployee == null || employee.getSalary() > maxSalaryEmployee.getSalary())) {
                maxSalaryEmployee = employee;
            }
        }
        return maxSalaryEmployee;
    }

    public double calculateAverageSalary() {
        double total = calculateTotalSalary();
        int count = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                count++;
            }
        }
        if (count == 0) {
            return 0;
        } else {
            return total / count;
        }
    }
}
