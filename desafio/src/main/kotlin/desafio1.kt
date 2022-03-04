fun main() {

    /*
    Escreva um algoritmo que mostre na tela uma escada de tamanho n utilizando o
     caractere * e espaços. A base e altura da escada devem ser iguais ao valor de n.
     A última linha não deve conter nenhum espaço.
     */

    println("Digite um número para fazer uma escada:")
    val degrau = readLine()!!.toInt()

    for(i in 1..degrau){

        //espaço

        repeat (degrau-i){
            print(" ")}

        // degrau
        repeat(i){
            print("*")}

        print("\n")
    }


}