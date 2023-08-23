public class InsertSort {
    int [] executar(int vetor[]){
        for(int i = 1; i<=vetor.length-1; i++){
            int pivo = vetor[i];
            int j = i - 1;
            while(j>=0 && vetor[j] > pivo){
                vetor[j+1] = vetor[j];
                j--;
            }
            vetor[j+1] = pivo;
        }
        return(vetor);
    }
    
}
