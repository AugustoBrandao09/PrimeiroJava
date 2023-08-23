public class Buscabinaria {
    int executar(int vetor[], int valor, int inicio, int fim){
        int meio = (inicio+fim)/2;
        int posicao = 0;
        if (inicio>fim){
            posicao = 404;
            return (posicao);
        }
        if(valor < vetor[meio]){
            posicao = executar(vetor, valor, inicio, meio-1);
        }
        if(valor > vetor[meio]){
            posicao = executar(vetor, valor, meio+1, fim);
        }
        if(valor == vetor[meio]){
            posicao = meio;
        }
		return (posicao);
    }
}
