import java.util.Scanner;
class BankAccount{
  double balance=100.00;
  double previousTransaction;
  String customerName;
  String customerID;
  boolean done= false;


  public void BankAccount(){
   }
  public void BankAccount(String cname, String id){
   customerName = cname;
   customerID = id;
  }

  public void deposit(double amount){
    if(amount < 0){ //set parameter: no negatives
      balance = balance;
      System.out.println("Unable to deposit negatives");
    }
    else if(amount != 0){
      balance = balance + amount; //add to balance
      previousTransaction= amount; //shows what as added
      System.out.println("Deposit: " + amount +" New Balance "+ balance);
    }
    else{
      balance = balance; //no changes
    }

  }
  public void withdraw(double amount){
    if (amount > balance){//set parameter: cant be over amount
      System.out.println("Unable to withdraw ");
      balance= balance; //balance stays the same
    }
    else if (amount != 0){
      balance= balance - amount; //withdraw
      previousTransaction= -amount; //show withdraw amount
      System.out.println("Withdrawal: " + amount +" New Balance "+ balance);
    }
    else {
      balance = balance; //balance remains the same
    }
  }

  public void getPTransaction(){
    System.out.println("Balance: " + balance); //balance now
    if (previousTransaction > 0){ //over 0, positive amount
      System.out.println("Deposit transaction: " + previousTransaction);
    }
    else if (previousTransaction < 0){ //under zero negative amount
      System.out.println("Withdrawal transaction: " + previousTransaction);
    }
    else{
      System.out.println("No transactions");}
  }
  public void showMenu(){ //display menu
    char option;
    Scanner scanner= new Scanner(System.in);
    System.out.println("Welcome "+ customerName);
    System.out.println("Your ID is "+ customerID);
    System.out.println("\n");
    System.out.println(" 1: Checkbalance ");
    System.out.println(" 2: Check Precious Transactions " );
    System.out.println(" 3: Deposit " );
    System.out.println(" 4: withdraw " );
    System.out.println(" 5: exit " );
    System.out.println("\n");

    System.out.println("Pick an option ");
    option = scanner.next().charAt(0); //stores user answer
while (option != '5'){ //if they didnt pick exit
    switch(option){
      case '1':
        System.out.println("Balance: " + balance);
        System.out.println("\n");
        done= true;
        break;
      case '2':
        System.out.println("Previous Transaction: " + previousTransaction);
        System.out.println("\n");
        done = true;
        break;
      case '3':
        System.out.println("Deposit: ");
        double input= scanner.nextDouble();
        deposit(input);
        System.out.println("\n");
        done = true;
        break;
      case '4':
        System.out.println("Withdrawal: ");
        double input2 = scanner.nextDouble();
        withdraw(input2);
        System.out.println("\n");
        done = true;
        break;
      case '5':
        System.out.println("Have a good day");
        System.out.println("\n");
        done = true;
        break;
      default:
        System.out.println("Try again");
        System.out.println("\n");
        break;


    }//switch
    if (done = true){
      showMenu();
      break;
    }
  }//while
}//function
  public void starting(){ //starting screen

    String name;
    String id;
    Scanner scanner= new Scanner(System.in); //call on scanner function
    System.out.println("Welcome enter your name");
    name= scanner.next();
    System.out.println("Welcome enter your ID");
    id= scanner.next();
    BankAccount(name, id);
    showMenu(); //call funtction to show the menu
  }
}
