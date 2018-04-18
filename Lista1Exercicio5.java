/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista1Exercicio5;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Lista1Exercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        
        Scanner input = new Scanner (System.in);
        System.out.println("Digite um numero inteiro: ");
        n = input.nextInt();
        n = (int) Math.pow(n, 2);
        System.out.println("Resultado é : "+n);
    }
    
}
