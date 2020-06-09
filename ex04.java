/*
Yuri Resende Corrêa - 20157082
 */
package Metodo;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        int a, b;
        String op;
        
        Scanner scan = new Scanner (System.in);
        Scanner scanstr = new Scanner (System.in);
        
        System.out.print("Digite os números para executar a operação: ");
        a = scan.nextInt();
        b = scan.nextInt();
        System.out.print("Digite a operação [+, -, *, /]: ");
        op = scanstr.nextLine();
        
        proc(a, b, op);
        
    }
    public static void proc(int a, int b, String op) {
        
        if (null == op){
        }else switch (op) {
            case "+":
                System.out.println(a + b);
                break;
            case "-":
                System.out.println(a - b);
                break;
            case "*":
                System.out.println(a * b);
                break;
            case "/":
                System.out.println(a / b);
                break;
            default:
                System.out.println("Comando inválido.");
                break;
        }
    }
}
