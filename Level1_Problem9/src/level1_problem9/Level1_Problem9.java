/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package level1_problem9;

/**
 *
 * @author Shadesh
 */

import java.util.Scanner;
public class Level1_Problem9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); 
        
        int power;
        String number;
        
        System.out.print("Enter the power of 10^ "); power = sc.nextInt();
        
        if(power == 6) {
            number = "Million";
        }
        else if(power == 9) { 
            number = "Billion";
        }
        else if(power == 12) { 
            number = "Trillion";
        }
        else if(power == 15) { 
            number = "Quadrillion";
        }
        else if(power == 18) { 
            number = "Quintillion";
        }
        else if(power == 21) { 
            number = "Sextillion";
        }
        else if(power == 30) { 
            number = "Nonillion";
        }
        else if(power == 100) { 
            number = "Googol";
        }
        else {
            number = "No appropriate number found with the corresponding power";
        }
        
        if(number.length() < 12) {
            System.out.println("10^" + power + " is: " + number);
        }   
        else {
            System.out.println(number);
        }
    
    }
}
