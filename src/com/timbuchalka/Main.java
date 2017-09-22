package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
        //For Com Increment Tradicional.
//        for (int i = 2; i < 8;  i++){
//            System.out.println("10,000 at "+ i +"% interest = " + String.format("%.2f",calculateInterest(10000.0, i)));

        //For Com Loop Reverso, criado para verificar as seguintes porcentagens do valor integral que e 10.000
        for (int i = 8; i > 0; i--) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000.0, i)));

        }
        //Printa na tela se o Valor inserido e primo ou nao, utilizando o metodo criado abaixo chamado de "isPrime".
        System.out.println(isPrime(1));
        //Variavel "Count" Criada para manipular o numero de tentativas de localizar numeros primos dentro do for
        int count = 0;
        //Estrutura de repeticao criada para localizar numeros primos em um intervalo de 10 a 50.
        for (int i = 10; i < 50; i++){
            //verifica o metodo isPrime e adiciona 1 a variavel count, e esta setabdi is vakires atraves do I do for no caso de 10 a 50.
            if (isPrime(i)){
                //Cada vez que atende a condicao do if ele acrescenta 1 ao variavel Count
                count++;
                System.out.println("Number " + i + " is a Prime Number");
                //Quando count atingir 30 espacos preenchidos na variavel ira contemplar esta condicao e ira sair do loop.
                if (count == 30){
                    System.out.println("Exiting for loop");
                    //keyword java responsavel por parar ciclos de repeticao ou verificacao.
                    break;
                }
            }
        }

    }
    //---Metodo Criado Para Verificar se um numero e primo ou não.
    public static boolean isPrime(int n) {
        //Verifica se o N for igual a 1 e ja retorna  que nao e um numero primo.
        if (n == 1) {
            return false;

        }
        //Estrutura de repeticao que verifica se o numero definido no N possui resto ou nao..
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        //No caso do Numero setado ser PRIMO retorna true Validando o numero..
        return true;
    }

    //Metodo Criado Para calcular o Montante e a Porcentagem
    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));

    }

}
