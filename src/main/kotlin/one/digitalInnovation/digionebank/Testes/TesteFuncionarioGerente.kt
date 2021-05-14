package one.digitalInnovation.digionebank.testes

import one.digitalInnovation.digionebank.Gerente

fun main() {
    val everton = Gerente(cpf = "123.123.123.12", nome = "Everton", salario = 5000.0, senha = "senha122")

    ImprimeRelatorio.imprime(everton)

    if everton.logar(everton.senha)
}