interface Animal {
    void walks();
}

interface Herbivore {
    
}

class Horse implements Animal, Herbivore {
    public void walks() {
        System.out.println("walks on 4 legs");
    }
}

public class Interface {
    public static void main(String args[]) {
        Horse h1 = new Horse();
        h1.walks();
    }
}
