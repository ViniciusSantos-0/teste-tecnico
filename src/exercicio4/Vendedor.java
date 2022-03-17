package exercicio4;

public class Vendedor extends Funcionarios{
    @Override
    public double bonificacao(double salario) {
        return salario + 3000.00;
    }
}
