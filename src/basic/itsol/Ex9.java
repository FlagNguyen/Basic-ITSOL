/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic.itsol;

import static basic.itsol.Ex8b.checkSum;
import static basic.itsol.Ex8b.soThuanNghich;

/**
 *
 * @author asus
 */
public class Ex9 {

    public static boolean soThuanNghich(int n) {
        int[] a = new int[20];
        int count = 0;
        do {
            a[count++] = (n % 10);
            n /= 10;
        } while (n > 0);

        for (int i = 0; i < count / 2; i++) {
            if (a[i] != a[count - i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkSum(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }

        if (sum % 10 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int count = 0;
        String regex = "[068]*";
        System.out.println("List: ");
        for (int i = 1000001; i <= 999999999; i++) {
            if (soThuanNghich(i) == true && checkSum(i) == true && Integer.toString(i).matches(regex) == true) {
                count++;
                System.out.println(i);
            }
        }
        System.out.println("Total Valid Number: "+ count);
    }
}
