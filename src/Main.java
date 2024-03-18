import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        employee[0] = new
                Employee("Пушкин Александр Сергеевич", 1, 11_111);
        employee[1] = new
                Employee("Лермонтов Михаил Юрьевич", 1, 22_222);
        employee[2] = new
                Employee("Бродский Иосиф Александрович", 2, 33_333);
        employee[3] = new
                Employee("Маяковский Владимир Владимирович", 2, 44_444);
        employee[4] = new
                Employee("Тургенев Иван Сергеевич", 3, 55_555);
        employee[5] = new
                Employee("Булгаков Михаил Афанасьевич", 3, 66_666);
        employee[6] = new
                Employee("Бехтерев Владимир Михайлович", 4, 77_777);
        employee[7] = new
                Employee("Климов Григорий Петрович", 4, 88_888);
        employee[8] = new
                Employee("Есенин Сергей Александрович", 5, 99_999);
        employee[9] = new
                Employee("Салтыков-Щедрин Михаил Евграфович", 5, 111_110);


        System.out.println("Получить список всех сотрудников со всеми имеющимися по ним данными :");
        printEmployee(employee);
        System.out.println("Распечатать Ф.И.О всех сотрудников: " + "\n ");
        printListEmployee(employee);
        System.out.println(" " + "\n Посчитать сумму затрат на ЗП в месяц:");
        totalSalary(employee);
        System.out.println(" " + "\nНайти сотрудника с минимальной ЗП:");
        minSalary(employee);
        System.out.println(" " + "\nНайти сотрудника с максимальной ЗП:");
        maxSalary(employee);
        System.out.println(" " + "\nПодсчитать среднее значение зарплат:");
        averageSalary(employee);
    }

    public static Employee employee[] = new Employee[10];

    public static void printEmployee(Employee[] employee) {
        for (Employee employeeOne : employee) {
            if (employeeOne != null) {
                System.out.println(employeeOne);
            }
        }
    }


    public static void printListEmployee(Employee[] employee) {
        for (Employee employee1 : employee) {
            if (employee1 != null) {
                System.out.println(employee1.getEmployeeName() + ".");
            }
        }
    }

    public static void totalSalary(Employee[] employee) {
        int totalSalary = 0;
        for (Employee salary :
                employee) {
            totalSalary += salary.getSalary();
        }
        if (employee != null) {
            System.out.println("Сумма затрат на заработаную плату: " +
                    totalSalary);
        }
    }

    public static void minSalary(Employee[] employee) {
        int minSalary = Integer.MAX_VALUE;
        String minSalaryEmployee = "";
        for (Employee i :
                employee) {
            if (i.getSalary() < minSalary) {
                minSalary = i.getSalary();
                if (minSalary == i.getSalary()) {
                    minSalaryEmployee = i.getEmployeeName();
                }
            }
        }


        System.out.println("Минимальная зарплата в " + minSalary + " рублей, у сотрудника - " +
                minSalaryEmployee + ".");
    }

    public static void maxSalary(Employee[] employee) {
        int maxSalary = employee[0].getSalary();
        String maxSalaryEmployee = "";
        for (Employee i :
                employee) {
            if (i.getSalary() > maxSalary)
                maxSalary = i.getSalary();
            if (maxSalary == i.getSalary()) {
                maxSalaryEmployee = i.getEmployeeName();
            }
        }
        System.out.println("Максимальная зарплата: " + maxSalary + " рублей, у сотрудника " + maxSalaryEmployee + ".");

    }

    public static void averageSalary(Employee[] employee) {
        int averSalary = 0;
        for (Employee salary : employee) {
            averSalary += salary.getSalary();
        }
        int averageSalary = averSalary / employee.length;
        System.out.println("Средняя зароботная плата : " + averageSalary);
    }
}









