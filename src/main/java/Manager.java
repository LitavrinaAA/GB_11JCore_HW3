import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class Manager extends Employee {
    private String FIO;
    private String position;
    private String phone;
    private BigDecimal salary;
    private LocalDate birthDate;
    // Конструктор класса Manager
    public Manager(String FIO, String position, String phone,
                   BigDecimal salary, LocalDate birthDate) {
        super(FIO, position, phone, salary, birthDate);
    }
    public static void salaryIncreaseForEmployees(List<Employee> employees, int ageOlder, int bonusValue) {
        for (Employee employee : employees) {
            if (employee.getClass().equals(Employee.class)) {
                if (employee.getAge() > ageOlder) {
                    employee.increaseSalary(bonusValue);
                }
            }
        }
    }

}
