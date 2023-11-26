public class Gerente  extends Funcionario {

    public Gerente( String nome, String cpf, String cargo) {
        super( nome, cpf, cargo);
    }

    @Override
    public void receberSalario() {
        setSalario(3000.00);
    }
}
