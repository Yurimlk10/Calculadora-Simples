import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Solicitando os números
        double x = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número:"));
        double y = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número:"));

        // Solicitando o operador
        String operador = JOptionPane.showInputDialog("Digite o operador: [+] | [-] | [*] | [/]");

        // Calculando
        double resultado = switch (operador) {
            case "-" -> x - y;
            case "*" -> x * y;
            case "/" -> x / y;
            default -> x + y;
        };

        // Exibindo o resultado
        JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
    }
}