class Student {

    private String name;
    private int age;
    private char grade;


    public String getName() {
        return name;
    }


    public void setName(String newName) {
        name = newName;
    }


    public int getAge() {
        return age;
    }


    public void setAge(int newAge) {
        age = newAge;
    }


    public char getGrade() {
        return grade;
    }


    public void setGrade(char newGrade) {
        grade = newGrade;
    }


    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }
}


class Main {

    public static void main(String[] args) {

        Student student = new Student();


        student.setName("John Doily");
        student.setAge(28);
        student.setGrade('A');


        System.out.println("Student Details:");
        student.displayInfo();
    }
}
