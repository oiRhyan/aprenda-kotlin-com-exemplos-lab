package models

data class ConteudoEducacional (
    var nome : String,
    var duracao : Double,
    var categoria : String
) {
    companion object {
        private val formacao_android_developer : ConteudoEducacional =
            ConteudoEducacional("Android Developer", 67.5, "Desenvolvimento Mobile")

        private val formacao_fullstack_developer : ConteudoEducacional =
            ConteudoEducacional("Full Stack Developer", 80.2, "Desenvolvimento Web")

        private val formacao_ia_developer : ConteudoEducacional =
            ConteudoEducacional("IA Developer", 75.9, "Desenvolvimento IA")

        private val formacao_analytics_developer : ConteudoEducacional =
            ConteudoEducacional("Analista de Dados", 60.2, "Requisição e Análise de dados")


        val DIOContent : List<ConteudoEducacional> = listOf(
            formacao_ia_developer, formacao_android_developer,
            formacao_analytics_developer,formacao_fullstack_developer
        )
    }
}