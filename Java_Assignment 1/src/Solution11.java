/*
Create 3 sub class of bank SBI,BOI,ICICI all 4 should have method called getDetails which provide there specific details
    like rateofinterest etc,print details of every banks*/

import java.util.Scanner;

public class Solution11 {

    private String BankName;
    private int AccountNo;
    private String AccountHolderName;
    private String AccountType;

    String getName() {
        return this.BankName;
    }

   public void setName(String s) {
        this.BankName = s; }
    int getAccountNo() {
        return this.AccountNo;
    }

    public void setAccountNo(int n) {
        this.AccountNo = n; }

        public String getAccountType(){return this.AccountType;}
        public void setAccountType(String type){this.AccountType=type;}
        public void setAccountHolderName(String name){this.AccountHolderName=name;}
        public String getAccountHolderName(){return this.AccountHolderName;}

}
class MainClass extends Solution11{


    public static void main(String args[]) {
        Solution11 obj = new Solution11();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Bank name");
      obj.setName(sc.nextLine());


      System.out.println("Enter the AccountHolders name");
      obj.setAccountHolderName(sc.nextLine());

        System.out.println("Enter the AccountNo ");
        obj.setAccountNo(sc.nextInt());
        sc.nextLine();

        System.out.println("Enter the AccountType ");
        obj.setAccountType(sc.nextLine());

        display( obj);

        System.out.println("Do you want to continue Enter y for yes");
        if(sc.nextLine().charAt(0)=='y') {
            String s[]=new String[1];
            main(s);
        }

    }



    public static void display(Solution11 obj){
        System.out.println("The bank name is "+obj.getName());
        System.out.println("The AccountHolders name is "+obj.getAccountHolderName());
        System.out.println("The Account no is "+obj.getAccountNo());
        System.out.println("The Account Type is "+obj.getAccountType());
    }



}






