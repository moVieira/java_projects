class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) { //construtor
        this.nome = nome;
        this.idade = idade; 
    }

    public String getNome() {
        return nome;
    }
    
    public int getIdade() {
        return idade;
    }

    public void imprimirdados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}