/*
Yuri Resende Corrêa - 20157082
 */
package Metodo;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        int a, b, c, d;
        
        System.out.print("1º nota: ");
        a = scan.nextInt();
        System.out.print("2º nota: ");
        b = scan.nextInt();
        System.out.print("3º nota: ");
        c = scan.nextInt();
        System.out.print("4º nota: ");
        d = scan.nextInt();
        
        boolean res = med(a, b, c ,d);
        System.out.println(res);
    }
    public static boolean med(int a, int b, int c, int d) {
        
        int med;
        
        med = (a + b + c + d)/4;
        return med >= 7;
    }
}
