/*Simple bank system like select bank and put account number and name then 
 enter PIN to login account.
 After logged in display user's name,account number and balance.
 */
import java.util.*;
import java.lang.*;
class CH
{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your bank: ");
        String bank = sc.nextLine();
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        if(bank.equals("SBI"))
        {
            System.out.print("Welcome to your SBI account!");
            System.out.println("Enter 11 digit account number: ");
            long ac = sc.nextLong();
            System.out.print("Enter PIN to login: ");
            int pin = sc.nextInt();
            if(pin==1220)
            {
                
                System.out.println("Logged in successfully!");
                System.out.println("Account number: "+ac);
                System.out.println("Account holder: "+name);
                System.out.println("Balance: 0.0INR");
                
            }
            else
            {
                System.out.println("Invalid PIN! please try again.");
            }
        }
        else if(bank.equals("BOB"))
        {
            System.out.print("Welcome to your BOB account!");
            System.out.println("Enter 13 digit account number: ");
            long ac = sc.nextLong();
            System.out.print("Enter PIN to login: ");
            int pin = sc.nextInt();
            if(pin==1451)
            {
                
                System.out.println("Logged in successfully!");
                System.out.println("Account number: "+ac);
                System.out.println("Account holder: "+name);
                System.out.println("Balance: 0.0INR");
                
            }
            else
            {
                System.out.println("Invalid PIN! please try again.");
            }
        }
        else if(bank.equals("HDFC"))
        {
            System.out.print("Welcome to your HDFC account!");
            System.out.println("Enter 12 digit account number: ");
            long ac = sc.nextLong();
            System.out.print("Enter PIN to login: ");
            int pin = sc.nextInt();
            if(pin==1244)
            {
                
                System.out.println("Logged in successfully!");
                System.out.println("Account number: "+ac);
                System.out.println("Account holder: "+name);
                System.out.println("Balance: 0.0INR");
                
            }
            else
            {
                System.out.println("Invalid PIN! please try again.");
            }
        }
        else if(bank.equals("ICICI"))
        {
            System.out.print("Welcome to your ICICI account!");
            System.out.println("Enter 14 digit account number: ");
            long ac = sc.nextLong();
            System.out.print("Enter PIN to login: ");
            int pin = sc.nextInt();
            if(pin==1248)
            {
                
                System.out.println("Logged in successfully!");
                System.out.println("Account number: "+ac);
                System.out.println("Account holder: "+name);
                System.out.println("Balance: 0.0INR");
                
            }
            else
            {
                System.out.println("Invalid PIN! please try again.");
            }
        }
        else if(bank.equals("AXIS"))
        {
            System.out.print("Welcome to your AXIS account!");
            System.out.print("Enter 10 digit account number: ");
            long ac = sc.nextLong();
            System.out.print("Enter PIN to login: ");
            int pin = sc.nextInt();
            if(pin==1200)
            {
                
                System.out.println("Logged in successfully!");
                System.out.println("Account number: "+ac);
                System.out.println("Account holder: "+name);
                System.out.println("Balance: 0.0INR");
                
            }
            else
            {
                System.out.println("Invalid PIN! please try again.");
            }
        }
        else
        {
            System.out.println("Bank is couldn't found.");
            System.out.println("please try again.");
        }
    }
}
