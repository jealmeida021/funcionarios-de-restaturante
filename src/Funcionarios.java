

public abstract class  Funcionarios {


    // Atributos e variavies

   private double  salario;
   private String nome;
   private String cpf;

   private String cargo;

    public Funcionarios(String nome, String cpf, String cargo) {

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

}