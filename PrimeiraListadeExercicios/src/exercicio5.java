import javax.swing.JOptionPane;
class exercicio5 {
    public static void main(String[] args) {
        int [][] matriz = new int[4][4]; 
        
        matriz[0][0] = 1;
        matriz[1][1] = 3;
        matriz[2][2] = 9;
        matriz[3][3] = 27;

        for (int i = 0 ; i < 4; i ++) {
            for (int j = 0; j < 4; j ++) { 
                if (matriz[j][i] == 0) {
                    matriz[j][i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o número a ser incluído na matriz: "));
                }
                if (j < 3) {
                    System.out.print(matriz[j][i]+" ");
                } else {
                    System.out.println(matriz[j][i]+" ");
                }
            }
        }
    }
}