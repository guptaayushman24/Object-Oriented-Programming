package TypesOfInheritence;

class Animal{
  int walk;

  public void walking (){
    System.out.println("Animal Walking");
  }
}
class Dog extends Animal{
    public void eat(){
      System.out.println("Dog Eating");
    }
  }
public class SingleInheritence {
  public static void main(String[] args) {
    Dog dog = new Dog();
    dog.eat(); // From the dog class
    dog.walking(); // From the animal class which dog extends (Dog -> Child Animal -> Parent)
  }
}
// Child gets all non-private fields and methods of parent
// Establishes an IS-A relationship — a Dog IS-A Animal