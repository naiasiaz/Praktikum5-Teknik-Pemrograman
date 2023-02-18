package w5.tesmultipleinheritance2;

/**
 * @author Naia Siti Az-zahra
 * @version 1.0
 * @since 2023-02-18
 */

public class EmployeeTest {
    public static void main (String[] args){
	Sortable[] staff = new Employee[3];
	staff[0] = new Employee("Antonio Rossi", 2400000, 1, 10, 1989);
	staff[1] = new Employee("Maria Bianchi", 2100000, 1, 12, 1991);
	staff[2] = new Employee("Isabel Vidal", 3000000, 1, 11, 1993);
	int i;
	for (i = 0; i < 3; i++) staff[i].raiseSalary(5);
	Sortable.shell_sort(staff);
	for (i = 0; i < 3; i++) staff[i].print();
    }
}
