import java.lang.String.format
import java.text.SimpleDateFormat
import java.util.*

open class Concessionaria () {
        open fun contrato (cpf : String, nomeComprador: String, nomeVendedor: String, valorVeiculo : Double ){

                val date = Calendar.getInstance().time
                val dateTimeFormat = SimpleDateFormat("EEE, d MMM yyyy", Locale.getDefault())
                val diaDeHoje= dateTimeFormat.format(date)

                val carro = "Marca : Fiat, Modelo : Strada "
            println("O comprador ${nomeComprador}, na presente data ${diaDeHoje}, adquiriu o veiculo ${carro}" +
                    "do vendedor ${nomeVendedor} pelo valor de R$ ${valorVeiculo} ")
        }

        open fun analiseSocioEconomica( score : Int,) : Boolean {
                val analise =  score >= 600
                return analise
        }

        open fun parcelamento(valor: Double, tempoParcelar : Int, renda : Double){
                val parcelamento = valor / tempoParcelar
                val aprovacao = 0.35 * renda >= parcelamento

                return when (aprovacao){
                        true -> println("Seu parcelamento foi aprovado em ${tempoParcelar}x de R$ ${format("%.2f", parcelamento)}")
                        else -> println("Com base em nossa analise, sua renda não e compativel com a solicitação")
                }

        }
}
