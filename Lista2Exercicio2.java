/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista2Exercicio2;

import java.util.Scanner;

/**
 *
 * @author Paulo Henrique
 */
public class Lista2Exercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int l1;
       int l2;
       int l3;
       
       Scanner input = new Scanner (System.in);
       System.out.println("Digite o primeiro número: ");
       l1 = input.nextInt();
       System.out.println("Digite o segundo número: ");
       l2 = input.nextInt();
       System.out.println("Digite o terceiro número: ");
       l3 = input.nextInt();
       if (l1 + l2 > l3 && l2 + l3 > l1 || l3 + l1 > l2){
           if (l1 == l2 && l2 == l3){
               System.out.println("É um triângulo equilátero");
           }else if(l1 != l2 && l2 != l3){
               System.out.println("É um triangulo escaleno");
           }else {
               System.out.println("É um triangulo isósceles");
           }
       }else {
            System.out.println("Não é um triângulo");
}
        }
      
    }
    