package one.digitalInnovation.digionebank.testes

import one.digitalInnovation.digionebank.Analista

fun main() {
    val everton = Analista(cpf = "123.123.123.12", nome = "Everton", salario = 5000.0)

    ImprimeRelatorio.imprime(everton)
}