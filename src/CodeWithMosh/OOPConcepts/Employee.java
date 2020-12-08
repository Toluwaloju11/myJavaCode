package CodeWithMosh.OOPConcepts;

public class Employee {
    private double baseSalary;
    private double hourlyRate;
    public static int numberOfEmployees;

    public Employee(double baseSalary, double hourlyRate){
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
        numberOfEmployees++;
    }

    public double calculateWage(double extraHours){
        return baseSalary + (hourlyRate * extraHours);

    }
    public double calculateWage(){
        return baseSalary ;
    }

    private void setBaseSalary(double baseSalary){
        if (baseSalary <= 0)
            throw new IllegalArgumentException("Salary cannot be 0 or less.");
        this.baseSalary = baseSalary;
    }

    private double getBaseSalary(){
        return baseSalary;
    }

    private void setHourlyRate(double hourlyRate){
        if (hourlyRate <= 8)
            throw new IllegalArgumentException("hourlyRate cannot be 8 or less.");
        this.hourlyRate = hourlyRate;
    }

    private double getHourlyRate(){
        return hourlyRate;
    }


}
