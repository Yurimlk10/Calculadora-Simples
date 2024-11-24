import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Solicitando os números
        int x = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número:"));
        int y = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número:"));

        // Solicitando o operador
        String operador = JOptionPane.showInputDialog("Digite o operador: [+] | [-]");

        // Inicializando a variável resultado
        int resultado;

        // Calculando
        if (operador.equals("-")) {
            resultado = x - y;
        } else {
            resultado = x + y;
        }

        // Exibindo o resultado
        JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
    }
}