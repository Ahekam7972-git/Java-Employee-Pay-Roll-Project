package payroll;
public class Main {
    public static void main(String[] args) {
        PayrollSystem pay = new PayrollSystem();
       FullTimeEmplyee emp1 = new FullTimeEmplyee("Ahekam", 25, 25000.50);
       PartTimeEmployee emp2 = new PartTimeEmployee("sonali", 24, 4, 100);
       pay.addEmployee(emp1);
       pay.addEmployee(emp2);
       System.out.println("=== Welcome To Employee Details ===");
       System.out.println("Initial Employee Details:");
       pay.displayEmployee();
       System.out.println("Remaining Employees:");
       pay.removeEmployee(24);
       System.out.println("After Removing Employee:");
       pay.displayEmployee();
    }

}
