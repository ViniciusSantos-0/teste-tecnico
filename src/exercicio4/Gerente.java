package exercicio4;

public class Gerente extends Funcionarios{

    @Override
    public double bonificacao(double salario) {
        return  salario + 10000.00;
    }
}
