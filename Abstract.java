abstract class Animal {
    abstract void walk();

    Animal() {
        System.out.println("Animal constructor called");
    }
    public void eats(){
        System.out.println("Animal eats");
    }
}

class Horse extends Animal {

    Horse() {
        System.out.println("Horse constructor called");
    }
    public void walk() {
        System.out.println("walks on 4 legs");
    }
}

class Chicken extends Animal {
    public void walk() {
        System.out.println("walks on 2 legs");
    }
}

public class Abstract {
    public static void main(String args[]) {
        Horse h1 = new Horse();
        h1.walk();

        Chicken c1 = new Chicken();
        c1.walk();
    }
    
}
