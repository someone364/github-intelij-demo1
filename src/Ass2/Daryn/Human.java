package Ass2.Daryn;

public abstract class Human {
    protected int age;
    protected String name;
    protected boolean isMarried;

    public Human(int age, String name, boolean isMarried) {
        this.age = age;
        this.name = name;
        this.isMarried = isMarried;
    }

    public void printBasicInfo() {
        System.out.println("Name: " + name + ", Age: " + age +
                ", Married?: " + (isMarried ? "yes" : "no"));
    }

    public abstract void displayRoleInfo();

    public void introduce() {
        System.out.println("Hello, my name is " + name + ".");
    }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public boolean isMarried() { return isMarried; }
    public void setMarried(boolean married) { this.isMarried = married; }
}
