import javax.swing.JOptionPane;

class exercicio03 {
	public static void main(String[] args) {
		PilhaLivros livros = new PilhaLivros();	
		int opcao = 0;		
		String titulo;
		int quantidade;
		
		while (opcao != 9) {
			opcao = Integer.parseInt(JOptionPane.showInputDialog("1 - Adicionar Livro. \n2 - Remover Livro.\n3 - Exibir Livros\n9 - Finalizar."));
			
            switch(opcao) {
				case 1: 
					if (livros.Cheio() == false) {
						titulo = JOptionPane.showInputDialog("Digite o título do livro: ");
						quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade: "));
						livros.AdicionaLivroPilha(titulo, quantidade);
					}
					else {
						JOptionPane.showMessageDialog(null, "A Pilha de livros está Cheia");
					}	
				break;
			
				case 2: 
					livros.RemoveLivroPilha();
				break;
			
				case 3: 
					livros.ExibirLivrosPilha();
				break;
			
				case 9:
					JOptionPane.showMessageDialog(null,"Saindo");
				break;
				
				default: 
					JOptionPane.showMessageDialog(null,"Opção Inválida");
			}
		}
	}

    public static class Livro {
        
        private String titulo;
        private int quantidade;
        
        public Livro(String titulo, int quantidade) {
            this.titulo = titulo;
            this.quantidade = quantidade;            
        }

        public String getTitulo() {
            return titulo;
        }

        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }

        public int getQuantidade() {
            return quantidade;
        }

        public void setQuantidade(int quantidade) {
            this.quantidade = quantidade;
        }

    }

    public static class PilhaLivros {
	
        private int tamanho;   
        private Livro[] dados;
        
        public PilhaLivros() {
            dados = new Livro[4];
            tamanho = 0;
        }
        
        public void AdicionaLivroPilha(String titulo, int quantidade) {
                Livro livro = new Livro(titulo, quantidade);
                dados[tamanho] = livro;                     
                tamanho ++;
        }
        
        public void RemoveLivroPilha() {
            if (dados.length >= 1 && tamanho > 0) {
                
                JOptionPane.showMessageDialog(null,"Livro removido do final da Pilha: "  + dados[tamanho-1].getTitulo() ); 
                
                dados[tamanho-1] = null;
                tamanho --;
                
            } else {
                JOptionPane.showMessageDialog(null,"A Pilha de livros está vazia");  
            }
        }
        
        public void ExibirLivrosPilha() {  
            System.out.println(System.lineSeparator().repeat(50));
            
            if ( tamanho != 0) {
                for (int i = 0; i < tamanho; i ++) {
                    System.out.println("Livro:  "+ dados[i].getTitulo() +"| Quantidade: "+ dados[i].getQuantidade());
                } 
            } else {	
                JOptionPane.showMessageDialog(null,"A Pilha de livros está vazia");  
            }
        }
        
        public boolean Cheio() {
            if( tamanho == dados.length){
                return true;
            }
            return false;
        }
    }
}