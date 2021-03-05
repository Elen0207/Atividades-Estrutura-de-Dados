import javax.swing.JOptionPane;
class exercicio11 { 
    public static void main(String[] args) {
        double numero = Double.parseDouble(JOptionPane.showInputDialog("Digite o número para calcularmos uma série: "));
        double soma = 0;
        System.out.println("A série do número "+ numero +" é: "+ Serie(soma, numero));
    }
    
    static double Serie(double soma, double numero) {
        double cont = 1;
        
        while (cont <= numero) {
            soma = soma + (1 / cont);
            cont = cont + 1;
        }
        return soma;    
    }
}