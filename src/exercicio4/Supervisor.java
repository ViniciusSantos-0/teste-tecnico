package exercicio4;

public class Supervisor extends Funcionarios{
    @Override
    public double bonificacao(double salario) {
        return salario+5000.00;
    }
}
