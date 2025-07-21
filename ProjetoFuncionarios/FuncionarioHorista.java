public class FuncionarioHorista {
    private Pessoa pessoa;
    private String cargo;
    private double horas_trabalhadas;
    private double taxa_por_hora;
    private int id;


    public FuncionarioHorista(Pessoa pessoa, String cargo, double horas_trabalhadas, int id, double taxa_por_hora) {
        this.pessoa = pessoa;
        this.cargo = cargo;
        this.horas_trabalhadas = horas_trabalhadas;
        this.id = id;
        this.taxa_por_hora = taxa_por_hora;
    }

    
    public double calcularPagamento() {
        return horas_trabalhadas * taxa_por_hora;
    }

    public void imprimirdadoshorista() {
        System.out.println("Dados do Funcionario Horista: ");
        pessoa.imprimirdados(); 
        System.out.println("ID do Funcionario: " + id);
        System.out.println("Cargo: " + cargo);
        System.out.println("Horas Trabalhadas: " + horas_trabalhadas);
        System.out.println("Taxa por Hora: " + taxa_por_hora);
        System.out.println("Salario Total: " + calcularPagamento());
    }
}
