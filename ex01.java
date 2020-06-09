/*
Yuri Resende Corrêa - 20157082
 */
package Metodo;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in); 
        
        int x, y;
        
        System.out.print("X: ");
        x = scan.nextInt();
        System.out.print("Y: ");
        y = scan.nextInt();
        proc(x, y);
        
    }
    
    public static void proc(int x, int y) {
        
        System.out.println(x * y);
    }
}
