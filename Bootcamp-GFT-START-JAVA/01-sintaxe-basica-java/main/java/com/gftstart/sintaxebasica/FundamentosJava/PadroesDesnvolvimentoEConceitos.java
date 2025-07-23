package com.gftstart.sintaxebasica.FundamentosJava;

import java.util.Scanner;

public class PadroesDesnvolvimentoEConceitos {

  public static void main(String[] args) {

    // Declaração sem inicialização: 'scanner' não pode ser usado ainda, pois referencia null.
    // Scanner scanner;

    // Inicialização do objeto Scanner: 'new Scanner(System.in)' cria uma nova instância
    // para ler dados da entrada padrão (teclado/console). Essencial para evitar NullPointerException.
    Scanner scanner = new Scanner(System.in);

    System.out.println("Olá, informe seu primeiro nome: ");
    String name = scanner.next();
    System.out.println("Olá " + name + ", Informe agora sua idade: ");
    int age = scanner.nextInt(); //nextInt para inteiros

    //Primeira forma de fazer concatenação de strings com o operador '+' :
//    System.out.println("Olá " + name + " sua idade é " + age);

    //Forma printf, utilizando Especificadores: (printf nao quebra linha por isso usa-se muito %n para quebra de linha)
    // - Melhor legibilidade para strings complexas com muitas variáveis ( placeholders como %s, %d).
    // - Oferece controle preciso sobre a formatação de dados (número de casas decimais,
    //   alinhamento, largura do campo, etc. - usando especificadores de formato).
    // - Potencialmente mais eficiente para formatação complexa, pois cria a string final de uma vez.
    System.out.printf("Com base no que me passou, seu nome é %s, %ne sua idade é %d %n%n", name, age );

    // Especificadores comuns:
    // %s: String
    // %d: Inteiro (decimal)
    // %f: Ponto flutuante (decimal)
    // %n: Nova linha (plataforma independente)

    // Exemplo adicional com printf para demonstrar formatação mais complexa:
    double price = 19.9987;
    System.out.printf("O produto %s custa R$ %.2f.%n", "Livro", price);
    // %.2f formata o número de ponto flutuante com duas casas decimais.


    //OUTRA FORMA SERIA UTILIZANDO DECLARAÇÃO DE VARIAVEL
    /*
     * Conclusão e Observações sobre o 'var' (Java 10+)
     *
     * Em Java, você geralmente declara o tipo explícito de uma variável (ex: String nome = "João"; int idade = 25;).
     * Isso reforça a natureza de **tipagem forte e estática** do Java: o tipo de uma variável é
     * definido no momento da compilação e não muda. Essa característica ajuda a pegar muitos erros
     * cedo, aumentando a robustez do código.
     *
     * No entanto, a partir do Java 10, podemos usar a palavra-chave `var` para declarações de variáveis locais
     * com inicialização (ex: var texto = "Olá"; var numero = 10;).
     *
     * POREMS do 'var':
     * 1. 'var' NÃO é tipagem dinâmica: O Java AINDA descobre o tipo da variável no momento da COMPILAÇÃO
     * com base no valor que você atribui. Uma vez definido, o tipo é FIXO e não pode ser alterado.
     * (Ex: se `var x = 10;` (int), `x = "abc";` causará um erro de compilação.)
     * 2. Somente para variáveis LOCAIS COM INICIALIZAÇÃO: Não pode ser usado em campos de classe,
     * parâmetros de metodo ou variáveis que não são inicializadas imediatamente.
     * 3. Legibilidade: Embora reduza a verbosidade, use com sabedoria. Para tipos complexos ou em métodos
     * longos, declarar o tipo explícito pode melhorar a legibilidade para quem lê o código.
     *
     * Em resumo, o 'var' é uma "mão na roda" para reduzir a repetição, mas o Java continua sendo
     * uma linguagem de tipagem forte e estática, garantindo a segurança e previsibilidade que tanto
     * valorizamos no desenvolvimento robusto.
     */
  }

}
