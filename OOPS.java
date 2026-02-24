class Pen{
    String color;
    String type;

    public void write(){
        System.out.println("writing something");
    }
    
    public void printcolor(){
        System.out.println(this.color);
    }

}
class Student{
    String name;
    int age;
    int rollno;

    public void printinfo(){
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.rollno);
    }

    //  Student(){
    //     System.out.println("constructor called");
    // }
    // Student(String name, int age, int rollno){
    //     System.out.println("constructor called");
    //     this.name = name;
    //     this.age = age; 
    //     this.rollno = rollno;
    // }

    Student(Student s2){
        System.out.println("constructor called");
        this.name = s2.name;
        this.age = s2.age; 
        this.rollno = s2.rollno;
    }
    Student(){
       
    }
}


public class OOPS {
    public static void main(String args[]){
        Pen p1 = new Pen();
        p1.color = "blue";
        p1.type = "ballpoint";

        Pen p2 = new Pen();
        p2.color = "black";
        p2.type = "gel";
        
        p1.printcolor();
        p2.printcolor();

        // Student s1 = new Student("Bob", 22, 102);
        // s1.name = "Alice";
        // s1.age = 20;
        // s1.rollno = 101;
        // s1.printinfo();
        Student s1 = new Student();
        s1.name = "Alice";
        s1.age = 20; 
        s1.rollno = 101;
       
        Student s2 = new Student(s1);
        s2.printinfo();
    }
}