/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic.itsol;

import static basic.itsol.Ex1.sum;
import java.util.Scanner;

/**
 *
 * @author asus
 */
public class Ex1b {

    public static double sum(int n) {
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += (double)1/i;
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
