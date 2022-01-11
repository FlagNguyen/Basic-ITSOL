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
public class Ex1 {

    public static int sum(int n) {
        int sum = 0;
        if (n % 2 == 0) {
            for (int i = 2; i <= n; i = i + 2) {
                sum += i;
            }
        } else {
            for (int i = 1; i <= n; i = i + 2) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n elements: ");
        int n = in.nextInt();
        System.out.print("Sum: ");
        System.out.println(sum(n));
    }

}
