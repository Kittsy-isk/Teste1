
import java.util.Scanner;// biblioteca para utilizar a classe Scanner
public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in); //

        System.out.println("Digite seu nome");

        String nome = leitura.nextLine();

        System.out.println("Digite sua idade");

        int idade = leitura.nextInt();
        System.out.println("Digite sua altura ");

        float altura = leitura.nextFloat();

        System.out.println("Olá "+ nome);
        System.out.println("Você tem "+ idade + " anos e mede " + altura + "metros");




leitura.close();
    }
}