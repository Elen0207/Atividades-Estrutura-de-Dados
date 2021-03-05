import javax.swing.JOptionPane;
class exercicio1 {
    public static void main(String[]args){
		Lista idades = new Lista();                   
		int op=0,idade;
		
		while(op!=99){
			op=Integer.parseInt(JOptionPane.showInputDialog("Cadastro\n1- Rodar sistema\n99-Sair"));

			switch(op){
			case 1:
				idade = Integer.parseInt(JOptionPane.showInputDialog("Idade"));
				if (idade>=0){
					idades.A(idade);
				}
				else{
					JOptionPane.showMessageDialog(null,"Idade inv�lida, digite outra");       
				}
			break;
			case 99:
				JOptionPane.showMessageDialog(null,"Saindo");
				break;
			default:
				JOptionPane.showMessageDialog(null,"Op��o inv�lida");
			}
		}
	}

    public static class Lista {
        private int dados[];
        private int tamanho;
        int pos, valor;

        public Lista() {
            dados = new int[5];
            tamanho = 0;
        }

        public void adicionaFinal(int valor) {
            if (tamanho < dados.length) {
                for (int i = tamanho; i > 0; i--) {
                    dados[i] = dados[i - 1];
                }
                dados[0] = valor;
                tamanho++;
            }
        }

        public void adicionaInicio(int valor) {
            if (tamanho < dados.length) {
                dados[tamanho] = valor;
                tamanho++;
            } 
        }

        public void A (int pos) {
            if (dados.length == tamanho) {
                System.out.println("ERRO!");
            } else 
                if (pos <= 0 || pos > tamanho + 1) {
                System.out.println("Posição Inválida!");
                } else
                    if (pos == 1) {
                        adicionaInicio(valor);
                    } else 
                    if (pos == tamanho) {
                        adicionaFinal(valor);
                    } else { 
                        for(int i=tamanho; i>=pos;i--) {
                            dados[i]=dados[i-1];
                            dados[pos-1]=valor;
                            tamanho++;
                        }
                    }   
        }
        
    }
}