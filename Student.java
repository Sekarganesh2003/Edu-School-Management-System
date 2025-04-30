package school;

public class Student {
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int totalFees;

    public Student(int id, String name, int grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.feesPaid = 0;
        this.totalFees = 30000; // Default total fees
    }

    public void payFees(int amount) {
        feesPaid += amount;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public int getRemainingFees() {
        return totalFees - feesPaid;
    }

    @Override
    public String toString() {
        return "Student Name: " + name + " | ID: " + id + " | Grade: " + grade + " | Fees Paid: ₹" + feesPaid;
    }
}
