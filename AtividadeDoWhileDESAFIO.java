/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividadedowhiledesafio;

/**
 *
 * @author Admin
 */

import java.util.Scanner;
public class AtividadeDoWhileDESAFIO {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N, contador = 0;
        
        do {
            System.out.print("Digite um número (para sair digite 0):  ");
            N = scanner.nextInt();
            contador++;
            } while (N != 0);
        System.out.print("Você digitou " + (contador - 1) + " números");
        
        scanner.close();
    }
}
