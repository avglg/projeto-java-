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
        
        int mes ;
        int dias ;
        int ano;
        int diascalculados;
       
          
            System.out.println("digite quantos anos voce tem em anos, meses e dias?:  ");
           ano = in.nextInt();
            mes = in.nextInt();
            dias = in.nextInt();
             
           diascalculados = ano * 365 + mes * 30 + dias;
                   
            
            System.out.println("Sua idade em dias  " + diascalculados);
        }
    }

            
            
         
       