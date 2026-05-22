# aulajava
Assuntos abordados durante as aulas de Java:
- Fundamentos da linguagem Java;
- Programação Orientada a Objetos (POO);
- Estrutura de dados;
- Collections Freamworks;
- Tratamento de excessões;
- JDBC e banco de dados;
- Swing e JavaFX;
- Threads e concorrência;
- APIs REST com Spring Boot;
- JPA/Hibernate;
- Arquitetura de Software;
- Clean Code e boas praticas;
- Testes unitários com JUnit;
- Padrões de projetos (Design Patterns).

O que é Java:
Java é uma linguagem de programação criada para funcionar em diferentes sistemas operacionais.
A ideia principal do Java é:
"Escreva uam vez e execute em qualquer lugar".
Preparando o ambiente:
Para podermos rodar códigos em Java, são necessárias algumas instalações, como: Oracle Java e Visual Studio Code.
Com o ambiente preparado, os próximos passos são instalar as extensões necessárias e testar se o Java está funcionando.
A extensão é: Extension Pack for Java. Essa extensão instala junto o suporte Java, o debugger e o autocomplete.
Para testar se o Java esta funcionando precismos: Abrir o terminal do windos (teclado windos + R -> digitar CMD na caixa que abrir)
Com o terminal aberto digite:
java --version. Se aparecer o número da versão (20, 21, 25 etc) o Java está funcionando corretamente.
Criando um programa em Java:
Abrir o VSCode, abrir uma pasta (AulaJava, por exemplo), criar um novo arquivo com extensão .java (Main.java, por exemplo).
Ao criar o arquivo, se a extensão estiver instalada corretamente, aparecerá o código:
públic class Main {

}
Na sequência precisamos insserir a parte do código onde o Java de fato funciona:
públic class Main {
    public static void main(String[]args) {
    }
}
Por fim, para finalizar esse programa, precisa colocar o código que faz mostrar uma mensagem na tela:
public class Main {
    public static void main(String[]args) {
  System.out.println("Olá, Mundo!")
    }
}
Para executar esse programa há duas alternativas:
1- Aparecerá um botão Run abaixo da public class Main, basta apertar e o resultado aparece no terminal do VSCode.
2- Abrir o Prompt de Comando do windos (cmd)-> navegar até a pasta ond eo projeto está salvo (cd nome-da-pasta)-> digitar primeiro: javacMain.java (se o projeto tiver outro nome é preciso digitar  eese outro nome) -> pressione Enter -> na próxima linha digite java Main (ou o nome do programa se for difirente)

Variáveis:
Variáveis guardam informações na memória .
Exemplo:
String nome = "Henrique";
int idade = 17;
double altura = 1.78;
boolean aluno = true;

System.out.println(nome);
System.out.println(idade);
System.out.println(altura);
System.out.println(aluno);
