/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic.itsol;

/**
 *
 * @author asus
 */
public class Ex10 {

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

    public static boolean check_element_Prime(int n) {
        int num = 0;
        while (n != 0) {
            num = n % 10;
            n /= 10;
            if (!checkPrime(num)) {
                return false;
            }
        }
        return true;
    }

    public static int reverse(int num1) {       
        int reversed = 0;
        int digit = 0;

        while (num1 != 0) {
            digit = num1 % 10;
            reversed = reversed * 10 + digit;
            num1 /= 10;
        }

        return reversed;
    }

    public static void main(String[] args) {
      
        int count = 0;
        System.out.println("List: ");
        for (int i = 1000001; i <= 9999999; i++) {
            if (checkPrime(i) == true && check_element_Prime(i) == true && checkPrime(reverse(i))) {
                count++;
                System.out.println(i);
            }
        }
        System.out.println("Total valid number: " + count);
    }

}
