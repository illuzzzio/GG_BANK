import java.util.Scanner;
public class Main{
   static Scanner scanner = new Scanner(System.in);// Scanner declared once to use everywhere

  public static void main(String[] args){

    double Balance = 1000 ; 
    int Choice;
    boolean isRunning= true;

    while(isRunning){
      System.out.println("        _____________________");
      System.out.println("       /                     \\");
      System.out.println("      /       GG BANK         \\");
      System.out.println("     /_________________________\\");
      System.out.println("     ||   ||   ||   ||   ||   ||");
      System.out.println("     ||   ||   ||   ||   ||   ||");
      System.out.println("     ||   ||   ||   ||   ||   ||");
      System.out.println("     ||___||___||___||___||___||");
      System.out.println("     |                         |");
      System.out.println("     |   ___             ___   |");
      System.out.println("     |  |   |           |   |  |");
      System.out.println("     |  |___|           |___|  |");
      System.out.println("     |_________________________|");

      System.out.println("1.Show balance");
      System.out.println("2.Deposit");
      System.out.println("3.Withdraw");
      System.out.println("4.Exit bank");

      System.out.print("Enter your desired Choice  (1-4)... : ");

      Choice = scanner.nextInt();
      scanner.nextLine(); // Consume leftover newline

      switch(Choice){
        case 1 -> ShowBalance(Balance);

        case 2 -> {
          double depo = Deposit();
          if (depo == -1) { // user chose to exit inside deposit
            isRunning = false;
          } else {
            Balance += depo;
          }
        }

        case 3 -> {
          double wid = Withdraw(Balance);
          if (wid > 0) {
            Balance -= wid;
          }
        }

        case 4 -> isRunning = false;

        default -> System.out.println("Invalid input ");
      }

      System.out.println();
    }

    scanner.close();

  }

  static void ShowBalance(double Balance ){
    System.out.printf("Your current balance is: $%.2f\n", Balance);
  }

  static double Deposit(){
    System.out.println("How much money do you want to deposit ? ");
    double depo = scanner.nextDouble();
    scanner.nextLine(); // consume newline

    if(depo < 0){
      System.out.println("You have entered a negative Amount");
      return 0;
    }
    else if (depo > 10000){
      System.out.println("Can't deposit more than 10000 at a time.");
      System.out.println("If you want special permission, type 'ggwp', else type 'no': ");

      String special = scanner.nextLine().trim();

      if(special.equalsIgnoreCase("ggwp")){
        return depo;
      }
      else if(special.equalsIgnoreCase("no")){
        System.out.println("Thank you, exiting the bank.");
        return -1;  // special signal to exit main loop
      }
      else {
        System.out.println("Please only write 'ggwp' or 'no'. Deposit cancelled.");
        return 0;
      }
    }
    else{
      return depo;
    }
  }

  static double Withdraw(double Balance){
    System.out.println("How much do you want to withdraw?");
    double wid = scanner.nextDouble();
    scanner.nextLine(); // consume newline

    if(wid < 0){
      System.out.println("You cannot withdraw a negative amount.");
      return 0;
    }
    else if(wid > Balance){
      System.out.println("Insufficient balance!");
      return 0;
    }
    else{
      return wid;
    }
  }
}
