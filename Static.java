class Student {
    String name;
    static String school;

    public static void changeSchool() {
        school = "new School";
        
    }
    
}

public class Static {
    public static void main(String args[]) {
        Student.school = "ABC School"; // Setting the static variable
        Student s1 = new Student();
        s1.name = "Alice";
        
        System.out.println(s1.name + " studies at " + Student.school);
        
    }
}
