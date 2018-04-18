/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista2Exercicio4;

import java.util.Scanner;

/**
 *
 * @author Paulo Henrique
 */
public class Lista2Exercicio4 {

    public static void main(String[] args) {

        float n1;
        float n2;
        float n3;
        double media;
        float mais;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        n1 = in.nextFloat();

        System.out.println("Digite a segunda nota: ");
        n2 = in.nextFloat();

        System.out.println("Digite a terceira nota: ");
        n3 = in.nextFloat();

        media = (n1 + n2 + n3) / 3;

        if (n1 > n2 && n1 > n3) {
            mais = n1;
            System.out.println("Maior nota: " + mais + " Media: " + media);
        } else if (n2 > n1 && n2 > n3) {
            mais = n2;
            System.out.println("Maior nota: " + mais + " Media: " + media);
        } else if (n3 > n2 && n3 > n1) {
            mais = n3;
            System.out.println("Maior nota: " + mais + " Media: " + media);
        }

    }
}
