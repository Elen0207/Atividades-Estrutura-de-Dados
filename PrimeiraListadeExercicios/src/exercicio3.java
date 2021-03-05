class exercicio3 {
    public static void main(String[] args) {
        int i, j, aux = 0;
        int [] vetor = new int[100];
    
        for (i = 0 ; i < 100 ; i ++) {
          vetor[i] = (int)(Math.random()*1000);        
        }

        for (i = 0; i < 100 ; i++) {
            for (j = 0; j < 100 ; j++) {
                if(vetor[i] < vetor[j]) {
                    aux = vetor[j];                
                    vetor[j] = vetor[i]; 
                    vetor[i] = aux;  

                    aux = 0;     
                }
            }
        }
        for (i = 0; i < 100 ; i++) {
            System.out.println(vetor[i]);
        }
    }
}