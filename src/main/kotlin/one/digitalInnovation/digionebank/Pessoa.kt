package One.digitalInnovation.digionebank

class Pessoa {
    var nome: String = "Everton"

    var cpf: String = "123.123.123-12"
    private set
    /*
    get e set são inferidos na variável e o private na variável faz get e set receberem private, para privar somente uma
    funcionalidade pode ser definido como acima, somente é possível definir uma propriedade de visibilidade diferente da
    variável para o set
    */

    fun pessoaInfo() = "$nome e $cpf"

    inner class Endereco {
        var rua: String = "Nome de Rua"
    }
}

fun main() {
    val everton = Pessoa()

    println(everton.pessoaInfo())
    println(everton.Endereco().rua)
}