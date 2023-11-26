public class Garcom extends Funcionario {

    double gorjetaTotal;
    public Garcom( String nome, String cpf, String cargo) {
        super( nome, cpf, cargo);
    }

    @Override
    public void receberSalario() {
        setSalario(2750.00);
    }

    @Override
    public void realizarTarefa(){
        System.out.println("Atender Mesas");
    }

    @Override
    public double receberGorjeta(double novaGorjeta){
        return gorjetaTotal += novaGorjeta;
    }
}
