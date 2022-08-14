package atm_project;



import java.util.Scanner;

public class Login {

    public boolean login(Account account){
    Scanner scan = new Scanner(System.in);
    String user_name;
    String password;

    System.out.println("User Name : ");
    user_name= scan.nextLine();
    System.out.println("password : ");
    password = scan.nextLine();

    if (account.getUser_name().equals(user_name) && account.getPassword().equals(password)){
        return true;

    }else {
        return false;
    }
}


}

