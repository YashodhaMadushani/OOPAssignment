class Animal {

    private String name;
    private int age;


    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public void makeSound() {
        System.out.println("Animal makes a generic sound");
    }


    public String getName() {
        return name;
    }


    public int getAge() {
        return age;
    }


    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}


class Mammal extends Animal {

    private String furColor;


    public Mammal(String name, int age, String furColor) {
        super(name, age);
        this.furColor = furColor;
    }


    @Override
    public void makeSound() {
        System.out.println("Mammal makes a mammal-specific sound");
    }


    @Override
    public String toString() {
        return super.toString() + ", Fur Color: " + furColor;
    }
}

class Bird extends Animal {

    private double wingSpan;


    public Bird(String name, int age, double wingSpan) {
        super(name, age);
        this.wingSpan = wingSpan;
    }


    @Override
    public void makeSound() {
        System.out.println("Bird makes a bird-specific sound");
    }


    @Override
    public String toString() {
        return super.toString() + ", Wing Span: " + wingSpan;
    }
}

class Dog extends Mammal {

    private String breed;


    public Dog(String name, int age, String furColor, String breed) {
        super(name, age, furColor);
        this.breed = breed;
    }


    @Override
    public void makeSound() {
        System.out.println("Dog makes a dog-specific sound");
    }


    @Override
    public String toString() {
        return super.toString() + ", Breed: " + breed;
    }
}


class Main {
    public static void main(String[] args) {

        Animal genericAnimal = new Animal("Generic Animal", 5);
        Mammal Tiger = new Mammal("Tiger", 7, "Golden & Black");
        Bird Parrot = new Bird("Parrot", 3, 1.2);
        Dog goldenRetriever = new Dog("Puppy", 10, "Brown", "Golden Retriever");


        genericAnimal.makeSound();
        Tiger.makeSound();
        Parrot.makeSound();
        goldenRetriever.makeSound();


        System.out.println("\nGeneric Animal: " + genericAnimal);
        System.out.println("Tiger: " + Tiger);
        System.out.println("Parrot: " + Parrot);
        System.out.println("Golden Retriever: " + goldenRetriever);
    }
}