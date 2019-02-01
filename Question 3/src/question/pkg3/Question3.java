/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question.pkg3;

/**
 *
 * @author makha
 */
import java.util.Scanner;
public class Question3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int num1;
        int num2;
        
        System.out.print("Input your first Int");
        num1 = scan.nextInt();
        
        System.out.print("Input your second Int");
        num2 = scan.nextInt();
        
        if (num1==num2)
            System.out.println("Equal");
        if (num1 != num2)
            System.out.println("Not Equal");
                
    }
    
}
