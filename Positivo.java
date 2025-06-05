package ListadeExercíciosVIII;

import java.util.Scanner;

public class Positivo {

    // Função que verifica se o número é positivo
    public static char verificarNumero(int numero) {
        if (numero > 0) {
            return 'P';
        } else {
            return 'N';
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        char resultado = verificarNumero(numero);
        System.out.println("Resultado: " + resultado);

        scanner.close();
    }
}
