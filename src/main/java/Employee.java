import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Period;
import java.util.Comparator;

//@Getter
//@Setter
@AllArgsConstructor
//@EqualsAndHashCode
//@ToString
@Data
public class Employee {
    private String FIO;
    private String position;
    private String phone;
    private BigDecimal salary;
    private LocalDate birthDate;


    public int getAge() {
        LocalDate currentDate = LocalDate.now();
        return Period.between(birthDate, currentDate).getYears();
    }


    public void printInfo() {
        System.out.println(this);
    }

    public void increaseSalary(int value) {
        this.salary = salary.add(BigDecimal.valueOf(value));
    }
    //  для сравнения двух дат рождения сотрудников
    public static Comparator<Employee> birthDateComparator() {
        return Comparator.comparing(employee -> employee.birthDate);
    }

}
