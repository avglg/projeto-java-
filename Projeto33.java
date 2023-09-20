/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projeto;

import java.util.Scanner;

/**
 *
 * @author ALUNO PROZ
 */
public class Projeto3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner in = new Scanner(System.in);
        double reajuste;
        double saldo;
        System.out.println("informe seu saldo?:  ");
           saldo = in.nextInt();
        reajuste = saldo + (saldo * 1/100);
        System.out.println("seu saldo com reajuste é:  " + reajuste);

    }
}

            
            
         
       