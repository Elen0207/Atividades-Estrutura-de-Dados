import javax.swing.JOptionPane;

class exercicio04 {
	public static void main(String[] args) {
		FilaLivros livros = new FilaLivros();	
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
						livros.AdicionaLivroFila(titulo, quantidade);
					}
					else {
						JOptionPane.showMessageDialog(null, "A Fila de livros está Cheia");
					}	
				break;
			
				case 2: 
					livros.RemoveLivroFila();
				break;
			
				case 3: 
					livros.ExibirLivrosFila();
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

    public static class FilaLivros {
        private int tamanho;   
        private Livro[] dados;
        
        public FilaLivros() {
            dados = new Livro[4];
            tamanho = 0;
        }
        
        public void AdicionaLivroFila(String titulo, int quantidade) {
                Livro livro = new Livro(titulo, quantidade);

                if (tamanho < dados.length) {
                    dados[tamanho] = livro;
                    tamanho++;
                } else {
                    JOptionPane.showMessageDialog(null, "Ocorreu um erro, a lista está cheia");
                }
        }
        
        public void RemoveLivroFila() {
            if (dados.length >= 1 && tamanho > 0) { 
                JOptionPane.showMessageDialog(null,"Livro removido do final da Fila: "  + dados[0].getTitulo()); 
                for(int i = 1; i < tamanho; i++) {
                    dados[i - 1] = dados[i];
                }
                tamanho --;
            } else {
                JOptionPane.showMessageDialog(null,"A Fila de livros está vazia");  
            }
        }
        
        public void ExibirLivrosFila() {  
            System.out.println(System.lineSeparator().repeat(50));
    
            if ( tamanho != 0) {
                for (int i = 0; i < tamanho; i ++) {
                    System.out.println("Livro:  "+ dados[i].getTitulo() +"| Quantidade: "+ dados[i].getQuantidade());
                } 
            } else {	
                JOptionPane.showMessageDialog(null,"A Fila de livros está vazia");  
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