import javax.swing.JOptionPane;

class exercicio2 {
    public static void main(String[]args){
        
		Lista Vetor =  new Lista();                   
		int opcao = 0, posicao;
        char caractere;
		
        while(opcao != 10){
			opcao = Integer.parseInt(JOptionPane.showInputDialog("1- Verificar se a lista está vazia\n2- Verificar se a lista está cheia\n3- Adicionar  caractere  no  início  da  lista\n4- Adicionar  caractere  no  final  da  lista\n5- Adicionar  caractere  em  determinada  posição  da  lista\n6- Remover  caractere  do  início  da  lista\n7- Remover  caractere  do  final  da  lista\n8- Remover   caractere   de   determinada   posição da   lista\n9- Percorrer a lista concatenando os elementos\n10- Sair"));

			switch(opcao){
                case 1:
                    if(Vetor.ListaVazia() == true) {
                        JOptionPane.showMessageDialog(null, "A lista está vazia");
                    } else {
                        JOptionPane.showMessageDialog(null, "A lista não está vazia");
                    }
                break;

                case 2:
                    if (Vetor.ListaCheia() == true) {
                        JOptionPane.showMessageDialog(null, "A lista está cheia");
                    } else {
                        JOptionPane.showMessageDialog(null, "A lista não está cheia");
                    }
                break;

                case 3:
                    caractere = JOptionPane.showInputDialog("Digite um caractere ").charAt(0);
                    if (caractere >= 0) {
                        Vetor.AdicionaInicio(caractere);
                    } else {
                        JOptionPane.showMessageDialog(null, "Caractere inválido, digite outro ");
                    }
                break;

                case 4:
                    caractere = JOptionPane.showInputDialog("Digite um caractere ").charAt(0);
                    if (caractere >= 0) {
                        Vetor.AdicionaFinal(caractere);
                    } else {
                        JOptionPane.showMessageDialog(null, "Caractere inválido, digite outro ");
                    }
                break;

                case 5:
                    caractere = JOptionPane.showInputDialog("Digite um caractere ").charAt(0);
                    posicao = Integer.parseInt(JOptionPane
                            .showInputDialog("Informe a posicao do vetor que você deseja inserir o caractere "));
                    posicao = posicao - 1;

                    if (caractere >= 0) {
                        Vetor.Adicionar(caractere, posicao);
                    }
                break;

                case 6:
                    JOptionPane.showMessageDialog(null, "O caractere removido foi: " + Vetor.RemoveInicio());
                break;

                case 7:
                    JOptionPane.showMessageDialog(null, "O caractere removido foi: " + Vetor.RemoveFinal());
                break;

                case 8:
                    posicao = Integer.parseInt(
                            JOptionPane.showInputDialog("Informe a posição do vetor que você deseja remover o caractere "));
                    posicao = posicao - 1;
                    JOptionPane.showMessageDialog(null, "O caractere removido foi: " + Vetor.Remover(posicao));
                break;

                case 9:
                    JOptionPane.showMessageDialog(null, "Lista: " + Vetor.Concatena());
                break;

                case 10:
                    JOptionPane.showMessageDialog(null, "Saindo");
                break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida, escolha um número da lista");
            }
        }
    }


	public static class Lista {
        private char vetor[];
        private int tamanho;

        public Lista() {
            vetor = new char[3];
            tamanho = 0;
        }
    
        // Verificar se a lista está vazia, retornando true se estiver vazia e false se não estiver;
        public boolean ListaVazia() {
            if (tamanho == 0) {
                return true;
            }
            return false;
        }

        // Verificar se a lista está cheia, retornando true se estiver cheia e false se não estiver;
        public boolean ListaCheia() {
            if (tamanho == vetor.length) {
                return true;
            }
            return false;
        }

        // Adicionar caractere no início da lista, caso a operação não possa ser realizada, mostre mensagem avisando;
        public void AdicionaInicio(char e) {
            if (tamanho < vetor.length) {
                for (int i = tamanho; i > 0; i--) {
                    vetor[i] = vetor[i - 1];
                }
                vetor[0] = e;
                tamanho++;
            } else {
                JOptionPane.showMessageDialog(null, "Ocorreu um erro, a lista está cheia");
            }
        }

        // Adicionar caractere no final da lista, caso a operação não possa ser realizada, mostre mensagem avisando;
        public void AdicionaFinal(char e) {
            if (tamanho < vetor.length) {
                vetor[tamanho] = e;
                tamanho++;
            } else {
                JOptionPane.showMessageDialog(null, "Ocorreu um erro, a lista está cheia");
            }
        }

        // Adicionar caractere em determinada posição da lista, caso a operação não possa ser realizada, mostre mensagem avisando o motivo;
        public void Adicionar(char e, int posicao) {
            int i;

            if ((tamanho < vetor.length) && (posicao < tamanho + 1) && (posicao >= 0)) {
                for (i = tamanho; i != posicao; i--) {
                    if (i != 0) {
                        vetor[i] = vetor[i - 1];
                    }
                }
                vetor[i] = e;
                tamanho++;
            } else {
                JOptionPane.showMessageDialog(null, "Ocorreu um erro, a lista não possui essa posição\n Escolha uma posição entre o 0 e o "+vetor.length);
            }
        }

        // Remover caractere do início da lista, retornando o elemento que foi removido, caso a operação não possa ser realizada, mostre mensagem avisando;
        public char RemoveInicio() {
            int i;
            char r = 0;

            if (tamanho >= 1) {
                r = vetor[tamanho - 1];
                for (i = 0; i < tamanho; i++) {
                    if (i == tamanho - 1)
                        tamanho++;
                }
            } else {
                JOptionPane.showMessageDialog(null, "Ocorreu um erro, a lista já está vazia");
            }


            return r;
        }

        // Remover caractere do final da lista, retornando o elemento que foi removido, caso a operação não possa ser realizada, mostre mensagem avisando;
        public char RemoveFinal() {
            int i;
            char r = 0;

            if (tamanho >= 1) {
                r = vetor[0];
                for (i = 1; i < tamanho; i++) {
                    vetor[i - 1] = vetor[i];
                }
                tamanho--;
            } else {
                JOptionPane.showMessageDialog(null, "Ocorreu um erro, a lista já está vazia");
            }

            return r;
        }

        // Remover caractere de determinada posição da lista, retornando o elemento que foi removido, caso a operação não possa ser realizada, mostre mensagem avisando;
        public char Remover(int posicao) {
            int i;
            char r = 0;

            if ((posicao < tamanho) && (posicao >= 0) && (tamanho >= 1)) {
                r = vetor[posicao];
                for (i = posicao; i < tamanho - 1; i++) {
                    vetor[i] = vetor[i + 1];
                }
                tamanho--;
            } else {
                JOptionPane.showMessageDialog(null, "Ocorreu um erro, a lista não possui essa posição\n Escolha uma posição entre o 0 e o "+vetor.length);
            }

            return r;
        }

        // Percorrer a lista concatenando os elementos em uma String que será devolvida no final.
        public String Concatena() {
            String frase = "";
            for (int i = 0; i < tamanho; i++) {
                frase = frase + " - " + vetor[i];
            }
            return frase;
        }
    }
}