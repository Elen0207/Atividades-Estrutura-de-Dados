package exercicio02;
import javax.swing.JOptionPane;

public class ListaEncadeada {  
    int RA = 0; 
    String nome = "", turma = "", semestre = "";
    Aluno aluno = new Aluno(RA, nome, turma, semestre);
    private NO inicio;

    public ListaEncadeada() {    
        inicio = null;
    }

    //Adicione um aluno no final da lista.
    public void AdicionaFinal(Aluno aluno) { 	
        
        if (inicio == null) {			
            NO n = new NO(aluno);			
            inicio = n;					
        }  
        else {
            try {
                NO aux = inicio;				
                while (aux.proximo != null) {		
                    aux = aux.proximo;				
                } 
                NO n = new NO(aluno);				
                aux.proximo = n;							
            } catch (Exception e2) {
                System.err.println("Ocorreu um erro");
            }
        }  
    }

    //Adicione um  aluno no início da lista.
    public void AdicionaInicio(Aluno aluno) {			
        NO n = new NO(aluno);						
        n.proximo = inicio;						
        inicio = n;							
    }

    //Adicione um aluno no meio da lista.
    public void AdicionarPosicao(Aluno aluno, int posicao) {
        NO novo = new NO(aluno);		
        
        if ( posicao == 1 ) {
            AdicionaInicio(aluno);
        } 
        else {
            NO aux = inicio;			
            int cont = 1;				
            
            while (aux.proximo != null && cont < posicao--) {  
                aux = aux.proximo;		
                cont ++;
            } 
            
            if ( cont == posicao-- ) {  		
                novo.proximo = aux.proximo;	
                aux.proximo = novo;		
            } 
            else {
                JOptionPane.showConfirmDialog(null, "Posição Inválida!");
            } 
        } 
    } 

    //Remova um aluno no final da lista. 
    public void RemoverFinal() {													
        if (inicio == null ) {
            JOptionPane.showConfirmDialog(null, "A Lista está vazia");
        }
        else {
            if (inicio.proximo == null) {	
                System.out.println(inicio.dado);		
                JOptionPane.showMessageDialog(null, "O aluno removido foi: " +aluno.getNome());				
                inicio = null;					
            } 
            else {
                NO aux1 = inicio;			
                NO aux2 = inicio;
                
                while (aux1.proximo != null) {  
                    aux2 = aux1;			
                    aux1 = aux1.proximo;		
                } 

                System.out.println(aux1.dado);
                JOptionPane.showMessageDialog(null, "O aluno removido foi: " +aluno.getNome());
                aux2.proximo = null;			
            } 
        } 
    }

    //Remova um aluno no início da lista.
    public void RemoverInicio() {			
        
        if (inicio == null) {
            JOptionPane.showConfirmDialog(null, "A Lista está vazia");
        } 
        else {
            System.out.println(inicio.dado);		
            JOptionPane.showMessageDialog(null, "O aluno removido foi: " +aluno.getNome());				
            inicio = inicio.proximo;			
        } 
    } 

    //Remova um aluno no meio da lista. 
    public void RemoverPosicao(int posicao) {
        int i = 1; 
        NO aux = inicio;	
        
        if (inicio == null) {
            JOptionPane.showConfirmDialog(null, "A Lista está vazia");
        } 
        if (posicao == 1) {  
            RemoverInicio();
        }
        else {
            while (aux.proximo != null) {  
                aux = aux.proximo;   
                i++;				
            } 

            if (posicao > i || posicao <=0) {  
                JOptionPane.showConfirmDialog(null, "Posição Inválida!");
            } 
            else if (posicao == i) {			
                RemoverFinal();
            } 
            else {						
                aux = inicio;			
                NO aux2 = aux;			
                
                while(posicao > 1) {
                    aux2 = aux;
                    aux = aux.proximo;
                    posicao --;
                } 
                System.out.println(aux.dado);		
                JOptionPane.showMessageDialog(null, "O aluno removido foi: " +aluno.getNome());	
                aux2.proximo = aux.proximo;
            } 
        }
    } 

    //Apresente cada um dos elementos da lista.
    public void MostrarLista() {
		if (inicio == null) {
			JOptionPane.showMessageDialog(null,"A Lista está vazia");
		} 
		else {
			NO aux1 = inicio;
			JOptionPane.showMessageDialog(null, "A Lista será mostrada no console");
			while (aux1 != null) {
				System.out.println("RA: "+aluno.getRA()+" - Nome: "+aluno.getNome()+" - Turma: "+aluno.getTurma()+" - Semestre: "+aluno.getSemestre());
                aux1 = aux1.proximo;
			}
		}
	}
}