final class Student{ // Since student class is the final it cannot be extended anywhere
   // public static final int studentStrength = 90;
    public static final int studentStrength;
  //  public void getStudentStength(int studentStrength){  (Will give the error because final field cannot be modified)
  //    this.studentStrength = studentStrength;
  //  }

  // Since the above field is static we can declare it in the static block also

  // Static Method
  public final int addNumber (int x,int y){ // If the method is final then the class which is extending these class will not be able to override the method and cannot make any changes in the business logic
    return x+y;
  }
  static{
    studentStrength = 90;
  }


}
class Main{
  public static void main(String[] args) {
    System.out.println("Hello");
    System.out.println("The strength of student is"+" "+Student.studentStrength);
    // Student.studentStrength = 45; (Will give the error because final field cannot be modified)
  }
}

// Final can be variable,Can be method and can be class
// If we declare any variable as the final then we cannot modify it even using the constructor