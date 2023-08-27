
def BubbleSort(vetor):
    for i in range(len(vetor)):
        for j in range(len(vetor)-i-1):
            if vetor[j]>vetor[j+1]:
                aux = vetor[j]
                vetor[j] = vetor[j+1]
                vetor[j+1] = aux
vetor = [9,4,19,3,12,1]
BubbleSort(vetor)
print(vetor)

def BuscaBinaria(vetor, valor, inicio, fim):
    meio = int((inicio+fim)/2)
    posicao = 404
    if inicio>fim:
        posicao = "Valor não encontrado!"
        return posicao
    if valor > vetor[meio]:
        posicao = BuscaBinaria(vetor,valor,meio+1,fim)
    if valor < vetor[meio]:
        posicao = BuscaBinaria(vetor, valor, inicio, meio-1)
    if valor == vetor[meio]:
        posicao = meio
    return posicao
posicao = BuscaBinaria(vetor, 18,0,5)
print(posicao)
