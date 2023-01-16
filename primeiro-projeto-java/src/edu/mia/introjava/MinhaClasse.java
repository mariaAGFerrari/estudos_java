package edu.mia.introjava;
public class MinhaClasse {
    public static void main(String[] args) {

        // VARIÁVEIS
        final String BR = "Brasil"; // final é tipo a const em JS
        int ano = 2022;
        ano = 2023;
        double PI = 3.14; // double é tipo float
        boolean bananaEhBom = true;
        // System.out.print("Olá, turma!\n");
        // System.out.print(BR);

        String primeiroNome = "Mia";
        String segundoNome = "Ferrari";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.print(nomeCompleto);

    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return "Resultado do Método: " + primeiroNome.concat(" ").concat(segundoNome);
    }
}

// Para criar uma variável, vamos seguir o padrão => tipoDeDado nomeDado =
// atribuição