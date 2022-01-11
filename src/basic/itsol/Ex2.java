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
public class Ex2 {
    
    
    public static void divisor(int n ){
        int count = 0;
        System.out.print("Divisors of "+n+" : ");
        for (int i =1; i<=n; i++){
            if (n % i ==0){
                count++;
                System.out.print(i + " ");
            }
        }
        System.out.println("");
        System.out.println(n+ " has "+ count + " divisors.");
        
        if (count == 2){
            System.out.println("This number is prime number !!!");
        }
        
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = in.nextInt();
        divisor(n);
    }
}
