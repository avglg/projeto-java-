import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float resultado;
        String categoria;
        int ladoA;
        int ladoB;
        int ladoC;
        int lados;
        System.out.println("Digite o lado A ");
        ladoA = in.nextInt();
        System.out.println("Digite o  lado B ");
        ladoB = in.nextInt();
        System.out.println("Digite o lado C");
        ladoC = in.nextInt();


        if ((ladoA + ladoB > ladoC) && (ladoB + ladoC > ladoA) && (ladoA + ladoC > ladoA)) {
            System.out.println("triangulo valido");
            if (ladoA == ladoB && ladoB == ladoC && ladoC == ladoA) {
                System.out.println("triangulo equilatero");
            } else if ((ladoA == ladoB && ladoB != ladoC) ||
                    (ladoB == ladoC && ladoC != ladoA) ||
                    (ladoC == ladoA && ladoA != ladoB)) {
                System.out.println("triangulo isoceles ");
            } else if ((ladoA != ladoB && ladoB != ladoC && ladoC != ladoA)) {
                System.out.println("triangulo escaleno ");
            }

        } else {
            System.out.println("triangulo inavlido");
        }


    }
}

