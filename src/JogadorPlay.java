public class JogadorPlay extends Jogador {
    public JogadorPlay(String nome) {
        super(nome);
    }

    @Override
    public void jogar() {
        System.out.println(getNome() + " está jogando o Sudoku.");
    }
}
