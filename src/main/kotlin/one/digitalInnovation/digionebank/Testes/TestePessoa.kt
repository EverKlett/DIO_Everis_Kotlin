package one.digitalInnovation.digionebank.testes

import one.digitalInnovation.digionebank.Pessoa

fun main() {
    val everton = Pessoa(cpf = "123.123.123.12",
                         nome = "Everton")

    println(everton.pessoaInfo())
}