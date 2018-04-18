/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista2exercicio5;

import java.util.Scanner;

/**
 *
 * @author Paulo Henrique
 */
public class Lista2Exercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int op;
        float n1;
        float n2;
        float n3;
        float r1;
        float r2;
        float r3;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: (1/3)");
        n1 = in.nextFloat();
        System.out.println("Digite o segundo numero: (2/3)");
        n2 = in.nextFloat();
        System.out.println("Digite o terceiro numero: (3/3)");
        n3 = in.nextFloat();

        System.out.println("O que voce deseja fazer?");
        System.out.println("Digita o numero da opção desejada.");
        System.out.println("[1]Calcular media - [2]Calcular soma - [3]Calcular multiplicação");
        op = in.nextInt();

        if (op == 1) {
            r1 = (n1 + n2 + n3) / 3;
            System.out.println("Opção " + op + " Resultado da Media: " + r1);
        } else if (op == 2) {
            r2 = (n1 + n2 + n3);
            System.out.println("Opção " + op + " Resultado da Soma: " + r2);
        } else if (op == 3) {
            r3 = (n1 * n2 * n3);
            System.out.println("Opção " + op + " Resultado da Multiplicação " + r3);
        } else {
            System.out.println("Opção inválida!");
        }

    }

}
