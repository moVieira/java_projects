import java.awt.Dimension;
import java.awt.Toolkit;

public class ResolucaoDaTela {

    public static void main(String[] args) {
        Toolkit toolkit =   Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize();
            int largura = screenSize.width;
            int altura = screenSize.height;

            System.out.println("A resolução é: " + largura + "x" + altura);
    }
}