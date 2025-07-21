public class FuncionarioMensalista {
    private Pessoa pessoa;
    private String cargo;
    private double salario_base;
    private double bonus;
    private int id;

    public FuncionarioMensalista(Pessoa pessoa, String cargo, double salario_base, double bonus, int id) {
        this.pessoa = pessoa;
        this.cargo = cargo;
        this.salario_base = salario_base;
        this.bonus = bonus;
        this.id = id;
    }

    public double calcularPagamento() {
        return salario_base + bonus;
    }

    public void imprimirdadosmensalista() {
        System.out.println("Dados do Funcionario Mensalista: ");
        pessoa.imprimirdados(); 
        System.out.println("ID do Funcionario: " + id);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salario Base: " + salario_base);
        System.out.println("Bonus: " + bonus);
        System.out.println("Salario: " + calcularPagamento());
    }   
}
