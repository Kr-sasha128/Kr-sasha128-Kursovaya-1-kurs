public class Main {
    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook(5);

        employeeBook.addEmployee(new Employee("Егор Астафьев", 60000));
        employeeBook.addEmployee(new Employee( "Андрей Рязанцев", 70000));
        employeeBook.addEmployee(new Employee( "Фёдор Карташов", 45000));
        employeeBook.addEmployee(new Employee( "Олег Мангол", 47000));
        employeeBook.addEmployee(new Employee( "Иришка Чикипики", 44000));

        System.out.println("Список всех сотрудников:");
        employeeBook.printAllEmployees();

        System.out.println("Общая сумма затрат на зарплаты: " + employeeBook.calculateTotalSalary());

        System.out.println("Сотрудник с минимальной зарплатой: " + employeeBook.getEmployeeWithMinSalary());

        System.out.println("Сотрудник с максимальной зарплатой: " + employeeBook.getEmployeeWithMaxSalary());

        System.out.println("Средняя зарплата: " + employeeBook.calculateAverageSalary());

        System.out.println("Удаляем сотрудника с id 2");
        employeeBook.removeEmployee(3);

        System.out.println("Список сотрудников после удаления:");
        employeeBook.printAllEmployees();

        System.out.println("Получение сотрудника с id 1: " + employeeBook.getEmployeeById(1));

    }
}