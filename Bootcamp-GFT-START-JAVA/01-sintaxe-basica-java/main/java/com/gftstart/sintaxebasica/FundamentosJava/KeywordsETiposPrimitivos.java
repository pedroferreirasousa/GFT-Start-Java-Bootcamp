package com.gftstart.sintaxebasica.FundamentosJava;

public class KeywordsETiposPrimitivos {

  public static void main(String[] args) {


      // Tipos Numerios inteiros
      byte anosDeEmpresa = 23;
      short numeroDeVoos = 542;
      int id = 56782;
      long pontosAcumulados = 3_423_587_423L; // colocar L no final para ser Long, mostrar que o literal nao e int
      // (OBRIGATORIO) Pode separar
      // os numeros com "_" (underline)

      // Tipos numéricos reais
      float salario = 11_445.44F; // colocar F no final para ser literal do tipo Float, e nao double (Obrigatorio)
      double valorVendasAcumuladas = 2_991_797.98;


      //Tipo booleano
      boolean estaDeFerias = false; // ou true

      //tipo caractere
      char status = 'A'; //obs Char usa-se uma aspas apenas !!!

      //Dias de empresa
      System.out.println(anosDeEmpresa * 365 + " Dias");

      //Numero de viagens
      System.out.println(numeroDeVoos / 2 + " Viagens concluidas.");

      //Pontos por real
      System.out.println(pontosAcumulados / valorVendasAcumuladas + " Pontos por real");

      System.out.println("funcionario do id " + id + ": ganha -> " + salario);

      System.out.println("Férias? " + estaDeFerias );

      System.out.println("Status: " + status);
    }
  }
