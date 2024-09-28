abstract class Animal {
    abstract void makeSound();

    void sleep() {
        System.out.println("The animal is sleeping");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("The dog barks");
    }
}

class Cat extends Animal {
    void makeSound() {
        System.out.println("The cat meows");
    }
}

public class AbstractClassExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.makeSound();
        dog.sleep();

        cat.makeSound();
        cat.sleep();
    }
}
