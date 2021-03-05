class exercicio8 {
    public static void main(String[] args) {
        int soma = 0;
        System.out.println("A soma de todos os números de 1 a 100 é: " + total(soma));
    }
    
    static int total(int soma) {
        int cont = 1;
        
        while (cont <= 200) {
            soma = soma + cont;
            cont = cont + 1;
        }
        return soma;    
    }
}
