/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package level2_problem13;

/**
 *
 * @author Shadesh
 */
import java.util.Scanner;
public class Level2_Problem13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        float houryBasic = 7.25f;
        float halfOfBasic = (float) (7.25 / 2);
        
        Scanner sc = new Scanner (System.in);
        
        float hours;
        float totalSales;
        float commission = 0.0f;
        
        System.out.print("Enter number of hours worked: ");
        hours = sc.nextFloat();
        
        System.out.print("Enter Total Sales: ");
        totalSales = sc.nextFloat();
        
        if(totalSales >= 1.0 && totalSales < 100.0) {
            commission = (float) (totalSales * 0.05);
        }
        else if(totalSales >= 100.0 && totalSales < 300.0) {
            commission = (float) (totalSales * 0.10);
        }
        else if(totalSales >= 300.0) {
            commission = (float) (totalSales * 0.15);
        }
        
        float pay = (hours * halfOfBasic) + commission;
        System.out.println(pay);
        
    }
}