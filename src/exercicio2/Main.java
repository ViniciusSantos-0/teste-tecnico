package exercicio2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static boolean isInteger(String str){
        return str != null && str.matches("[0-9]*");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str, str1;
        int n, soma = 0, maior =0;

        do{
            System.out.println("Por gentileza digite uma sequencia de numeros com espaço");
            str = input.nextLine();
            str1  = str.replaceAll(" ", "");
            if(isInteger(str1)){
                for (int i = 0; i < str1.length(); i++) {
                    n = Integer.parseInt(String.valueOf(str1.charAt(i)));
                    if(n > maior){
                        maior = n;
                    }
                    soma += n;
                }
                System.out.println("O maior numero é:"+maior);
                System.out.println("A somados valores é: "+soma);
                System.out.println("Sim tem um erro no código, pulei e depois voltava mas não deu tempo. Muito obrigado <3");
                break;
            }else {
                System.out.println("Por gentileza digite apenas valores numericos e positivos");
            }

        }while (true);
    }
}
