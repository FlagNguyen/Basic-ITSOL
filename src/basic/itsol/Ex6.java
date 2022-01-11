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
public class Ex6 {

    public static void phantich(int n) {
        int i = 2;
        while (n > 1) {

            if (n % i == 0) {
                System.out.print(i);
                if (n != i) {
                    System.out.print("x");
                }
                n /= i;
            } else {
                i++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        do {
            System.out.print("Enter n: ");
            n = in.nextInt();
            if (n < 2) {
                System.err.println("N must be >1 !!!");
            } else {
                break;
            }
        } while (true);
        
        System.out.printf("%d = ", n);
        phantich(n);
        return;
    }
}
