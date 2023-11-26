public class AtendenteCaixa extends Funcionarios{
    public AtendenteCaixa( String nome, String cpf, String cargo) {
        super( nome, cpf, cargo);
    }

    @Override
    public void receberSalario() {
        setSalario(2500.00);
    }
}
