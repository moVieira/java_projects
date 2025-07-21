public class Produto {
    private String nome;
    private int quantidadeEstoque; //variaveis de instancia

    // Construtor
    public Produto(String nome, int quantidadeEstoque) {
        this.nome = nome;
        setQuantidadeEstoque(quantidadeEstoque); //set permite alterar os valores dos atributos privados 
    }

    // Getter para nome
    public String getNome() { //get permite acessar valores dos atributos privados
        return nome;
    }

    // Getter para quantidade em estoque
    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    // Método para adicionar quantidade ao estoque 
    public void adicionarEstoque(int quantidade) {  //metodo eh o comportamento de um objeto    
        if (quantidade > 0) {
            quantidadeEstoque += quantidade;
        } else {
            System.out.println("Quantidade inválida.");
        }
    }

    // Método privado para definir quantidade inicial
    private void setQuantidadeEstoque(int quantidadeEstoque) {
        if (quantidadeEstoque >= 0) {
            this.quantidadeEstoque = quantidadeEstoque;
        } else {
            this.quantidadeEstoque = 0;
            System.out.println("Quantidade inicial inválida. Estoque definido como 0.");
        }
    }
    
    // Método para remover quantidade do estoque
    public void removerEstoque(int quantidade) {
        if (quantidade > 0 && verificarSaldoSuficiente(quantidade)) {
            quantidadeEstoque -= quantidade;
        } else {
            System.out.println("Sem estoque suficiente.");
        }
    }

    // Método privado para verificar se há saldo suficiente no estoque
    private boolean verificarSaldoSuficiente(int quantidade) {
        return quantidade <= quantidadeEstoque;
    }
}
