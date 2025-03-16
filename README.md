SudokuPlay
Bem-vindo ao SudokuPlay, um jogo de Sudoku desenvolvido em Java utilizando princípios de encapsulamento, herança e polimorfismo. Este projeto é ideal para aprender e explorar a programação orientada a objetos (OOP) em um cenário prático.

Funcionalidades
Geração de um tabuleiro de Sudoku.

Validação de movimentos seguindo as regras do Sudoku.

Interface interativa via terminal.

Organização modular do código em várias classes.

Tecnologias Utilizadas
Linguagem: Java

Ferramentas: Git, IDE de sua escolha (Eclipse, IntelliJ, VS Code, etc.)

Estrutura do Projeto
plaintext
SudokuPlay/
├── src/
│   ├── Jogador.java          # Classe base abstrata para jogadores.
│   ├── JogadorHumano.java    # Classe concreta estendendo Jogador.
│   ├── Tabuleiro.java        # Classe que gerencia o tabuleiro do jogo.
│   ├── Validador.java        # Valida os movimentos do jogador.
│   └── SudokuGame.java       # Ponto de entrada para o jogo.
├── README.md                 # Arquivo de documentação.
└── .gitignore                # Arquivo para ignorar arquivos/desnecessários no Git.
Como Executar
Clone este repositório:

bash
git clone https://github.com/antoniowilliamg/sudokuPlay.git
Abra o projeto em sua IDE de preferência.

Compile e execute a classe SudokuGame (arquivo principal do projeto).

Regras do Jogo
O objetivo é preencher o tabuleiro 9x9 seguindo estas regras:

Cada linha deve conter os números de 1 a 9, sem repetições.

Cada coluna deve conter os números de 1 a 9, sem repetições.

Cada bloco 3x3 deve conter os números de 1 a 9, sem repetições.

Contribuições
Contribuições são bem-vindas! Siga os passos abaixo para colaborar:

Faça um fork do repositório.

Crie uma branch para sua contribuição:

bash
git checkout -b minha-contribuicao
Faça o commit das alterações:

bash
git commit -m "Descrição da contribuição"
Faça um push para sua branch:

bash
git push origin minha-contribuicao
Abra um Pull Request no repositório original.

Autor
Antônio William

GitHub

Licença
Este projeto está licenciado sob a licença MIT. Consulte o arquivo LICENSE para obter mais informações.
