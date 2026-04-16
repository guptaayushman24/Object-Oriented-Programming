
public interface Dog {
  // Abstract method (by default public) Pre java8
  void fly();

  // Default methd also include in the abstraction after Java8+
  default void landing(){
    System.out.println("Landing.....");
  }

  // Static methods
  static void rules (){
    System.out.println("Rules ...."); // Java8+
  }
}
