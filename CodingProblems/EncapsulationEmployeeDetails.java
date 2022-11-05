package CodingProblems;

class Employee{
    private int baseSalary;
    private int hourlyRate;
    public int calculateWage(int extraHours){
        return baseSalary + (hourlyRate * extraHours);
    }
    public void setBaseSalary(int baseSalary){
        if(baseSalary <= 0){
            throw new IllegalArgumentException("Salary cannot be 0");
        }
        this.baseSalary = baseSalary;

    }
    public int getBaseSalary() {
        return baseSalary;
    }

    public void setHourlyRate(int hourlyRate) {
        if(hourlyRate <= 0){
            throw new IllegalArgumentException("HourlyRate cannot be 0 or negative");
        }
        this.hourlyRate = hourlyRate;
    }
}

public class EncapsulationEmployeeDetails {
    public static void main(String [] args){
        var employee = new Employee();
        employee.setBaseSalary(50_000);
        employee.setHourlyRate(20);
        int wage = employee.calculateWage(20);
        System.out.println(wage);
    }
}
