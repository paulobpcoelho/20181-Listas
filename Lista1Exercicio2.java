/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista1Exercicio2;

import java.util.Scanner;

/**
 *
 * @author Paulo Henrique
 *
 */
public class Lista1Exercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float f, c;
        Scanner input = new Scanner (System.in);
        System.out.println("Temperatura em graus Centigrados");
        c = input.nextInt();
        f =(9 * c + 160) /5;
        
        System.out.println("Valor da Temperatura em Fahrenheit é: "+f);
          
    }
    
}
