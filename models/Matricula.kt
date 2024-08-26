package models

import java.util.Random

data class Matricula (
    val status : String,
    val nome : String,
    val formacao : String,
    val nivel : Nivel,
    val quant_horas : String,
    val id : Int
) {
    companion object {
        val ListDeMatriculados : MutableList<Matricula> = mutableListOf()

        fun requisitarMatriculas() {
            ListDeMatriculados.forEach { aluno ->
                println("Aluno: ${aluno.nome} \nFormação: ${aluno.formacao}\nNivel de Formação: ${aluno.nivel}\nCarga Horária : ${aluno.quant_horas} \n Situação: ${aluno.status} \n")
            }
        }
    }
}