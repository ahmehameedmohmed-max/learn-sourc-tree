
public class MinFile {

    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("Hello World");
        Student var1 = new Student();
        car var2 = new car();
        var1.age = 18;
        var1.name = "John";
        var2.ingin = 200;
        var2.name = "Toyota";
        System.out.println(" " + var1.name + " " + var1.age + " Hello World");
    }
}

class Student {
    int age;
    String name;
}

class car {
    int ingin;
    String name;
}