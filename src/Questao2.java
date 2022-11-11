import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Digite um nome completo com 4 nomes: ");
        String nome = input.nextLine();

        String arrayNome[] = nome.split(" ");
        for (int i = 0; i < arrayNome.length; i++) {

          System.out.print("!" + arrayNome[i] + " ");
        }
    }
}