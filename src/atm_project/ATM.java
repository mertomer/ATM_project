package atm_project;



import java.util.Scanner;

public class ATM {
    public void run (Account account){
        Login login=new Login();
        Scanner scan =new Scanner(System.in);
        System.out.println("Welcome to are bank....");
        System.out.println("------------------------------");
        System.out.println("User login");
        System.out.println("-----------------------------");
        int loginAttempt=3;
        while(true){
            if (login.login(account)){
                System.out.println("Login successfully");
                break;

            }else{
                System.out.println("Login failed");
                loginAttempt -=1;
                System.out.println("remaining login attempt : "+loginAttempt);

            }if (loginAttempt==0){
                System.out.println("Login attempt over....");
                return;
            }

        }
        System.out.println("--------------------------------");
String transactions="1. Show Balance" + " "+"2. Deposite "+
        " "+"3.Withdraw"+ " " +"4.press f for exit";

        System.out.println(transactions);
        System.out.println("--------------------------------");
while(true){
    System.out.println("Choose process : ");
    String process= scan.nextLine();
    if (process.equals("f")){
        System.out.println("You logged out");
        break;
    }else if (process.equals("1")){
        System.out.println("Your balance : " + account.getBalance());
    }else if (process.equals("2")){
        System.out.println("Amount of money to be deposited : " );
        int amount =scan.nextInt();
        scan.nextLine();
        account.deposit(amount);

    }else if (process.equals("3")){
        System.out.println("Amount of money to be withdraw : ");

        int amount =scan.nextInt();
        scan.nextLine();
        account.withdraw(amount);
    }else{
        System.out.println("İnvalid process");
    }
}
    }






        }

