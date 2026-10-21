package payroll;

public class PartTimeEmployee extends Employee{
      private int hourWorked;
    private double hourlyrate;
    public PartTimeEmployee(String name, int id, int hourWorked, double hourlyrate){
        super(name, id);
        this.hourWorked = hourWorked;
        this.hourlyrate = hourlyrate;
    }
    @Override 
    public  double calculateSalary(){
        return hourWorked * hourlyrate;

    }
}
