package Main;

import Consumer.Employee;
import Consumer.Manager;

public class Main {
public static void main(String[] args) {
	
	Employee employee = new Employee();
	System.out.println(employee.calSal(45454));
	
	Manager manager = new  Manager();
	System.out.println(manager.calSal(33636, 644784));
	
}
}
