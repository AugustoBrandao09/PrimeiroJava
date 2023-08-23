public class BubbleSort{
    int [] executar(int vetor[]){
        for(int i = 1; i <= vetor.length - 1; i++){
            for(int j = 0; j <= vetor.length - 1 - i; j++)
                if(vetor[j] > vetor[j+1]){
                    int aux = vetor[j];
                    vetor[j] = vetor[j+1];
                    vetor[j+1] = aux;
                }
            }
        return(vetor);
    }

}