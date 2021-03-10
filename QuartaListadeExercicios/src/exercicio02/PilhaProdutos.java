package exercicio02;

public class PilhaProdutos {

    private Produtos [] pilhaAdicionada; 	//associações entre classes		
    private Produtos [] pilhaRemovida;   //associações entre classes	
    private int tamanhoAdicionada;
    private int tamanhoRemovida;
    
    public PilhaProdutos () {            
        pilhaAdicionada = new Produtos [3];		//associações entre classes	
        pilhaRemovida = new Produtos [3];    //associações entre classes	
        tamanhoAdicionada = 0; 	
        tamanhoRemovida = 0;			
    }

    public boolean ListaVazia () {
        if ( tamanhoAdicionada == 0 ) {
            return true;
        }
        return false;
    }
}