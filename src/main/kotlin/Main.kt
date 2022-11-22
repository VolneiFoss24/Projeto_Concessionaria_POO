fun main(){
    val concessionariaVolnei = Concessionaria()
    val clientePedro = concessionariaVolnei.analiseSocioEconomica(600)

    val opcaoDeCompra = return if (clientePedro){
        concessionariaVolnei.parcelamento(20000.0, 48, 1500.0)
    }else {
        println("não e possivel prosseguir com a compra do veiculo")
    }



}