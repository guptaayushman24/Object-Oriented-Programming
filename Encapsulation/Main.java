package Encapsulation;

class Bank{
  // public int bankBalace;
  private int bankBalance;

  // Bank (int bankBalace){
  //   this.bankBalace = bankBalace;
  // }

  // Getter
  public int getBankBalance (){
     return bankBalance;
  }
  
  // Setter
  public void setBankBalance (int bankbalance){
    this.bankBalance = bankbalance;
  }

}
public class Main {
  public static void main(String[] args) {
    // Bank bank = new Bank(1200);
    // Set the Bank Balance through setter
    Bank bank = new Bank();
    bank.setBankBalance(1200);

    // System.out.println("Before updating balance"+" "+bank.bankBalace);
    // To access the Bank Balance need to use the getter
    System.out.println("Before updating balance"+" "+bank.getBankBalance());

    // bank.bankBalace = bank.bankBalace+1000;
    bank.setBankBalance(bank.getBankBalance()+1200);
    System.out.println("After updating balance"+" "+bank.getBankBalance());

    // In these way anyone can update the bank balance from any class or any method due to it's public nature
    // Encapsulation => Wrapping fields as private and exposing them only through public getters/setters. Protects data integrity and hides implementation details.

    // After encapsulation if we need to accress the field we need to use the getter and setter
  }
  
}
