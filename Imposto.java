package ListadeExercíciosVIII;

import java.util.Scanner;

public class Imposto {

    // Função que calcula o custo com imposto
    public static double somaImposto(double taxaImposto, double custo) {
        double valorFinal = custo + (custo * (taxaImposto / 100));
        return valorFinal;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada dos dados
        System.out.print("Digite o custo do item: ");
        double custo = scanner.nextDouble();

        System.out.print("Digite a taxa de imposto (%): ");
        double taxaImposto = scanner.nextDouble();

        // Chamando a função e exibindo o resultado
        double valorComImposto = somaImposto(taxaImposto, custo);
        System.out.printf("Valor final com imposto: R$ %.2f%n", valorComImposto);

        scanner.close();
    }
}
