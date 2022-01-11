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
public class Ex7 {

    public static boolean checkPrime(int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            } 
        }
        return true;
    }

    public static boolean checkOdd(int n) {
        int num = 0;
        while (n > 0) {
            num = n % 10;
            n = (int) n / 10;
            if (num % 2 == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        int count = 0;
        System.out.println("List: ");
        for (int i=100001 ; i<= 999999; i+=2){
            if (checkOdd(i) == true && checkPrime(i) ==true){
                count++;
                System.out.println(i);
            }
        }
        System.out.println("Total valid number: " + count);
        
    }
}
