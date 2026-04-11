package Inheritence;
class Animal{
  public String walk;
  public int speed;

  public void startWalking(){
    System.out.println("Start Walking");
  }

  public void eat (){
    System.out.println("Animal Eating");
  }
  Animal(){}
  Animal(int speed){
    this.speed = speed;
  }
}

class Dog extends Animal{
  public String speak;

  public void startSpeaking(){
    System.out.println("Start Speaking");
  }

  @Override // Method Overriding => When a subclass provides its own implementation of a method already defined in the parent. Requires same method signature. Resolved at runtime (dynamic dispatch).
  public void eat(){
    super.eat(); // Calling the parent method
    System.out.println("Dog Eating");
  }
  Dog(){};
  // Need to defind the speed of the Dog class
  // No need to create the extra variable Animal class has already the speed variable
  Dog (String speak,int speed){
    super(speed);
    this.speak = speak;
  }
  public void speedAndSpeak (int speed,String speak){
    System.out.println("Spped of dog is"+" "+speed+" "+"and"+" "+speak);
  }

  
}
class Main{
  public static void main(String[] args) {
    Dog dog = new Dog();
    dog.startSpeaking();
    dog.startWalking();
    dog.eat();

    Dog dog1 = new Dog("Bark",25);
    dog1.speedAndSpeak(25, "Bark");
  }
}