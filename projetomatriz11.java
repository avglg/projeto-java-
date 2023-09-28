/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aplicacao.java;

/**
 *
 * @author ALUNO
 */
public class projetomatriz11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String[][] mat = {{"a", "b", "c", "d", "e"}, 
                            {"f", "g", "h", "i", "j"}, 
                            {"l", "m", "n", "o", "p"}, 
                            {"q", "r", "s", "t", "u"}};
        int[][] mat2 = {{19, 25, 100, 99},
        {10, 7, 25, 14},
        {35, 2, 47, 74}};
        double[][] mat3 = {{1.9, 2.5, 10.0}, {1.0, 7.8, 2.5}, {3.5, 2.2, 4.7}};

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(" " + mat[i][j]);
            }
            System.out.println();
        }
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(" " + mat2[i][j]);
            }
            System.out.println();
        }
        

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + mat3[i][j]);
            }
            System.out.println();

        }
    }

}
