package exercicio1

class Caixa {
    private var listaDeCompras : ArrayList <Produto> = ArrayList()

    companion object PedirQntdUsuario {
        fun qntdItensDiferentes(): Int {
            print("Insira a quantidade de itens na sua lista de compras: ")
            return readln().toInt()
        }
    }

    fun cadastrarItemEQuantidade() {
        val objetoProduto : Produto = Produto()

        print("Digite o nome do item: ")
        objetoProduto.nomeItem = readln()

        print("Digite o valor da unidade: R$")
        objetoProduto.precoItem = readln().toDouble()

        print("Digite a quantidade de unidades: ")
        objetoProduto.quantidadeItensIguais = readln().toInt()

        val produto = Produto(
            nomeItem = objetoProduto.nomeItem,
            precoItem = objetoProduto.precoItem,
            quantidadeItensIguais = objetoProduto.quantidadeItensIguais
        )

        inserirItemLista(produto)
    }

    private fun inserirItemLista(itens : Produto){
        listaDeCompras.add(itens)
    }

    fun calcularPrecoTotal() {
        var resultado = 0.0
        listaDeCompras.forEach{ produto ->
            resultado += produto.getPrecoTotal()
        }

        println("O valor total da compra é: R$$resultado")
    }

    fun imprimeListaDeCompras(){
        listaDeCompras.forEach { produto ->
            println("----------------------------")
            produto.imprimeProduto()
            println("----------------------------")
        }
    }
}
