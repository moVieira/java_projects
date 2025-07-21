public class Main {
    public static void main(String[] args) {
        // Criando um produto com nome e quantidade inicial
        Produto produto = new Produto("Camiseta", 10);
        
        // Exibindo as informações iniciais
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Estoque inicial: " + produto.getQuantidadeEstoque());

        // Adicionando ao estoque
        produto.adicionarEstoque(5);
        System.out.println("Estoque após adicionar: " + produto.getQuantidadeEstoque());

        // Removendo do estoque
        produto.removerEstoque(3);
        System.out.println("Estoque após remover: " + produto.getQuantidadeEstoque());

        // Tentativa de remover mais do que tem em estoque
        produto.removerEstoque(20);
    }
}
