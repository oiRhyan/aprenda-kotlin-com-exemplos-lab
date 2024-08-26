package models

import kotlin.random.Random

class Formacao(conteudos : List<ConteudoEducacional> ) {

    private val conteudosAlocados : List<ConteudoEducacional> = conteudos
    private val copiaListaDeMatriculados : List<Matricula> = Matricula.ListDeMatriculados
    val inscritos = mutableListOf<Usuario>()


    fun obterFormacoesDisponiveis(desejada: String, lista: List<ConteudoEducacional>): Pair<String, String> {
        val formacaoEscolhida = lista.find { it.nome == desejada }

        return if (formacaoEscolhida != null) {
            Pair(formacaoEscolhida.nome, "${formacaoEscolhida.duracao} horas.")
        } else {
            Pair("Formação não Encontrada.", "Hora não disponível.")
        }
    }


    fun matricular(usuario: Usuario, conteudos: List<ConteudoEducacional>, level : Nivel, formacao : String ) : Unit {

        val id_matricula = Random.nextInt(100000)

        val (nome_formacao, horas_formacao) =  obterFormacoesDisponiveis(formacao, conteudos)

        val matricula_novo_aluno : Matricula = Matricula(
            "ATIVO", usuario.nome, nome_formacao,
            level, horas_formacao, id_matricula
        )

        usuario.formacao = nome_formacao
        inscritos.add(usuario)
        Matricula.ListDeMatriculados.add(matricula_novo_aluno)
    }

    fun requisitarInscritos() {
        println("Número de inscritos: ${inscritos.size}")
    }

    fun retornarFormacao(usuario: Usuario) : String {
        val matriculado = Matricula.ListDeMatriculados.find {
            it.nome == usuario.nome
        }
        return matriculado?.formacao ?: "Aluno ou formação não registrada."
    }

}