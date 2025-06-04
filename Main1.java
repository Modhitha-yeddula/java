abstract class Animal {
    abstract void sound();      // abstract method
    void eat() {                // concrete method
        System.out.println("Animal eats");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }
}

public class Main1 {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.sound();   // From Cat
        c.eat();     // From Animal (concrete)
    }
}
