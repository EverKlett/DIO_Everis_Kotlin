package one.digitalInnovation.digionebank

open class Pessoa(
        open val nome: String,
        open val cpf: String
) {
    fun pessoaInfo() = "$nome e $cpf"

    inner class Endereco {
        var rua: String = "Nome de Rua"
    }
}