# Laboratório 01 - Sistema de Biblioteca

Você foi contratado para desenvolver um sistema para uma biblioteca. O sistema deve ser capaz de cadastrar livros, listar os livros disponíveis, emprestar livros, devolver livros e exibir informações sobre os livros cadastrados.

Considere as seguintes classes:

## Classe Livro

### Atributos

titulo (String): o título do livro.

autor (String): o autor do livro.

emprestado (boolean): indica se o livro está emprestado ou não.

### Métodos

Construtor: recebe o título e autor do livro e inicializa os atributos correspondentes. O atributo emprestado deve ser inicializado como false.

emprestar(): marca o livro como emprestado.

devolver(): marca o livro como não emprestado.

exibirInformacoes(): exibe na tela as informações do livro (título, autor e status de empréstimo).

## Classe Biblioteca

### Atributos

livros (array de Livro): um array para armazenar os livros cadastrados na biblioteca.

totalLivros (int): o total de livros cadastrados na biblioteca.

capacidadeMaxima (int): a capacidade máxima da biblioteca.

### Métodos

Construtor: recebe a capacidade máxima da biblioteca e inicializa o array de livros e o total de livros como zero.

cadastrarLivro(titulo, autor): cria um novo objeto da classe Livro com os parâmetros fornecidos e o adiciona ao array de livros. Caso a capacidade máxima tenha sido atingida, exibe uma mensagem de erro.

listarLivros(): exibe na tela os títulos dos livros disponíveis na biblioteca.

emprestarLivro(titulo): busca no array de livros um livro com o título fornecido e marca-o como emprestado. Exibe uma mensagem de sucesso ou erro, caso o livro não seja encontrado ou já esteja emprestado.

devolverLivro(titulo): busca no array de livros um livro com o título fornecido e marca-o como não emprestado. Exibe uma mensagem de sucesso ou erro, caso o livro não seja encontrado ou não esteja emprestado.

exibirInformacoesLivro(titulo): busca no array de livros um livro com o título fornecido e exibe suas informações. Exibe uma mensagem de erro caso o livro não seja encontrado.

Seu objetivo é implementar as classes e os métodos descritos acima, bem como um programa principal para testar o sistema. Nesse programa principal, você deve realizar as seguintes ações:

Criar um objeto da classe Biblioteca, informando a capacidade máxima desejada.

Cadastrar alguns livros na biblioteca.

Listar os livros disponíveis.

Emprestar um livro.

Listar os livros disponíveis novamente.

Devolver o livro emprestado.

Exibir informações de um livro.

Lembre-se de usar os conceitos aprendidos, como modificadores de acesso (public, private, protected), variáveis de instância, construtores, métodos, arrays, etc.
