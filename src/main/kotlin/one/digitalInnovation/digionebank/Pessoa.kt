package one.digitalInnovation.digionebank

class Pessoa {
    var nome: String = "Everton";
    var cpf: String = "123.123.123-12";
}

fun main() {
    val Everton = Pessoa();

    println(Everton.nome);
    println(Everton.cpf);
}