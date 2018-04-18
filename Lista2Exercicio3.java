/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista2Exercicio3;

import java.util.Scanner;

/**
 *
 * @author Paulo Henrique
 */
public class Lista2Exercicio3 {

    public static void main(String[] args) {

        int n1;
        int n2;
        int n3;
        double media;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a nota 1");
        n1 = sc.nextInt();

        System.out.println("Digite a nota 2");
        n2 = sc.nextInt();

        System.out.println("Digite a nota 3");
        n3 = sc.nextInt();

        if (n1 > n2 && n1 > n3) {
            System.out.println("A nota 1 é maior");
        } else if (n2 > n1 && n2 > n3) {
            System.out.println("A nota 2 é a maior");
        } else {
            System.out.println(" A nota 3 é a maior");
        }

        media = ((n1+n2+n3)/3);
        System.out.println("media " + media);
    }

}
