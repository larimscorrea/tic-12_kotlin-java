package first_questions

//Crie um programa que lê um vetor de Double de 10 elementos
//e pesquisa um número dentro desse vetor. Retorne “Elemento x achado”
//caso pertença ao vetor ou “Elemento x não achado” caso não pertença ao
//vetor.

import kotlin.math.sqrt // Exemplo de importação para a função sqrt

fun main() {
    val vetor = DoubleArray(10) // Cria um vetor de Double com 10 elementos
    println("Digite os 10 elementos do vetor:")
    for (i in 0 until vetor.size) {
        if (vetor[i] == numero) {
            // O número foi encontrado
            break
        }
    }


    print("Digite o número a ser pesquisado: ")
    val numero = readLine()!!.toDouble()

    if (numero in vetor) {
        println("Elemento $numero achado no vetor.")
    } else {
        println("Elemento $numero não achado no vetor.")
    }
}
