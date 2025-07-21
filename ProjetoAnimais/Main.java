public class Main {
    public static void main(String[] args) {
        Animais animal1 = new Animais("Sapo-egípcio", "Anfíbio", 5);
        
        animal1.exibirInformacoes();

        animal1.definirIdade(7);

        System.out.println("\nInformações atualizadas:");
        animal1.exibirInformacoes();
    } 
}