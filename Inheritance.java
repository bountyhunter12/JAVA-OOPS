class Shape {
//    String color;
    public void area() {
        System.out.println("displays area");
    }
}
class Triangle extends Shape {
    public void area(int b, int h) {
        System.out.println((0.5)*b*h);
    }

}

class  EquilateralTriangle extends Triangle {
    public void area(int b, int h) {
        System.out.println((0.5)*b*h);
    }
}
// class Circle extends Shape {
//    public void area(int r) {
//        System.out.println((3.14)*r*r);
//    }  
// }


public class Inheritance {
    public static void main(String args[]){
        Triangle t1 = new Triangle();
        t1.color = "Red";
        System.out.println(t1.color);
    }
}
