package one.digitalInnovation.digionebank.testes

import one.digitalInnovation.digionebank.Banco

fun main() {
    val digiOneBank = Banco(nome = "DigiOne", numero = 1)

    println(digiOneBank.info())

    val banco2 = digiOneBank.copy(nome = "DigiTwo")

    println(banco2.info())
}