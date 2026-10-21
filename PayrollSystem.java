package payroll;

import java.util.ArrayList;

public class PayrollSystem {
    private ArrayList<Employee> employeeList;

    public PayrollSystem(){
        employeeList = new ArrayList<>();
    }
    public void addEmployee(Employee employee){
        employeeList.add(employee);

    }
    public void removeEmployee(int id){
        Employee removeToEmployee = null;
        for (Employee employee : employeeList) {
            if(employee.getId() == id){
                removeToEmployee = employee;
                break;
            }
        }
        if(removeToEmployee != null){
            employeeList.remove(removeToEmployee);
        }
    }
        public void displayEmployee(){
            for(Employee employee:employeeList){
                System.out.println(employee);
            }
        }
    }

