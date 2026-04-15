package Abstraction;
abstract class Animal{
  String name;
  Animal() {                        // no-arg constructor — allows Dog() default constructor to work
  }

  Animal(String name) {             // parameterized constructor
    this.name = name;
  }
  abstract public void sayHello();
  abstract public void sayAge (int ageOfAnimal);
  public void sleep(){
    System.out.println("zzzz .....");
  }

  public void sayName (){
    System.out.println("Name of the dog is"+" "+this.name);
  }
}

// In the abstract class there can be the abstract method and the concrete method (the method which has the body) (It is not necessary that in the abstract class abstract method should be present)
// In the abstract class there can be the variable and the constructor 

// Can abstract class have non-abstract methods? (Different between abstract and interface)
// Yes — that's the key difference from an interface. Abstract classes can have concrete methods, fields, and constructors.

// Abstract class object cannot be instantiate (Reason => In abstract class there are the method which do not have the body or signature so there is not point to instantiate it)


// Can an abstract class have a constructor?
//Yes. It cannot be instantiated directly, but its constructor is called via super() in the subclass constructor to initialise the common state.


// Abstract class vs Interface — when to use which?
// Use abstract class when classes share common state/code (partial implementation + IS-A). Use interface for a pure contract (CAN-DO capability), especially for multiple inheritance.