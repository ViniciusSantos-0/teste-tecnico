package exercicio4;

public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        Supervisor supervisor = new Supervisor();
        Vendedor vendedor = new Vendedor();


        System.out.println("----------Bonificação-----------");
        System.out.println("Reajuste para o gerente: "+gerente.bonificacao(1));
        System.out.println("Reajuste para o supervisor: "+supervisor.bonificacao(1));
        System.out.println("Reajuste para o vendedor: "+supervisor.bonificacao(1));;
    }
}
