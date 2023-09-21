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
public class Projeto4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int qtdspeca1;
        double valorunitario1;
        float ipi;

        int qtdspeca2;
        double valorunitario2;

        float valortotal;

        System.out.println("informe o IPI1,o cod peca 1, valor unitario peca 1, qtd de pecas 1,o cod peca 2, valor unitario peca 2, qtd de pecas 2; ?:  ");
        ipi = in.nextInt();

        valorunitario1 = in.nextInt();
        qtdspeca1 = in.nextInt();
       

        valorunitario2 = in.nextInt();
        qtdspeca2 = in.nextInt();

        valortotal = (float) ((valorunitario1 * qtdspeca1 + valorunitario2 * qtdspeca2) * (ipi / 100 + 1));
        System.out.println("valor toral:  " + valortotal);

    }
}
