//  compile time polymorphism (method overloading)

// public class Polymorphism {
//     public int add(int a, int b) {
//         return a + b;
//     }
//     public double add(double a, double b) {
//         return a + b;
//     }
//     public String add(String a, String b) {
//         return a + b;
//     }
//     public static void main(String[] args) {
//         Polymorphism obj = new Polymorphism();
//         System.out.println(obj.add(5, 10)); 
//         System.out.println(obj.add(5.5, 10.5)); 
//         System.out.println(obj.add("Hello, ", "World!")); 
//     }
// }


//  run time polymorphism (method overriding)
// Class 1
// Helper class
class Parent {

    // Method of parent class
    void Print() { System.out.println("parent class"); }
}


class Subclass1 extends Parent {

 
    void Print() { System.out.println("subclass1"); }
}


class Subclass2 extends Parent {

    void Print() { System.out.println("subclass2"); }
}

class Polymorphism {
    public static void main(String[] args){
        Parent a;
        a = new Subclass1();
        a.Print();

        a = new Subclass2();
        a.Print();
    }
}