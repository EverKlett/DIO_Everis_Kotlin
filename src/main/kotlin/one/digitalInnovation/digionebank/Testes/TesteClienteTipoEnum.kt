package one.digitalInnovation.digionebank.testes

import one.digitalInnovation.digionebank.ClienteTipo

fun main() {
    ClienteTipo.values().forEach { elemento -> println("${elemento.descricao} - $elemento") }
    ClienteTipo.values().forEach { it -> println("${it.descricao} - $it")}

    val pf = ClienteTipo.PF
    val pj = ClienteTipo.PJ

    println("$pf - ${pf.descricao}")
    println("$pj - ${pj.descricao}")
}