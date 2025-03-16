public class Tabuleiro {
    private int[][] grid;

    public Tabuleiro() {
        this.grid = new int[9][9];
        inicializarTabuleiro();
    }

    private void inicializarTabuleiro() {
        // Inicializa o tabuleiro com números ou zeros
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                grid[i][j] = 0; // Exemplo: todos os espaços começam vazios
            }
        }
    }

    public int getValor(int linha, int coluna) {
        return grid[linha][coluna];
    }

    public void setValor(int linha, int coluna, int valor) {
        grid[linha][coluna] = valor;
    }

    public void exibirTabuleiro() {
        for (int[] linha : grid) {
            for (int valor : linha) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }
}
