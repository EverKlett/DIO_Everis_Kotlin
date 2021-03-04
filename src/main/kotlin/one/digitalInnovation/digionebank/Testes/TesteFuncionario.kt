package one.digitalInnovation.digionebank.testes

import one.digitalInnovation.digionebank.Funcionario
import one.digitalInnovation.digionebank.Pessoa
import java.math.BigDecimal

fun main() {
    val everton = Pessoa(cpf = "123.123.123.12",
            nome = "Everton")

    println(everton.pessoaInfo())

    val joao = Funcionario("João da Silva", "321.321.321.32", BigDecimal.valueOf(5555.5))

    println(joao.pessoaInfo())
    println(joao.salario)
}