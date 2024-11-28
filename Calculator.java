import java.util.Scanner;
class Calculator
{
    public static void main(String[] args) {
        Scanner logical = new Scanner(System.in);
        System.out.println("Enter an operator: ");
        char ch = logical.next().charAt(0);
        System.out.print("Enter first number: ");
        int a = logical.nextInt();
        System.out.print("Enter second number: ");
        int b = logical.nextInt();

        int c=logical.nextInt();
        switch(ch)
        {
            case '+':c=a+b;break;
            case '-':c=a-b;break;
            case '*':c=a*b;break;
            case '/':c=a/b;break;
            case '%':c=a%b;break;
            default:System.out.print("Invalid operator!");
        }
        System.out.print("Rsult is: "+c);
    }
}
