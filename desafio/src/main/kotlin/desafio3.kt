

fun main() {

    /*
    Duas palavras podem ser consideradas anagramas de si mesmas se as letras
    de uma palavra podem ser realocadas para formar a outra palavra. Dada uma string
    qualquer, desenvolva um algoritmo que encontre o número de pares de substrings que
    são anagramas

    A lista de todos os anagramas pares são: [o, o], [ov, vo] que estão nas posições
     [[0], [2]], [[0, 1], [1, 2]] respectivamente.

     */

    var mapPalavraAnagrama = mutableMapOf<Int, String>()

    println("Digite uma palavra para verificar quantos anagramas pares existem:")
    mapPalavraAnagrama[0] = readLine()!!

    print(mapPalavraAnagrama[0])


//Verificar onde está a array

    mapPalavraAnagrama.forEach {
        println(it)
    }
    val str = "A B C"


    val list = str.split()

    println(list)    // [A, B, C]




}
