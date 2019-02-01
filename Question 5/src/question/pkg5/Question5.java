/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question.pkg5;

/**
 *
 * @author makha
 */

import java.util.Scanner;
public class Question5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.print("Input your first integer");
        int num1 = scan.nextInt();
        System.out.print("Input your second integer");
        int num2 = scan.nextInt();
        
        
        
        System.out.println("Output");
        System.out.printf("The sum of two integers: %d%n", num1 + num2);
        System.out.printf("The difference of two integers: %d%n", num1 - num2);
        System.out.printf("The product of two integers: %d%n", num1 * num2);
        System.out.printf("The average of two integers: %.2f%n",(double) (num1 + num2)/2);
        System.out.printf("The distance of two integers: %d%n", Math.abs (num1 + num2));
        System.out.printf(("The max integer:%d%n"), Math.max(num1, num2));
        System.out.printf(("The min integer:%d%n"), Math.min(num1, num2));
        
    }
    
}
