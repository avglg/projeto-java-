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
public class Projeto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String nome;
        int anoNascimento;
        int anoAtual = 2023;
        String classificacao;
        int idadeCalculada;

        System.out.println("digite qual seu nome:  ");
        nome = in.nextLine();
        System.out.println("digite qual ano nasceu:  ");
        anoNascimento = in.nextInt();
        idadeCalculada = anoAtual - anoNascimento;

        if (idadeCalculada < 18) {
            classificacao = "menor de idade ";
        } else if (idadeCalculada >= 18 && idadeCalculada < 60) {
            classificacao = "adulto";
        } else {
            classificacao = "idoso";
        }

        System.out.println("Seja bem vindo " + nome + ", sua idade é  " + idadeCalculada + "  voce é  " + classificacao);

        System.out.println("digite qual seu nome:  ");
        nome = in.nextLine();
        in.nextLine();
        System.out.println("digite qual ano nasceu:  ");
        anoNascimento = in.nextInt();
        idadeCalculada = anoAtual - anoNascimento;

        if (idadeCalculada < 18) {
            classificacao = "menor de idade ";
        } else if (idadeCalculada >= 18 && idadeCalculada < 60) {
            classificacao = "adulto";
        } else {
            classificacao = "idoso";
        }

        System.out.println("Seja bem vindo " + nome + ", sua idade é  " + idadeCalculada + "  voce é  " + classificacao);
        System.out.println("digite qual seu nome:  ");
        nome = in.nextLine();
        in.nextLine();
        System.out.println("digite qual ano nasceu:  ");
        anoNascimento = in.nextInt();
        idadeCalculada = anoAtual - anoNascimento;

        if (idadeCalculada < 18) {
            classificacao = "menor de idade ";
        } else if (idadeCalculada >= 18 && idadeCalculada < 60) {
            classificacao = "adulto";
        } else {
            classificacao = "idoso";
        }

        System.out.println("Seja bem vindo " + nome + ", sua idade é  " + idadeCalculada + "  voce é  " + classificacao);

    }

}
