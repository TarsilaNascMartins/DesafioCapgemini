
fun main() {

    /*
    Débora se inscreveu em uma rede social para se manter em contato com seus amigos.
     A página de cadastro exigia o preenchimento dos campos de nome e senha, porém a
     senha precisa ser forte. O site considera uma senha forte quando ela satisfaz os
     seguintes critérios:

     */


    println("*** Cadastro de senha ***" +
            "\n\nSua senha deve seguir os seguintes critério:")

    println("-Possuir no mínimo 6 caracteres.\n" +
            "-Conter no mínimo 1 dígito.\n" +
            "-Conter no mínimo 1 letra em minúsculo.\n" +
            "-Conter no mínimo 1 letra em maiúsculo.\n" +
            "-Conter no mínimo 1 caractere especial. Os caracteres especiais são: !@#\$%^&*()-+\n")


    do {
        println("Digite sua senha para verificar se é forte:")
        val senha = readLine()!!
        var charsenha: CharArray = senha.toCharArray()
        // print(charsenha.contentToString())


        //Possui no mínimo 6 caracteres.
        // println(senha.length)

        if (senha.length >= 6) {
            println("A senha digitada contém no mínimo 6 dígitos")
        } else {
            println("A senha digitada não contém o mínimo de 6 dígitos.")
        }


        // Contém no mínimo 1 dígito.
        val textWithOnlyDigits = senha.filter { it.isDigit() }
        //  println(textWithOnlyDigits)

        if (textWithOnlyDigits.isEmpty()) {
            println("A senha digitada não contém dígito, colocar no mínimo 1 dígito.")
        } else {
            println("O senha digitada contém no mínimo um dígito.")
        }


        // Contém no mínimo 1 letra em minúsculo.
        val resultletra = senha.filter { it.isLowerCase() }
        //println(resultletra)

        if (resultletra.isEmpty()) {
            println("A senha digitada não contém uma letra minúscula.")
        } else {
            println("A senha digitada contém letra minúscula.")
        }


        // Contém no mínimo 1 letra em maiúsculo.
        val maiuscLetra = senha.filter { it.isUpperCase() }
        //println(maiuscLetra)

        if (maiuscLetra.isEmpty()) {
            println("A senha digitada não contém uma letra maiúscula.")
        } else {
            println("A senha digitada contém letra maiúscula.")
        }


        //Contém no mínimo 1 caractere especial. Os caracteres especiais são: !@#$%^&*()-+
        val senhaCaracter = senha.filterNot { it.isLetterOrDigit() }
        // println(senhaCaracter) // abcde

        if (senhaCaracter.isEmpty()) {
            println("Falta um caractere especial na senha digitada.")
        } else {
            println("O caractere especial foi colocado na senha digitada.")

            if ( senha.length >= 6 && !!textWithOnlyDigits.isEmpty() && !!resultletra.isEmpty() && !!maiuscLetra.isEmpty() && !!senhaCaracter.isEmpty()) {

                println("Sua senha foi autorizada!")
                break


            }


        }    }        while ( senha.length < 6 && textWithOnlyDigits.isEmpty() && resultletra.isEmpty() && maiuscLetra.isEmpty() && senhaCaracter.isEmpty())




}


