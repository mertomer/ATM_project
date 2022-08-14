package atm_project;

public class Main {
    public static void main(String[] args) {
ATM atm =new ATM();
Account account=new Account("Mert Ömer","2334",500);
atm.run(account);
        System.out.println("Exiting the system");

    }
}
