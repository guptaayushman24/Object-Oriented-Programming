class InsufficientFundsException extends Exception{
  InsufficientFundsException (String msg){
    super(msg);
  }
}
public class BankBalance{
  private int bankBalance;

  BankBalance(){};
  BankBalance(int bankBalance){
    this.bankBalance = bankBalance;
  }

  public int withdrawAmount (int amount) throws InsufficientFundsException{
    if (amount>bankBalance){
      throw new InsufficientFundsException("Balance is insufficient");
    }
    bankBalance = bankBalance-amount;
    return bankBalance;
  }
}
