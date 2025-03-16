# **SudokuPlay**

Bem-vindo ao **SudokuPlay**, um jogo de Sudoku desenvolvido em **Java** utilizando princípios de **encapsulamento**, **herança** e **polimorfismo**. Este projeto é ideal para aprender e explorar a programação orientada a objetos (**OOP**) em um cenário prático e divertido.

---

## **⚙ Funcionalidades**
- 🧩 **Geração de um tabuleiro de Sudoku**.
- ✅ **Validação de movimentos** seguindo as regras clássicas do Sudoku.
- 🎮 **Interface interativa** via terminal.
- 🛠️ **Organização modular** do código, dividida em classes bem definidas.

---

## **🛠 Tecnologias Utilizadas**
- **Linguagem:** Java  
- **Ferramentas:** Git, IDE de sua escolha (Eclipse, IntelliJ, VS Code, etc.)

---

## **📂 Estrutura do Projeto**
```plaintext
SudokuPlay/
├── src/
│   ├── Jogador.java          # Classe base abstrata para jogadores.
│   ├── JogadorHumano.java    # Classe concreta estendendo Jogador.
│   ├── Tabuleiro.java        # Classe que gerencia o tabuleiro do jogo.
│   ├── Validador.java        # Classe que valida os movimentos do jogador.
│   └── SudokuGame.java       # Ponto de entrada para o jogo.
├── README.md                 # Arquivo de documentação.
└── .gitignore                # Arquivo para ignorar arquivos desnecessários no Git.
