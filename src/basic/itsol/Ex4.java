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
public class Ex4 {

    public static boolean couple_prime(int x, int y) {
        while (x * y != 0) {
            if (x > y) {
                x %= y;
            } else {
                y %= x;
            }
        }
        if (x + y == 1) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b;
        do {
            System.out.print("Enter a: ");
            a = in.nextInt();
            System.out.print("Enter b: ");
            b = in.nextInt();
            if (a > b) {
                System.err.println("a cannot greater than b !!! Re-enter please !");
            } else {
                break;
            }
        } while (true);

        for (int i = a; i<=b; i++){
            for (int u = a+1; u<= b;u++){
                if (couple_prime(i, u)){
                    System.out.print("["+i+"," +u+"]"+"\n");
                }
            }
        }
    }
}
