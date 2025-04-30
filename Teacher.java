package school;

public class Teacher {
    private int id;
    private String name;
    private int salary;
    private int salaryEarned;

    public Teacher(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.salaryEarned = 0;
    }

    public void receiveSalary(int amount) {
        salaryEarned += amount;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public int getSalaryEarned() {
        return salaryEarned;
    }

    @Override
    public String toString() {
        return "Teacher Name: " + name + " | ID: " + id + " | Salary Earned: ₹" + salaryEarned;
    }
}
