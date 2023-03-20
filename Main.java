import java.util.*;

public class Main {
    public static void main(String[] args) {
        //password valid invalid program
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter password ");
        String pass = sc.nextLine();
        Passwd New=new Passwd();
        if(New.valid(pass)){
            System.out.println("password is valid "+ pass);
        }
        else{
            System.out.println("invalid password");

        }
    }
}