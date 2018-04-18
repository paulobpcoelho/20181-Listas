/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista1Exercicio1;

import java.util.Scanner;

/**
 *
 * @author Paulo Henrique
 */
class Lista1Exercicio1 {
    
    public static void main (String[] args) {
    
    int n1;
    int n2;
    int soma, diferenca, produto, media;
    Scanner input = new Scanner (System.in);    
    System.out.println ("Digite o primeiro número");
    n1=input.nextInt();
    System.out.println ("Digite o segundo número");
    n2=input.nextInt();
    soma = n1+n2;
    diferenca = n1-n2;
    produto = n1*n2;
    media = soma/2;
    System.out.println("Soma é = "+soma);
    System.out.println("Diferença é = "+diferenca);
    System.out.println("Produto é = "+produto);
    System.out.println("Media é = "+media);
    
}
}