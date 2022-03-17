package exercicio1;

public class Main {
    public static void main(String[] args) {

        String str [] = {"1","5","4","8","4","4","8"};
        String vetor [] = new String[str.length];
        int count = 0;
        int index = str.length - 1;


        for (int i = 0; i < str.length; i++) {
            vetor [index] = str [i];
            index--;
        }

        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i]);
        }
        System.out.print(" ");
        for (int i = 0; i < str.length; i++) {
            System.out.print(vetor[i]);
        }
    }
}
