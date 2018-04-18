/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista1Exercicio3;

import java.util.Scanner;

/**
 *
 * @author Paulo Henrique
 */
public class Lista1Exercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double r;
        double a;
        double v;
        Scanner input = new Scanner (System.in);
        System.out.println("Digite o valor do raio");
        r = input.nextFloat();
        System.out.println("Digite o valor da altura");
        a = input.nextFloat();
        r = Math.pow(r, 2);
        v = (3.14 * r * a);
        
        System.out.println("Valor do volume da lata de oleo é: "+v);
    }
    
}
