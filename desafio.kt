import models.*

fun main() {

    val lista_de_conteudos : List<ConteudoEducacional> = ConteudoEducacional.DIOContent

    val aluno1 : Usuario = Usuario("Rhyan Araujo", 19, null)
    val aluno2 : Usuario = Usuario("Miguel Silva", 20, null)
    val aluno3 : Usuario = Usuario("Matheus Mortari", 17, null)

    val sistema_de_formacoes = Formacao(lista_de_conteudos)

    sistema_de_formacoes.matricular(aluno1, lista_de_conteudos, level = Nivel.AVANCADO, "Android Developer")
    sistema_de_formacoes.matricular(aluno2, lista_de_conteudos, level = Nivel.INTERMEDIARIO, "Analista de Dados")
    sistema_de_formacoes.matricular(aluno3, lista_de_conteudos, level = Nivel.BASICO, "Full Stack Developer")


    println("----- RESULTADO ------")
    sistema_de_formacoes.requisitarInscritos()
    println("----------------------")
    aluno1.requisitarDadosUsuario()
    println("----------------------")
    aluno2.requisitarDadosUsuario()
    println("----------------------")
    aluno3.requisitarDadosUsuario()
    println("----------------------")
    println("Matriculas Ativas")
    Matricula.requisitarMatriculas()

}
