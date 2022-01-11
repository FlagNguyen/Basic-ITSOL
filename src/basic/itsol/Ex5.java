/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic.itsol;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class Ex5 {
    
    public static int sum (int n){
        int sum =0;
        while (n>0){
            sum = sum + n%10;
            n = (int) n/10;
        }
        return sum;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = in.nextInt();
        
        System.out.println("OUTPUT: ");
        System.out.println("Sum of " + n + " : "+ sum(n));
    }
}
