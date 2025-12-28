package Ass2.Daryn;

public class Employee extends Human implements IWorkable, ILearnable {
    private String position;
    private float salary;
    private static int employeeCount = 0;

    public Employee(int age, String name, boolean isMarried,
                    String position, float salary) {
        super(age, name, isMarried);
        this.position = position;
        this.salary = salary;
        employeeCount++;
    }

    public String getPosition() { return position; }
    public void setPosition(String position) { this.position = position; }
    public float getSalary() { return salary; }
    public void setSalary(float salary) { this.salary = salary; }
    public static int getEmployeeCount() { return employeeCount; }

    @Override
    public void displayRoleInfo() {
        System.out.println("Employee: " + getName() +
                ", Job position: " + position +
                ", Income: " + salary);
    }

    @Override
    public void work() {
        System.out.println(getName() + " is working as " + position + ".");
    }

    @Override
    public void takeBreak() {
        System.out.println(getName() + " is taking a break.");
    }

    @Override
    public void study() {
        System.out.println(getName() + " is attending professional training.");
    }

    @Override
    public void passExam(String subject) {
        System.out.println(getName() + " passed a certification exam in " + subject + ".");
    }
}
