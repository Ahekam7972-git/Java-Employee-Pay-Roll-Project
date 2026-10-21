package payroll;

public class FullTimeEmplyee extends Employee{
    
    private double monthlysalary;
    public FullTimeEmplyee(String name, int id, double monthlysalary){
        super(name, id);
       this.monthlysalary = monthlysalary;
    }
    @Override
    public double calculateSalary(){
         return monthlysalary;
    }
}
