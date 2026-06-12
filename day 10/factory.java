interface Animal {
    void makeSound();
}

class Dog implements Animal {
    public void makeSound() {
        System.out.println("Dog says: Woof Woof");
    }
}

class Cat implements Animal {
    public void makeSound() {
        System.out.println("Cat says: Meow Meow");
    }
}

class AnimalFactory {

    public Animal getAnimal(String type) {

        if (type.equalsIgnoreCase("dog")) {
            return new Dog();
        }

        if (type.equalsIgnoreCase("cat")) {
            return new Cat();
        }

        return null;
    }
}

public class factory {
    public static void main(String[] args) {

        AnimalFactory factory = new AnimalFactory();

        Animal animal1 = factory.getAnimal("dog");
        Animal animal2 = factory.getAnimal("cat");

        animal1.makeSound();
        animal2.makeSound();
    }
}