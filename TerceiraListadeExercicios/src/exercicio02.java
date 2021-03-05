import javax.swing.JOptionPane;

class exercicio02 {
	public static void main(String[] args) {
		Teste teste = new Teste();
		int opcao = 0;
		String aux = "";
		
		while (opcao != 9) {
			opcao = Integer.parseInt(JOptionPane.showInputDialog ("\n1 - Adicionar elemento na Fila \n2 - Adicionar elemento na Pilha \n3 - Remover elemento da Fila\n4 - Remover elemento da Pilha\n"
					+ "5 - Mostrar Fila \n6 - Mostrar Pilha\n9 - Sair"));
					
            switch (opcao) {
            
            case 1:							
                aux = (JOptionPane.showInputDialog("Informe o valor que deseja adicionar na Fila:"));
                JOptionPane.showMessageDialog(null,"O elemento inserido na lista foi: "+ teste.AdicionaFinalFila(aux));
            break;
            
            case 2:							
                aux = (JOptionPane.showInputDialog("Informe o valor que deseja adicionar na Pilha:"));
                JOptionPane.showMessageDialog(null,"O elemento inserido na pilha foi: "+ teste.AdicionaFinalPilha(aux));
            break;
            
            case 3:								
                JOptionPane.showMessageDialog(null,"O elemento removido foi: "+ teste.RemoveInicioFila());
            break;	
                
            case 4:								
                JOptionPane.showMessageDialog(null,"O elemento removido foi: "+ teste.RemoveFinalPilha());
            break;	
                
            case 5:								
                JOptionPane.showMessageDialog(null,"Fila:"+ teste.ConcatenaFila());  
            break;
                
            case 6:								
                JOptionPane.showMessageDialog(null,"Pilha:"+ teste.ConcatenaPilha());  
            break;	
            
            case 9:
                JOptionPane.showMessageDialog(null,"Saindo");  
            break;
                
            default:
                JOptionPane.showMessageDialog(null,"Opção inválida");
            break;
                
            }
		}			
	}

    public static class Teste {
        private String fila[]; 				
        private String pilha[];
        private int tamanho;
        
        public Teste () {            
            fila = new String [5];		
            pilha = new String [5];
            tamanho = 0; 				
        }
        
        public String AdicionaFinalFila(String x) {						
            if (tamanho < fila.length) {
                fila[tamanho] = x ;
                tamanho++;
            }
            else{
                System.out.println("Lista Cheia");   					
                JOptionPane.showMessageDialog(null," A lista está cheia"); 
            }
            System.out.println("O valor digitado é: " +fila[tamanho-1]);
            return x;
            }
        
        
        public String AdicionaFinalPilha(String x) {						
            if (tamanho < pilha.length) {
                pilha[tamanho] = x ;
                tamanho++;
            }
            else{
                System.out.println("Pilha Cheia");   					 
                JOptionPane.showMessageDialog(null,"A Pilha está cheia"); 
            }
            System.out.println("O valor digitado é: " + pilha[tamanho-1]);
            return x;
            }
        
        
        
        public String RemoveInicioFila(){						
            String retornoFilha = "";								
            int i;												
            if (tamanho >= 1){    								
                retornoFilha = fila[0];								
                for (i=1;i<tamanho;i++){        				               
                    fila[i-1]=fila[i];           				
                }
                tamanho --;                           			         
            }
            AdicionaFinalPilha(retornoFilha);
            return retornoFilha;										
        }
        
        public String RemoveFinalPilha(){						
            String retornoPilha = "";								
            int i;												
            if (tamanho >= 1){  									
                retornoPilha=pilha[tamanho-1];						
                for (i=0;i<tamanho;i++){                        
                    if (i==tamanho-1)                           
                        tamanho --;                                  
                }
            }
            AdicionaFinalFila(retornoPilha);
            return retornoPilha;										
        }
        
        public String ConcatenaFila(){             					     
            String aux=" ";										

            for (int i=0;i<tamanho;i++){
                aux=aux+"\n"+fila[i];						
            }
            return aux;
        }
        
        public String ConcatenaPilha(){             					  
            String aux=" ";										

            for (int i=0;i<tamanho;i++){
                aux=aux+"\n"+pilha[i];					
            }
            return aux;
        }
    }
}