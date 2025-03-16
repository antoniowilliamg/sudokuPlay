import java.util.Scanner;

public class SudokuPlay {
    public static void main(String[] args) {
        Jogador jogador = new JogadorPlay("Antônio");
        Tabuleiro tabuleiro = new Tabuleiro();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao jogo de Sudoku!");
        jogador.jogar();
        tabuleiro.exibirTabuleiro();

        while (true) {
            System.out.print("Digite a linha (0-8): ");
            int linha = scanner.nextInt();
            System.out.print("Digite a coluna (0-8): ");
            int coluna = scanner.nextInt();
            System.out.print("Digite o número (1-9): ");
            int valor = scanner.nextInt();

            if (Validador.validarMovimento(tabuleiro, linha, coluna, valor)) {
                tabuleiro.setValor(linha, coluna, valor);
                System.out.println("Movimento válido!");
            } else {
                System.out.println("Movimento inválido!");
            }

            tabuleiro.exibirTabuleiro();
        }
    }
}
