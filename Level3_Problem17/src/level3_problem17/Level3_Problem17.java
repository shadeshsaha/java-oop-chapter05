/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package level3_problem17;

/**
 *
 * @author Shadesh
 */

import java.util.Scanner;
public class Level3_Problem17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a numaric year: ");
        
        String roman = ""; int year = sc.nextInt(); 
        
        while (year >= 1000) {
            roman += "M"; year -= 1000;
        } 
        while (year >= 900) {
            roman += "CM"; year -= 900;
        } 
        while (year >= 500) {
            roman += "D"; year -= 500;
        } 
        while (year >= 400) {
            roman += "CD"; year -= 400;
        } 
        while (year >= 100) {
            roman += "C"; year -= 100;
        } 
        while (year >= 90) {
            roman += "XC"; year -= 90;
        } 
        while (year >= 50) {
            roman += "L"; year -= 50;
        } 
        while (year >= 40) {
            roman += "XL"; year -= 40;
        } 
        while (year >= 10) {
            roman += "X"; year -= 10;
        }
        while (year >= 9) {
            roman += "IX"; year -= 9;
        } 
        while (year >= 5) {
            roman += "V"; year -= 5;
        } 
        while (year >= 4) {
            roman += "IV"; year -= 4;
        } 
        while (year >= 1) {
            roman += "I"; year -= 1;
        }
        
        System.out.println(roman);
    }
}