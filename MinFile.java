
public class MinFile {

    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("Hello World");
        Student var1 = new Student();
        var1.age = 18;
        var1.name = "John";
        System.out.println(" " + var1.name + " " + var1.age + " Hello World");
    }
}

class Student {
    int age;
    String name;
}