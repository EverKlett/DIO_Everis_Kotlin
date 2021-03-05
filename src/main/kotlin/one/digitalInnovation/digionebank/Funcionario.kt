package one.digitalInnovation.digionebank

abstract class Funcionario(
        nome: String,
        cpf: String,
        var salario: Double
): Pessoa(nome, cpf) {
    protected abstract fun calculoAuxilio(): Double

    override fun toString(): String = """
        Nome   : $nome
        Cpf    : $cpf
        Salário: $salario
        Auxilio: ${calculoAuxilio()}
    """.trimIndent()
}