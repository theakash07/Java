class Employee {
    int id;
    String name;

    public void printdetails() {
        System.out.println("My id is " + id);
        System.out.println("and my name is " + name);
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Employee akash = new Employee();
        Employee java = new Employee();
        akash.id = 14615;
        akash.name = "akash";
        java.id = 1343;
        java.name = "hello java";
        akash.printdetails();
        java.printdetails();
    }
}
