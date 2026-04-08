package Class;

class Car {
  String name;
  int price;

  // Constructor
  Car(String name, int price) {
    this.name = name;
    this.price = price;
  }

  // Defualt Constructor
  Car() {

  }

  Car(String name) {
    this.name = name;
  }

  Car(int price) {
    this.price = price;
  }

  public String carName(String name) {
    return "Name of the car is" + " " + this.name;
  }
}

public class Main {
  public static void main(String[] args) {
    Car car1 = new Car("Audi", 10009);
    Car car2 = new Car();
    Car car3 = new Car("Mercedes");
    Car car4 = new Car(1234);

    System.out.println(car1.carName("BMW"));
  }
}
