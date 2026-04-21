
class Student{
  public static int count = 0;
  
  Student(){  
    count++;
  }

  int id;
  String name;

  public static void getTotalStudent(){
    System.out.println("Total Student in the class is"+" "+count);
  }
  // static block
  static{
    System.out.println("Hello");
    // static block are use to initialze the object and to initialixe the static variable 
  }
}
public class Main {

  public static void main(String[] args) {
    Student student1 = new Student();
    Student student2 = new Student();

    System.out.println(Student.count); // Directly accessing the count with the Name of the class
    Student.getTotalStudent(); // Accessing the student method getTotalStudent() directly from the class

    // Calling the CommonUtil Methods
    System.out.println("Max: " + CommonUtil.findMax(10, 20));
    System.out.println("Min: " + CommonUtil.findMin(10, 20));
  }
}

// Static is the property of the class not the property of the refrence
// If any variable is the static then we can access that with the help of the class
// We can create the static method also and can call it directly with the help of the className
// Static method cannot use non static data member or call not static method directly
// this and super cannot use in the static context