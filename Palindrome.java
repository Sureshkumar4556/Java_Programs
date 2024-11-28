import java.util.*;
import javax.swing.*;
import java.lang.*;
class Palindrome
{
    public static void main(String[] args) {
        String S1 = JOptionPane.showInputDialog(null,"Enter a string: ");
        int len = S1.length();
        int f=0;
        for(int i=0;i<(len/2);i++)
        {
            if (S1.charAt(i) != S1.charAt(len-i-1))
            {
                JOptionPane.showMessageDialog(null,"Not Palidrome");
                f=1;
                break;
            }
        }
        if(f==0)
        {
            JOptionPane.showMessageDialog(null,"Palindrome");
        }
    }
}
