/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividadedowhile2;

/**
 *
 * @author Admin
 */
import java.util.Scanner;

public class AtividadeDoWhile2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int senha = 1702;
        int N;
      
       do {
        System.out.print("Insira a senha (4 digitos): ");
        N = scanner.nextInt();
        } while (N != senha);
    }
    }
        
