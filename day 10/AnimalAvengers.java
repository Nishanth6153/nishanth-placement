abstract class Animal {

    String name;
    String power;

    Animal(String name, String power) {
        this.name = name;
        this.power = power;
    }

    abstract void attack();

    void introduce() {
        System.out.println(name + " enters the battlefield!");
        System.out.println("Special Power : " + power);
        System.out.println();
    }
}

class Panda extends Animal {

    Panda() {
        super("Panda", "Wisdom Blast");
    }

    void attack() {
        System.out.println("Panda releases Wisdom Blast!");
    }
}

class Fox extends Animal {

    Fox() {
        super("Fox", "Lightning Speed");
    }

    void attack() {
        System.out.println("Fox moves faster than light!");
    }
}

class Octopus extends Animal {

    Octopus() {
        super("Octopus", "Brain Shock");
    }

    void attack() {
        System.out.println("Octopus hacks enemy systems!");
    }
}

class Anaconda extends Animal {

    Anaconda() {
        super("Anaconda", "Titan Crush");
    }

    void attack() {
        System.out.println("Anaconda crushes Mega-Bot!");
    }
}

class Rhino extends Animal {

    Rhino() {
        super("Rhino", "Iron Shield");
    }

    void attack() {
        System.out.println("Rhino charges with Iron Shield!");
    }
}

class KomodoDragon extends Animal {

    KomodoDragon() {
        super("Komodo Dragon", "Dragon Fire");
    }

    void attack() {
        System.out.println("Komodo Dragon breathes fire!");
    }
}

class Bison extends Animal {

    Bison() {
        super("Bison", "Thunder Strike");
    }

    void attack() {
        System.out.println("Bison summons thunder!");
    }
}

public class AnimalAvengers {

    public static void main(String[] args) {

        System.out.println("===== ANIMAL AVENGERS =====\n");

        Animal[] heroes = {
                new Panda(),
                new Fox(),
                new Octopus(),
                new Anaconda(),
                new Rhino(),
                new KomodoDragon(),
                new Bison()
        };

        System.out.println(
                "MEGA-BOT has taken over Earth!\n");

        for (Animal hero : heroes) {
            hero.introduce();
            hero.attack();
            System.out.println("--------------------");
        }

        System.out.println("\nFinal Battle Begins!");

        System.out.println(
                "\nAll animals combine their powers...");
        System.out.println(
                "ULTIMATE ANIMAL STORM ACTIVATED!");

        System.out.println(
                "\nMega-Bot HP : 100%");
        System.out.println("Mega-Bot HP : 70%");
        System.out.println("Mega-Bot HP : 40%");
        System.out.println("Mega-Bot HP : 10%");
        System.out.println("Mega-Bot HP : 0%");

        System.out.println(
                "\nMega-Bot Destroyed!");

        System.out.println(
                "\nThe Earth is saved!");
        System.out.println(
                "Animal Avengers are now legends!");
    }
}