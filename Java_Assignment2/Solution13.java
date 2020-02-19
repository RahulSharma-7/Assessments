import java.util.Scanner;

public class Solution13 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Email");
        String email = sc.nextLine();


    }

}

    public void validateEmail(String email) throws EmailNotUniqueException{
        if(email.equals("abc@efg.com")){
            throw new EmailNotUniqueException("Invalid Email");
        }

    }




}


class EmailNotUniqueException extends Exception{

    public EmailNotUniqueException(String message){
        super(message);
    }



}