class Student {

    private String name;
    private int age;
    private char grade;


    public Student() {
        this.name = "Sam Convey";
        this.age = 0;
        this.grade = 'A';
    }


    public Student(String name, int age, char grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }


    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.grade = 'N';
    }


    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }
}


class Main {

    public static void main(String[] args) {
        // Task 5: Create Student Instances with default constructor
        Student student1 = new Student();
        System.out.println("Student 1 Information:");
        student1.displayInfo();


        Student student2 = new Student("Ann Johnson", 19, 'C');
        System.out.println("\nStudent 2 Information:");
        student2.displayInfo();

        Student student3 = new Student("John Smith", 25);
        System.out.println("\nStudent 3 Information:");
        student3.displayInfo();
    }
}
