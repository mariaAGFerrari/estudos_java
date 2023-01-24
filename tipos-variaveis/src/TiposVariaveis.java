public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        // Declaração de variável
        // tipo + nome + valor

        // Variáveis
        double salarioMinimo = 2500;
        salarioMinimo = 2500.33;

        byte idade = 123;
        short ano = 2023;
        int cep = 21070333; // se começar com zero, usar string
        long cpf = 12345678962L; // Precisa colocar o L no final e se começar com zero, usar string
        float pi = 3.14F; // precisa colocar o F no final
        double salario = 1275.33; 

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal; // esse (short) é um casting. Pega um tipo de dado mais abrangente (int) e transforma em um específico. Sem o cast, essa linha vai dar erro pois numeroNormal é um int e int é maior que short que é o tipo do numeroCurto2

        String meuNome = "Mia Ferrari";

        char sexo = 'F'; // tipo char só permite 1 caractere e precisa ter aspas simples. 

        //Constantes
        final double VALOR_DE_PI = 3.14; // final transforma uma variável em constante e o nome da constante precisa estar em caixa alta
        // VALOR_DE_PI = 10.17;


    }
}
