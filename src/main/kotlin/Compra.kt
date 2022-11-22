class Compra : Concessionaria() {
    fun parcelamento(parcelamento : Boolean, valorVeiculo: Double,  numeroVezes: Int) {
        val valorParcela = valorVeiculo + (valorVeiculo * 0.0117) / numeroVezes
        return if (parcelamento) {
            println("seu financiamento ficou aprovado em ${numeroVezes}x de ${valorParcela}")
        }else {
            println("Algo deu errado no processo, tente novamente")
        }
    }

    fun troca(parcelamento: Boolean, valorVeiculo: Double, numeroVezes: Int, valorTroca: Double){
        val valorRestante = valorTroca - valorVeiculo
        val valorParcela = valorRestante + (valorVeiculo * 0.0117) / numeroVezes
        return if (parcelamento){
            println("em seu financiamento foi abatido o valor de R$ ${valorTroca} em virtude de seu veiculo como entrada," +
                    " o restante ficou aprovado em ${numeroVezes}x de ${valorParcela}")
        } else {
            println("O restante a pagar ficou no total de R$ ${valorRestante} ")
        }
    }

    fun aVista(){

    }
}