public class Entregador extends Funcionarios{
    public Entregador( String nome, String cpf, String cargo) {
        super( nome, cpf, cargo);
    }

    @Override
    public void receberSalario() {
        setSalario(2000.00);
    }
}
