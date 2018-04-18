/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista1Exercicio4;

import java.util.Scanner;

/**
 *
 * @author Paulo Henrique
 */
public class Lista1Exercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a;
        int b;
        int c;
        Scanner input = new Scanner (System.in);
        System.out.println("Digite o valor de A: ");
        a = input.nextInt();
        System.out.println("Digite o valor de B: ");
        b = input.nextInt();
        c = a;
        a = b;
        b = c;
        System.out.println("Valor de A é: "+a);
        System.out.println("Valor de B é: "+b);
        
    }
    
}
