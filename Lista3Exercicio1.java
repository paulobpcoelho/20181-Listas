/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista3exercicio1;

import java.util.Scanner;

/**
 *
 * @author Paulo Henrique
 */
public class Lista3Exercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);

        float maior = 0;
        float menor = 999999999;
        float n;

        for (int i = 0; i < 15; i++) {
            n = in.nextFloat();
            if (n < menor) {
                menor = n;
            }
            if (n > maior) {
                maior = n;
            }

        }
        System.out.println("Maior: " + maior + " Menor: " + menor);
    }

}
