public class AtendenteCaixa extends Funcionario {
    public AtendenteCaixa( String nome, String cpf, String cargo) {
        super( nome, cpf, cargo);
    }

    @Override
    public void receberSalario() {
        setSalario(2500.00);
    }

    @Override
    public void realizarTarefa(){
        System.out.println("Receber pagamentos");
    }

}
