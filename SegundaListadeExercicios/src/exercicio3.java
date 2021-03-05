import javax.swing.JOptionPane;

class exercicio3 {
    public static void main(String[]args){
        
		Lista Vetor =  new Lista();                   
		int opcao = 0, posicao;
        String caractere, e = "";
		
        while(opcao != 10){
			opcao = Integer.parseInt(JOptionPane.showInputDialog("1- Verificar se a lista está vazia\n2- Verificar se a lista está cheia\n3- Adicionar  uma palavra  no  início  da  lista\n4- Adicionar  uma palavra  no  final  da  lista\n5- Adicionar  uma palavra  em  determinada  posição  da  lista\n6- Remover  uma palavra  do  início  da  lista\n7- Remover  uma palavra  do  final  da  lista\n8- Remover   uma palavra   de   determinada   posição da   lista\n9- Percorrer a lista concatenando as palavras\n10- Sair"));

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
                    caractere = JOptionPane.showInputDialog("Digite uma palavra ");
                    if (!caractere.equals("")) {
                        Vetor.AdicionaInicio(caractere);
                    } else {
                        JOptionPane.showMessageDialog(null, "Operação inválida, digite algo");
                    }
                break;

                case 4:
                    caractere = JOptionPane.showInputDialog("Digite uma palavra ");
                    if (!caractere.equals("")) {
                        Vetor.AdicionaFinal(caractere);
                    } else {
                        JOptionPane.showMessageDialog(null, "Operação inválida, digite algo");
                    }
                break;

                case 5:
                    caractere = JOptionPane.showInputDialog("Digite uma palavra ");
                    posicao = Integer.parseInt(JOptionPane
                            .showInputDialog("Informe a posicao do vetor que você deseja inserir uma palavra "));

                    posicao = posicao - 1;

                    if (!caractere.equals("")) {
                        Vetor.Adicionar(caractere, posicao);
                    } else {
                        JOptionPane.showMessageDialog(null, "Operação inválida, digite algo");
                    }
                break;

                case 6:
                    JOptionPane.showMessageDialog(null, "A palavra removido foi: " + Vetor.RemoveInicio());
                break;

                case 7:
                    JOptionPane.showMessageDialog(null, "A palavra removido foi: " + Vetor.RemoveFinal());
                break;

                case 8:
                    posicao = Integer.parseInt(
                            JOptionPane.showInputDialog("Informe a posição do vetor que você deseja remover a palavra"));
                    posicao = posicao - 1;
                    JOptionPane.showMessageDialog(null, "A palavra removida foi: " + Vetor.Remover(posicao));
                break;

                case 9:
                    JOptionPane.showMessageDialog(null, "Lista: \n" + Vetor.Concatena());
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
        private String vetor[];
        private int tamanho;

        public Lista() {
            vetor = new String [3];
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
        public void AdicionaInicio(String e) {
            if (tamanho < vetor.length) {
                for (int i = tamanho; i > 0; i--) {
                    vetor[i] = vetor[i - 1];
                }
                vetor[0] = e;
                tamanho ++;
            } else {
                JOptionPane.showMessageDialog(null, "Ocorreu um erro, a lista está cheia");
            }
        }

        // Adicionar caractere no final da lista, caso a operação não possa ser realizada, mostre mensagem avisando;
        public void AdicionaFinal(String e) {
            if (tamanho < vetor.length) {
                vetor[tamanho] = e;
                tamanho ++;
            } else {
                JOptionPane.showMessageDialog(null, "Ocorreu um erro, a lista está cheia");
            }
        }

        // Adicionar caractere em determinada posição da lista, caso a operação não possa ser realizada, mostre mensagem avisando o motivo;
        public void Adicionar(String e, int posicao) {
            int i;

            if ((tamanho < vetor.length) && (posicao < tamanho + 1) && (posicao >= 0)) {
                for (i = tamanho; i != posicao; i--) {
                    if (i != 0) {
                        vetor[i] = vetor[i - 1];
                    }
                }
                vetor[i] = e;
                tamanho ++;
            } else {
                JOptionPane.showMessageDialog(null, "Ocorreu um erro, a lista não possui essa posição\n Escolha uma posição entre o 0 e o "+vetor.length);
            }
        }

        // Remover caractere do início da lista, retornando o elemento que foi removido, caso a operação não possa ser realizada, mostre mensagem avisando;
        public String RemoveInicio() {
            int i;
            String r = "";

            if (tamanho >= 1) {
                r = vetor[tamanho - 1];
                for (i = 0; i < tamanho; i++) {
                    if (i == tamanho - 1)
                        tamanho ++;
                }
            } else {
                JOptionPane.showMessageDialog(null, "Ocorreu um erro, a lista já está vazia");
            }


            return r;
        }

        // Remover caractere do final da lista, retornando o elemento que foi removido, caso a operação não possa ser realizada, mostre mensagem avisando;
        public String RemoveFinal() {
            int i;
            String r = "";

            if (tamanho >= 1) {
                r = vetor[0];
                for (i = 1; i < tamanho; i++) {
                    vetor[i - 1] = vetor[i];
                }
                tamanho --;
            } else {
                JOptionPane.showMessageDialog(null, "Ocorreu um erro, a lista já está vazia");
            }

            return r;
        }

        // Remover caractere de determinada posição da lista, retornando o elemento que foi removido, caso a operação não possa ser realizada, mostre mensagem avisando;
        public String Remover(int posicao) {
            int i;
            String r = "";

            if ((posicao < tamanho) && (posicao >= 0) && (tamanho >= 1)) {
                r = vetor[posicao];
                for (i = posicao; i < tamanho - 1; i++) {
                    vetor[i] = vetor[i + 1];
                }
                tamanho --;
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