public class SelectSort {
    int[] executar(int vetor[]){
        for(int i=0; i<=vetor.length-2; i++){
            int min = i;
            for(int j=i+1; j<=vetor.length-1; j++){
                if(vetor[j]<vetor[min]){
                    min = j;
                }
            }
            int aux = vetor[i];
            vetor[i] = vetor[min];
            vetor[min] = aux;
        }
        return (vetor);
    }
    
}
