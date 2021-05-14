package one.digitalInnovation.digionebank

class Gerente(nome: String, cpf: String, salario: Double, val senha: String): Funcionario(nome, cpf, salario), Logavel {
    override fun calculoAuxilio(): Double = (salario * 0.4)
    override fun logar(): Boolean = "senha123" == senha
}