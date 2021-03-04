package one.digitalInnovation.digionebank

abstract class Pessoa(
        var nome: String,
        var cpf: String
) {
    fun pessoaInfo() = "$nome e $cpf"

    inner class Endereco {
        var rua: String = "Nome de Rua"
    }
}