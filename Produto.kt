package exercicio1

class Produto (
    var nomeItem : String = "",
    var precoItem : Double = 0.0,
    var quantidadeItensIguais : Int = 0
    ){
    fun imprimeProduto(){
        println("Nome: $nomeItem")
        println("Preço: R$$precoItem")
        println("Quantidade de itens: $quantidadeItensIguais")
        println("Valor total dos itens: R$${getPrecoTotal()}")
    }

    fun getPrecoTotal() = precoItem * quantidadeItensIguais
}