import javax.swing.JOptionPane;
class exercicio6 {
    
 
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o número para calcularmos o seu fatorial: "));
 
        int FatorialRecursivo = Fatorial(numero);
 
        System.out.println("O fatorial de "+ numero +" é: "+ FatorialRecursivo);
        
    }
    public static int Fatorial(int numero) {
        
        if(numero == 0){
            return 1;
        }
        return numero * Fatorial (numero - 1);
    }
}