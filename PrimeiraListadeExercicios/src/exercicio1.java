class exercicio1 {
    public static void main(String[] args) {
        int i;
        double total = 0;
        double aux = 0;
        double saldo = 0;
        double [] valores = new double[100];
    
        for (i = 0 ; i < 100 ; i ++) {
          valores[i] = (double)((Math.random()*1000)-100);         
        }
    
        //Média dos saldos positivos entre 100 à 1000
        for (i = 0; i < 100 ; i++) {
            if(valores[i] > 100 && valores[i] < 1000){
                aux = valores[i] + saldo;                
                saldo = aux;                                 
                aux = 0;     
            }
        }
        total = (saldo / 100);
        System.out.println("Média dos saldos positivos entre 100 à 1000: "+ total);

        total = 0;
        saldo = 0;

        //Soma dos saldos negativos
        for (i = 0; i < 100 ; i++) {
            if(0 > valores[i]){
                aux = valores[i] + saldo;                
                saldo = aux;                                 
                aux = 0;     
            }
        }       
        System.out.println("Soma dos saldos negativos: "+saldo);
        saldo = 0;

        //Média geral dos saldos
        for (i = 0; i < 100 ; i++) {
          aux = valores[i] + saldo;                
          saldo = aux;                                 
          aux = 0;     
        }
        total = (saldo / 100);
        System.out.println("Média geral dos saldos: "+total);
    }
}