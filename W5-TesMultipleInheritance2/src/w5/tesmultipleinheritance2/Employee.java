package w5.tesmultipleinheritance2;

/**
 * @author Naia Siti Az-zahra
 * @version 1.0
 * @since 2023-02-18
 */

class Employee implements Sortable {
    public Employee(String n, double s, int day, int month, int year) {
        name = n;
	salary = s;
	hireday = day;
	hiremonth = month;
	hireyear = year;
    }
    
    @Override
    public void print() {
	System.out.println(name + " " + salary + " " + hireYear());
    }
    
    @Override
    public void raiseSalary(double byPercent) {
	salary *= 1 + byPercent / 100;
    }
    
    public int hireYear() {
        return hireyear;
    }
    
    private String name;
    private double salary;
    private int hireday;
    private int hiremonth;
    private int hireyear;
	
    public double getSalary() {
        return salary;
    }
    
    public void setSalary(double salary) {
	this.salary = salary;
    }
        
    @Override
    public int compare(Sortable b) {
	Employee eb = (Employee) b;
	if (salary<eb.salary) return -1;
	if (salary>eb.salary) return +1;
	return 0;
    }	
}
