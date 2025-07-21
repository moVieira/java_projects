public class Animais {

    String nome;
    String especie;
    int idade;

    public Animais(String nome, String especie, int idade){
        this.nome = nome;
        this.especie = especie;
        this.idade = idade;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Espécie: " + this.especie);
        System.out.println("Idade: " + this.idade + " anos");
    }

    public void definirIdade(int novaIdade) {
        this.idade = novaIdade;
    }
}
