import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float preco;
        String categoria;
        float precodesconto = 0;
        System.out.println("Digite o preço");
        preco = in.nextFloat();
        System.out.println("Digite a Categoria A B C:");
        categoria = in.next();
        if (categoria.equals("A")) {
            precodesconto = (preco * 10 / 100);
        } else if (categoria.equals("B")) {
            precodesconto = (preco * 20 / 100);
        } else if (categoria.equals("C")) {
            precodesconto = (preco * 30 / 100);
        }
        System.out.println("Seu preço com desconto" + (preco- precodesconto));


    }
}
