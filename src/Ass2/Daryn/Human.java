package Ass2.Daryn;

public abstract class Human {
    // 6. Поля теперь protected
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

    // 4. Абстрактный метод — обязателен для реализации в наследниках
    public abstract void displayRoleInfo();

    // Обычный метод
    public void introduce() {
        System.out.println("Hello, my name is " + name + ".");
    }

    // Геттеры и сеттеры
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public boolean isMarried() { return isMarried; }
    public void setMarried(boolean married) { this.isMarried = married; }
}