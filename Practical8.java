class Animal {
    String name;
    int age;

    void eat() {
        
    }

    void sleep() {
    
    }
    abstract void makeSound();
}

class Mammal extends Animal {
    String furColor;

    void giveBirth() {
        
    }

    void makeSound() {
        
    }
}

class Bird extends Animal {
    boolean canFly;

    void fly() {
        
    }

    void makeSound() {

    }
}
class Parrot extends Bird {
    String featherColor;

    void mimic() {
    
    }

    void makeSound() {
        
    }

    final void parrotSpecificMethod() {

    }
}

public class Main {
    public static void main(String[] args) {
        Mammal mammal = new Mammal();
        Bird bird = new Bird();
        Parrot parrot = new Parrot();

        System.out.println(mammal.toString());
        System.out.println(bird.equals(mammal));
        System.out.println(parrot.toString());
    }
}

