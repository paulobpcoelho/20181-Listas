/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista3exercicio3;

/**
 *
 * @author paulo
 */
public class Lista3Exercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i = 1;
        int p = 1;
        int soma = 0;

        do {
            System.out.println(p + "/" + i);
            soma = soma + (p / i);
            i++;
            p = p + 2;
        } while (i <= 50);
        System.out.println("Soma: " + soma);
    }

}
