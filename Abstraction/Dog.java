package Abstraction;

public class Dog extends Animal {

  // Implementing the constructor of the Animal Class
  Dog (String name){
    super (name); // This calls Animal's constructor
  }

  // Empty Constructor
  Dog(){};

  @Override
  public void sayHello() {
    System.out.println("Dog is saying Hello");
  }

  @Override public void sayAge(int ageOfAnimal){
    System.out.println("Age of the dog is"+" "+ageOfAnimal);
  }

  public static void main(String[] args) {

    // Animal animal = new Animal(); Cannot instantiate Animal

    Animal animal = new Dog("Tom");
    Animal animal1 = new Dog();
    animal.sleep(); // Now you can call all the methods of the Animal including abstract one
    animal.sayAge(20);
    animal.sayName();
    
  }
}
