package Polymorphism;
class Calculator{
  // int a;
  // int b;
  // Calculator (int a,int b){
  //   this.a = a;
  //   this.b = b;
  // }
  public int add (int a,int b){
    return a+b;
  }
  public double add (double a,double b){
    return a+b;
  }
}
class Shape{
    public  void draw (){
      System.out.println("Drawing Shape");
    }
  }

  class Circle extends Shape{
    @Override // Method overriding (Resolves at runtime)
    public void draw(){
      System.out.println("Drawing Circle");
    }
  }
class Main{
  public static void main(String[] args) {
    // Polymorphism => Same method name but different return type,different parameter,difference in number of parameter and resolbved at compile time
    // Polymorphism => Method Overloading
     Calculator cal = new Calculator();
     System.out.println(cal.add(4, 5));
     System.out.println(cal.add(2.0,9.9));

     Shape circle = new Circle(); // Upcasting (Will run the method method which is in the circle)
     circle.draw();


  }
}