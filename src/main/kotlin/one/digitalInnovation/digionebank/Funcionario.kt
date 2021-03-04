package one.digitalInnovation.digionebank

import one.digitalInnovation.digionebank.Pessoa
import java.math.BigDecimal

class Funcionario(
        override val nome: String,
        override val cpf: String,
        var salario: BigDecimal
): Pessoa(nome, cpf) {
}