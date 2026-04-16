interface Animal {
    void fly();
}

class Main implements Animal{
  // Here we can use the interface methods
   public void fly(){
      System.out.println("Flying");
    }
  public static void main(String[] args) {
    Main obj = new Main();
    obj.fly();
  }
}