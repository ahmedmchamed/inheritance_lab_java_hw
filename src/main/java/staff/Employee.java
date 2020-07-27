package staff;

public abstract class Employee {

    private String name;
    private int niNumber;
    private double salary;

    public Employee(String name, int niNumber, double salary) {
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;
    }

    public void setName(String newName) {
        if (newName != null) {
            this.name = newName;
        }
        else {
            System.out.println("Invalid input");
        }
    }

    public String getName() {
        return this.name;
    }

    public int getNiNumber() {
        return this.niNumber;
    }

    public double getSalary() {
        return this.salary;
    }

    public String raiseSalary(double salaryIncrement) {
        if (salaryIncrement > 0) {
            this.salary +=  salaryIncrement;
        }
        else {
            return "Not today, Satan.";
        }
        return null;
    }

    public double payBonus() {
        return this.salary * 0.01;
    }

}
