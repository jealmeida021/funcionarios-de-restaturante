public class Garcom extends Funcionarios{
    public Garcom( String nome, String cpf, String cargo) {
        super( nome, cpf, cargo);
    }

    @Override
    public void receberSalario() {
        setSalario(2750.00);
    }
}
