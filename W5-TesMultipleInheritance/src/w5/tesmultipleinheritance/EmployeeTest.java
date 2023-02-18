package w5.tesmultipleinheritance;

/**
 * @author Naia Siti Az-zahra
 * @version 1.0
 * @since 2023-02-18
 */

public class EmployeeTest {
    public static void main (String[] args){
        Employee[] staff = new Employee[3];
	staff[0] = new Employee("Antonio Rossi", 2000000, 1, 10, 1989);
	staff[1] = new Employee("Maria Bianchi", 2500000, 1, 12, 1991);
	staff[2] = new Employee("Isabel Vidal", 3000000, 1, 11, 1993);
	Sortable.shell_sort(staff);
	int i;
	for (i = 0; i < 3; i++) staff[i].raiseSalary(5);
	for (i = 0; i < 3; i++) staff[i].print();
    }
}
