/* tarefas a serem incluidas
 *acrescentar método realizarTarefa() ao Funcionário
 *acrescentar sobreescrita realizarTarefa() para cada classe
 *acrescentar atributo gorjeta para o Garçom
 *acrescentar metodo receberGorjeta para o Garçom
 */

public abstract class Funcionario {


    // Atributos e variavies

   private double  salario;
   private String nome;
   private String cpf;

   private String cargo;

    public Funcionario(String nome, String cpf, String cargo) {

        this.nome = nome;
        this.cpf = cpf;
        this.cargo = cargo;
    }

    // Métodos getter and setters
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void receberSalario(){

    }

    public void realizarTarefa(){

    }

    public double receberGorjeta(double novaGorjeta){
        return 0;
    }

}
