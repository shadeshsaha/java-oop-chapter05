/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package level2_problem12;

/**
 *
 * @author Shadesh
 */
import java.util.Scanner;
public class Level2_Problem12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); 
        
        int year ; 
        boolean isLeapYear = false; 
        
        System.out.print("Enter a year: "); 
        year = sc.nextInt(); 
        
        if(year % 4 == 0) { 
            if( year % 100 == 0 && year % 400 == 0) { 
                isLeapYear = true; 
            }
            else if(year % 100 == 0 && year % 400 != 0) { 
                isLeapYear = false; 
            }
            else { 
                isLeapYear = true; 
            } 
        }
        else { 
            isLeapYear = false; 
        } 
        if(isLeapYear) { 
            System.out.println(year + " is a leap year"); 
        }
        else { 
            System.out.println(year + " is not a leap year");
        }
    }    
}
