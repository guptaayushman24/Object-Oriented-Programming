class Main extends BankBalance{
  public static void main(String[] args) {
    BankBalance bankBalance = new BankBalance(600);

    try{
      int newBalance = bankBalance.withdrawAmount(1000);
      System.out.println(newBalance);
    }
    catch (Exception e){
      System.out.println(e.getMessage());
    }

    finally{
      System.out.println("Transaction Complete");
    }

    // Unchecked Exception
    int [] arr = {1,3,5,4};
    try{
      System.out.println(arr[3]);
    }
    catch(RuntimeException rn){
      System.out.println(rn);
    }

    finally{
      System.out.println("Execution completes");
    }
  }
}


// Checked — compiler forces you to handle them (extend Exception). E.g., IOException, SQLException.
// Unchecked — runtime, not forced (extend RuntimeException). E.g., NullPointerException, ArrayIndexOutOfBoundsException.