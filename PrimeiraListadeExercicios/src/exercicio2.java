class exercicio2 {
    public static void main(String[] args) {
        int [] vetor = new int[5];
    
        for (int i = 0 ; i < 5 ; i ++) {       
            vetor[i] = (int)(Math.random()*10);                   
        } 
   
    }

    static void Fatorial(int vetor[]) {
        int [] numero = new int[5];

        for (int i = 0 ; i < 5 ; i ++) {  
            int aux= 1;    
            while (vetor[i] > 0) {     
                numero[i] = aux + (vetor[i] * aux);
                vetor[i] = (vetor[i] - 1);              
            }
            System.out.println("O fatorial do "+ vetor[i] +" é: "+numero[i]);
        }
    }
}