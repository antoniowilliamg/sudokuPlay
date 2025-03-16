public class Validador {
    public static boolean validarMovimento(Tabuleiro tabuleiro, int linha, int coluna, int valor) {
        // Lógica para verificar regras (exemplo simples).
        return valor > 0 && valor <= 9; // Apenas valores de 1 a 9 são válidos.
    }
}
