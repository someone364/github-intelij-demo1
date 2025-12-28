package Ass2.Daryn;

public final class Student extends Human implements ILearnable {
    private String faculty;
    private float averageGrade;

    private final String studentId;

    public Student(int age, String name, boolean isMarried,
                   String faculty, float averageGrade, String studentId) {
        super(age, name, isMarried);
        this.faculty = faculty;
        this.averageGrade = averageGrade;
        this.studentId = studentId;
    }

    public String getFaculty() { return faculty; }
    public void setFaculty(String faculty) { this.faculty = faculty; }
    public float getAverageGrade() { return averageGrade; }
    public void setAverageGrade(float averageGrade) { this.averageGrade = averageGrade; }
    public String getStudentId() { return studentId; }  // только геттер

    @Override
    public void displayRoleInfo() {
        System.out.println("Student: " + getName() +
                ", Faculty: " + faculty +
                ", GPA: " + averageGrade +
                ", ID: " + studentId);
    }

    @Override
    public void study() {
        System.out.println(getName() + " is studying at " + faculty + " faculty.");
    }

    @Override
    public void passExam(String subject) {
        System.out.println(getName() + " passed the exam in " + subject + "!");
    }

    // 5. final метод
    public final void graduate() {
        System.out.println(getName() + " has graduated from university! Congratulations!");
    }
}
