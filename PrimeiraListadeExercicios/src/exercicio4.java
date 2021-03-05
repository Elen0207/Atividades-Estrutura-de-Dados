class exercicio4 {
    public static void main(String[] args) {
        int total = 0;
        int impar = 0;
        int divisiveis8 = 0;
        int divisiveis3 = 0;
        int fatorial = 0; 

        int [][] matriz = new int[4][4]; 
        for (int i = 0 ; i < 4; i ++) {
            matriz[i][i] = (int)(Math.random()*1000);        
        }

        System.out.println("Soma dos valores no intervalo de 1 a 100: " + Soma(total, matriz) +"\nQuantidade de números ímpares entre 30 a 50: "+ Impar(impar, matriz) +"\nQuantidade de números divisíveis por 8: "+ DivisiveisPorOito(divisiveis8, matriz) +"\nQuantidade de números ímpares divisíveis por 3: "+ DivisiveisPorTres(divisiveis3, matriz) +"\nFatorial do maior número informado na matriz: "+ FatorialMaior(fatorial, matriz));
    }
    // Soma dos valores no intervalo de 1 a 100
    static int Soma(int total, int matriz[][]) {
        for(int i = 0 ; i < 4 ; i++) {
            for (int j = 0; j < 4; j++) {    
                if (1 >= matriz[i][j]  && matriz[i][j] <= 100) {
                    total = (total + matriz[i][j]);
                }
            }
        }
        return total;   
    }

    //Quantidade de números ímpares entre 30 a 50
    static int Impar(int impar, int matriz[][]) {
        for(int i = 0 ; i < 4 ; i++) {
            for (int j = 0; j < 4; j++) {
                if (30 >= matriz[i][j]  && matriz[i][j] <= 50 &&  matriz[i][j] % 2 != 0) {
                    impar ++;
                }
            }
        }
        return impar;
    }

    //Quantidade de números divisíveis por 8
    static int DivisiveisPorOito(int divisiveis8, int matriz[][]) {
        for(int i = 0 ; i < 4 ; i++) {
            for (int j = 0; j < 4; j++) {
                if (matriz[i][j] % 8 == 0) {
                    divisiveis8 ++;
                }
            }
        }
        return divisiveis8;
    }

    //Quantidade de números ímpares divisíveis por 3
    static int DivisiveisPorTres(int divisiveis3, int matriz[][]) {
        for(int i = 0 ; i < 4 ; i++) {
            for (int j = 0; j < 4; j++) {
                if (matriz[i][j] % 2 != 0 && matriz[i][j] % 3 == 0) {
                    divisiveis3 ++;
                }
            }
        }
        return divisiveis3;
    }

    //Fatorial do maior número informado na matriz
    static int FatorialMaior(int fatorial, int matriz[][]) {

        for(int i = 0 ; i < 4 ; i++) {
            for (int j = 0; j < 4; j++) {
                if (matriz[i][j] > matriz[j][i]) {
                    fatorial = matriz[i][j]; 
                }
                else {
                    fatorial = matriz[j][i];
                }
            }
        }

        return fatorial * (fatorial - 1);
    }
}
