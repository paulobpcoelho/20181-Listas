/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Paulo Henrique
 */
package Lista2Exercicio1;

import java.util.Scanner;


public class Lista2Exercicio1 {

    
    public static void main(String[] args) {
       int a; 
        boolean b, c;
        Scanner input = new Scanner (System.in);
        System.out.println("Digite um número");
        a = input.nextInt();
        
        if (a%2 == 0 && a!=0){
            System.out.println("Este número é Par");
        }else if(a == 0){
            System.out.println("0 é neutro!");
        }else{
            System.out.println("Este número é Ímpar");
        }
        if (a < 0 && a!=0){
            System.out.println("Negativo");
        }else if(a == 0){
            //System.out.println("0 é neutro!");
        }else{    
            System.out.println("Positivo");
        }      
        
    }
    
}