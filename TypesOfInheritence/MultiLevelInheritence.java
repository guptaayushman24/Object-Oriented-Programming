package TypesOfInheritence;

class Animal{
  public void walking(){
    System.out.println("Animal Walking");
  }
}

class Dog extends Animal{
  public void eating(){
    System.out.println("Dog Eating");
  }
}

class BabyDog extends Dog{
  public void talking(){
    System.out.println("Baby dog talking");
  }

  public void eat(){
    super.eating();
  }
}
public class MultiLevelInheritence {
  public static void main(String[] args) {
      BabyDog babyDog = new BabyDog();
      babyDog.walking(); // From the grandparent
      babyDog.eating(); // From the parent
      babyDog.talking(); // It's own methdod
      babyDog.eat(); // Calling the method using super (Super will call the method of the parent class will not directly call the top most hirearchy)
  } 
}
// The bottom class inherits ALL members from the entire chain
