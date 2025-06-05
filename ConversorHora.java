package ListadeExercíciosVIII;

import java.util.Scanner;

public class ConversorHora {

    // Função para converter a hora e definir se é A.M. ou P.M.
    public static int converterHora(int hora24, char[] ampm) {
        if (hora24 == 0) {
            ampm[0] = 'A';
            return 12;
        } else if (hora24 == 12) {
            ampm[0] = 'P';
            return 12;
        } else if (hora24 > 12) {
            ampm[0] = 'P';
            return hora24 - 12;
        } else {
            ampm[0] = 'A';
            return hora24;
        }
    }

    // Função para exibir o horário formatado
    public static void exibirHorario(int hora12, int minuto, char ampm) {
        String periodo = (ampm == 'A') ? "A.M." : "P.M.";
        System.out.printf("Horário no formato 12 horas: %d:%02d %s%n", hora12, minuto, periodo);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char continuar = 0;

        do {
            // Entrada
            System.out.print("Digite a hora (0 a 23): ");
            int hora24 = scanner.nextInt();

            System.out.print("Digite os minutos (0 a 59): ");
            int minuto = scanner.nextInt();

            // Validação simples
            if (hora24 < 0 || hora24 > 23 || minuto < 0 || minuto > 59) {
                System.out.println("Horário inválido. Tente novamente.");
                continue;
            }

            // Conversão
            char[] ampm = new char[1]; // Usamos array para simular passagem por referência
            int hora12 = converterHora(hora24, ampm);

            // Saída
            exibirHorario(hora12, minuto, ampm[0]);

            // Repetição
            System.out.print("Deseja converter outro horário? (s/n): ");
            continuar = scanner.next().toLowerCase().charAt(0);

        } while (continuar == 's');

        System.out.println("Programa encerrado.");
        scanner.close();
    }
}
