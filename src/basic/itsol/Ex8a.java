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
public class Ex8a {

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

    public static void main(String[] args) {
        
        int count = 0;
        System.out.println("List: ");
        for (int i=100001 ; i<= 999999; i+=2){
            if (soThuanNghich(i)){
                count++;
                System.out.println(i);
            }
        }
        System.out.println("Total valid number: " + count);
    }
}
