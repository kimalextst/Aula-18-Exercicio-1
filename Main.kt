package exercicio1

import exercicio1.Caixa.PedirQntdUsuario.qntdItensDiferentes

fun main(){
    val objetoCaixa : Caixa = Caixa()

    for (contador in 1..qntdItensDiferentes()){
        println("----------------------------")
        objetoCaixa.cadastrarItemEQuantidade()
        println("----------------------------")
    }

    objetoCaixa.imprimeListaDeCompras()
    objetoCaixa.calcularPrecoTotal()
}