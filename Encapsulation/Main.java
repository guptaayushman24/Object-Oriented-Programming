package Encapsulation;

class Bank{
  public int bankBalace;

  Bank (int bankBalace){
    this.bankBalace = bankBalace;
  }

}
public class Main {
  public static void main(String[] args) {
    Bank bank = new Bank(1200);
    System.out.println("Before updating balance"+" "+bank.bankBalace);

    bank.bankBalace = bank.bankBalace+1000;
    System.out.println("After updating balance"+" "+bank.bankBalace);
  }
  
}
