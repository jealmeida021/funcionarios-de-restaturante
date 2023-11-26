
public class Main {
    public static void main(String[] args) {

        Funcionarios funcionario1 = new Gerente("joão", "123456", "gerente");
        Funcionarios funcionario2 = new AtendenteCaixa("Jose", "45678", "AtendenteCaixa");
        Funcionarios funcionario3 = new Entregador("Helio", "66587", "Entregador");
        Funcionarios funcionario4 = new Garcom("Jefferson", "78787889", "Garçom");


        funcionario1.receberSalario();
        System.out.println("Funcionario: " + funcionario1.getNome()  + "\nSalario: " + funcionario1.getSalario() + "\nCpf: " + funcionario1.getCpf()
        + "\nCargo: " + funcionario1.getCargo()+"\n");
        funcionario2.receberSalario();
        System.out.println("Funcionario: " +funcionario2.getNome() +"\nSalario: "
        + funcionario2.getSalario() + "\nCpf:" + funcionario2.getCpf()+"\nCargo:" + funcionario2.getCargo()+"\n");
        funcionario3.receberSalario();
        System.out.println("Funcionario : "+ funcionario3.getNome() + "\nSalario: " + funcionario3.getSalario()
        + "\nCpf:"+ funcionario3.getCpf()+"\nCargo :" + funcionario3.getCargo()+"\n");
        funcionario4.receberSalario();
        System.out.println("Funcionario :" + funcionario4.getNome() + "\nSalario: " + funcionario4.getSalario()
        + "\nCpf:"+ funcionario4.getCpf()+"\n" + "Cargo:"+funcionario4.getCargo()+"\n");

    }
}
