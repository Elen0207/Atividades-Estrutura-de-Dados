import javax.swing.JOptionPane;

class exercicio01 {
    public static void main(String[] args) throws Exception {
        Fila Vetor =  new Fila();                   
		int entrada, opcao = 0;
        String fila = "";

        while(opcao != 9){
            opcao = Integer.parseInt(JOptionPane.showInputDialog("1 - Adicionar elemento\n\n2 - Remover elemento\n\n9 - Sair")); 
        
            switch(opcao) {
                case 1: 
                    entrada = Integer.parseInt(JOptionPane.showInputDialog("Digite o elemento que deseja adicionar: "));
                    if (entrada >= 0) {
                        Vetor.AdicionaInicio(entrada, fila);
                    } else {
                        JOptionPane.showMessageDialog(null, "Caractere inválido, digite outro ");
                    }
                break;

                case 2: 
                    JOptionPane.showMessageDialog(null, "O primeiro elemento removido foi: " + Vetor.RemoveInicio(fila));
                    ;
                break;
                
                case 9:
                    JOptionPane.showMessageDialog(null, "Saindo");
                break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida, escolha um número da lista");
            }
        }
    }

    public static class Fila {
        private int vetor[];
        private int tamanho;

        public Fila() {
            vetor = new int[3];
            tamanho = 0;
        }

        public void AdicionaInicio(int e, String fila) {
            if (tamanho < vetor.length) {
                vetor[tamanho] = e;
                tamanho++;
            } else {
                JOptionPane.showMessageDialog(null, "Ocorreu um erro, a lista está cheia");
            }

            for (int i = 0; i < tamanho; i++) {
                fila = fila + " - " + vetor[i];
            }
            System.out.println("Fila: "+fila);
        }

        public int RemoveInicio(String fila) {
            int i, r = 0;

            if (tamanho >= 1) {
                r = vetor[0];
                for (i = 1; i < tamanho; i++) {
                    vetor[i - 1] = vetor[i];
                }
                tamanho--;
            } else {
                JOptionPane.showMessageDialog(null, "Ocorreu um erro, a lista já está vazia");
            }
            for (i = 0; i < tamanho; i++) {
                fila = fila + " - " + vetor[i];
            }
            System.out.println("Fila: "+fila);
            
            return r;
        }
    }
}