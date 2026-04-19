package Constructor;
class Student{
  String name;
  int age;

  // Default Constructor (compiler-generated if none written)
  Student(){}

  // Parameterized Constructor
  Student (String name,int age){
    this.name = name;
    this.age = age;
  }

  // Copy Constructor
  Student (Student s){
    this.name = s.name;
    this.age = s.age;
  }

  // Constructor chaining via this()
  Student(String name){
    this(name,18);
  }

  public void displayNameAge (String name,int age){
    System.out.println("Name is"+" "+name+" "+"and age is"+age);
  }
}
public class Main {
  public static void main(String[] args) {
    Student s = new Student();
    Student s1 = new Student("Alice", 20);
    Student s2 = new Student("Bob");
    Student s3 = new Student(s2);
  }
}
