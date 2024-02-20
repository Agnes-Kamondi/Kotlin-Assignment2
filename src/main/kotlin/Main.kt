fun main() {
   var greetings = greeting("hello","Agnes")
    println(greetings)

   var division= remainder(68,5)
    println(division)

   var sum= add(10,15,20,25)
    println(sum)

   var sentence= about('I',"am","Phenomenal")
    println(sentence)

}
fun greeting(start:String,name : String):String{
    var greetings = start + name
    return greetings

}
fun remainder(num1:Int,num2:Int):Int{
    var division =num1 % num2
    return division
}
fun add(numA:Int, numB:Int, numC:Int,numD:Int):Int{
    var sum = numA + numB +numC +numD
    return sum
}
fun about(intro:Char,wat:String,end:String): String{
    var intro = 'I'
    var wat = "am"
    var end = "Phenomenal"
    var sentence = intro +"" +wat +""+ end
    return sentence
}
