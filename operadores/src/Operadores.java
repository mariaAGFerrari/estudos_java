public class Operadores {
    public static void main(String[] args) throws Exception {
        // Operador de Atribuição (=)
        int idade = 29;
        char sexo = 'F'; 


        // Operadores Aritméticos
        // adição (+)
        double soma = 10.5 + 15.7;
        String concat = "oi, " + "tudo bem?";

        // subtração (-)
        int subtracao = 113 - 25;
        
        // multiplicação (*)
        int multi = 20*7;

        // divisão (/)
        int div = 15/3;

        // módulo (%)
        int modulo = 18%3;

        // Exemplos com concatenação de numeros com strings
        String concatenacao = "?";

        concatenacao = 1+1+1+"1"; // "31"
        //System.out.print(concatenacao);

        concatenacao = 1+"1"+1+1;
        //System.out.print(concatenacao); // "1111"

        concatenacao = 1+"1"+1+"1";
        //System.out.print(concatenacao); // "1111"

        concatenacao = "1"+1+1+1;
        //System.out.print(concatenacao); // "1111"

        // IPC: sempre que o java ver um caractere, ele para de fazer operações matemáticas e passa a fazer a concatenação

        concatenacao = "1"+(1+1+1);
        //System.out.print(concatenacao); // "13" => usou a precedência e calculou primeiro os parênteses e, ao reconhecer um caractere, fez a concatenação


        // OPERADORES UNÁRIOS
        int numero = 5;
        
        // operador de negação (-)
        //System.out.print(-numero); // -5

        //operador p/ positivar (n * -1)
        //System.out.print(-numero * -1); // 5

        //incremento (++)
        // System.out.print(numero++); // 5 porque primeiro printa o 5 e depois incrementa. Se usarmos o system.out.print novamente, o 6 irá aparecer:
        // System.out.print(numero); // 6

        // se quiser que incremente primeiro, colocar o ++ na frente
        // System.out.print(++numero); // 6

        //decremento (--) => igual o incremento só que subtraindo

        //negação de booleano (!)
        boolean chuva = true;
        // System.out.print(!chuva); // false






    }
}
