/*
Yuri Resende Corrêa - 20157082
 */
package Metodo;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        int a, b, c, d;
        
        System.out.print("1º número: ");
        a = scan.nextInt();
        System.out.print("2º número: ");
        b = scan.nextInt();
        
        int result = somaTD(a, b);
        System.out.println(result);
    }
    public static int somaTD(int a, int b) {
        
        int x, sum = 0;
        
        for (x = a; x <= b; x++){
            sum += x;
        }
        return sum;
    }
}
