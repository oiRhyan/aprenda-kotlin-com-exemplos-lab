package models

data class Usuario (
    var nome : String,
    var idade : Int,
    var formacao : String? = null
) {
    fun requisitarDadosUsuario() {
        println("Usúario: $nome \nIdade: $idade \nFormação Atual: $formacao")
    }
}