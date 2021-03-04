package one.digitalInnovation.digionebank

import java.math.BigDecimal

abstract class Funcionario(
        nome: String,
        cpf: String,
        var salario: BigDecimal
): Pessoa(nome, cpf) {
    abstract fun calculoAuxilio(): BigDecimal
}