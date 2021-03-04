package one.digitalInnovation.digionebank.testes

import one.digitalInnovation.digionebank.Funcionario
import java.math.BigDecimal

fun main() {
    val everton = Funcionario(cpf = "123.123.123.12", nome = "Everton", salario = BigDecimal.valueOf(5555.5))

    println(everton.pessoaInfo())
}