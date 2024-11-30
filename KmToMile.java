/*Kilometer to Miles converter */
import java.lang.*;
import java.util.*;
import java.text.DecimalFormat;
class KmToMile{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Kilometer: ");
        double km = sc.nextDouble();
        DecimalFormat df = new DecimalFormat("#.00");
        double mile = km*1.609;
        System.out.println("Miles: "+df.format(mile));
    }
}