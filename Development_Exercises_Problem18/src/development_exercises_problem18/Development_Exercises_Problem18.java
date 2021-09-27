/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package development_exercises_problem18;

/**
 *
 * @author Shadesh
 */

import java.util.Scanner;
public class Development_Exercises_Problem18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        float costPerBag = 5.50f;
        float totalCost;
        int nob;
        
        String discountString = "";
        
        float discountAmount = 0;
        float totalCharge;
        
        System.out.print("Number of Bags Ordered: ");
        nob = sc.nextInt();
        
        totalCost = nob * costPerBag;
        
        if(nob >= 25 && nob < 50) {
            discountString = "5%";
            discountAmount = (float) (0.05 * totalCost);
        }
        else if(nob >= 50 && nob < 100) {
            discountString = "10%";
            discountAmount = (float) (0.10 * totalCost);
        }
        else if(nob >= 100 && nob < 150) {
            discountString = "15%";
            discountAmount = (float) (0.15 * totalCost);
        }
        else if(nob >= 150 && nob < 200) {
            discountString = "20%";
            discountAmount = (float) (0.20 * totalCost);
        }
        else if(nob >= 200 && nob < 300) {
            discountString = "25%";
            discountAmount = (float) (0.25 * totalCost);
        }
        else if(nob >= 300) {
            discountString = "30%";
            discountAmount = (float) (0.30 * totalCost);
        }
        
        totalCharge = totalCost - discountAmount;
        
        System.out.println("$ " + totalCost);
        System.out.println("Discount: " + discountString + " - $" + discountAmount);
        System.out.println("Your total charge is: $ " + totalCharge);
        
    }
    
}
