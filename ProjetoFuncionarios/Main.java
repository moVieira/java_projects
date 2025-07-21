public class Main {
    public static void main(String[] args) {
        
        Pessoa pessoaHorista = new Pessoa("Moises", 18);
        FuncionarioHorista horista = new FuncionarioHorista(pessoaHorista, "Desenvolvedor", 20, 666, 700.0);
        
        
        Pessoa pessoaMensalista = new Pessoa("Guilheme", 18);
        FuncionarioMensalista mensalista = new FuncionarioMensalista(pessoaMensalista, "Analista", 3000.0, 500.0, 202);
        

        System.out.println("Exibindo dados do Funcionario Horista:");
        horista.imprimirdadoshorista();
        
        System.out.println("\n-------------------------------\n");
        
    
        System.out.println("Exibindo dados do Funcionario Mensalista:");
        mensalista.imprimirdadosmensalista();
    }
}
