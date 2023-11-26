public class Entregador extends Funcionario {

    double gorjetaTotal;

    public Entregador(String nome, String cpf, String cargo) {
        super(nome, cpf, cargo);
    }

    @Override
    public void receberSalario() {
        setSalario(2000.00);
    }

    @Override
    public void realizarTarefa() {
        System.out.println("Realizar entregas");
    }

    @Override
    public double receberGorjeta(double novaGorjeta) {
        return gorjetaTotal += novaGorjeta;
    }
}
