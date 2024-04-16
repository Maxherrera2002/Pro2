package clases3;

public class Main {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Empleado 1", "Cargo 1");
        Employee employee2 = new Employee("Empleado 2", "Cargo 2");


        Department department = new Department("Departamento 1");


        department.addEmployee(employee1);
        department.addEmployee(employee2);


        System.out.println("Empleados del departamento " + department.getName() + ":");
        for (Employee employee : department.getEmployees()) {
            System.out.println("- Nombre: " + employee.getName() + ", Cargo: " + employee.getPosition());
        }
    }
}
