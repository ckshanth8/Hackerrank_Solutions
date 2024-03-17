import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Currency {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.
         Locale localIndia = new Locale("en","IN");
    String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
    String india = NumberFormat.getCurrencyInstance(localIndia).format(payment);   
    String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);   
    String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);  
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}