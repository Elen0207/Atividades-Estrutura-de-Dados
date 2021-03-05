import javax.swing.JOptionPane;
public class exercicio10 {
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o número para calcularmos a série de Fibonacci: "));

        System.out.println("A série de Fibonacci do número "+ numero +" é: ");
        
        for(int i = 0; i < numero; i++) {
            System.out.print(Fibonacci(i) + " ");
        }
    }

    public static int Fibonacci(int numero) {
        
        if(numero < 2){
            return 1;
        }
        return Fibonacci (numero - 1) + Fibonacci (numero - 2);
    }
}