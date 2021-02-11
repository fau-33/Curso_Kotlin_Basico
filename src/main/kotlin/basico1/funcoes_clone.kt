package basico1

fun exibirMensagem(nome: String, idade: Int){
    //bloco de codigo
    println("Seus dados não foram preenchidos! $nome idade $idade")
}

fun somar(a: Int, b: Int): Int{
    var resultado = a + b
    return resultado
    //println(resultado)

}

fun main(){
    //exibirMensagem("Flávio", idade = 37)
     var total = somar(10, 20)
    println(total)
}