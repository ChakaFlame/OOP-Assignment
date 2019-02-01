/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question.pkg4;

/**
 *
 * @author makha
 */
import java.util.Scanner;
public class Question4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Input a temperature in Fahrenheit:");
        double fah = scan.nextDouble();
        double cel = scan.nextDouble();
        System.out.println("Expected Output:");
        System.out.println(fah + "degrees Fahrenheit is equal to" + cel + "in Celsius");
    }
    
}
