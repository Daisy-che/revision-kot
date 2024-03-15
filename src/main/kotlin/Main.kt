fun main() {
println(add(6,9))
    println(calculatefactorial(5))
    println(isPalindrome("hello"))
    var reversed= reversedString("hello")
    println(reversed)
    println(power(2.0,3))
}


fun add(num1:Int, num2:Int): Int {
    var sum= num1+num2
    return sum
}
fun calculatefactorial(n1:Int): Int {
    var factorial= 1
    return factorial
}
fun isPalindrome(str:String):Boolean{
    var str=str.replace("//s+".toRegex(), "").toLowerCase()
    return str==str.reversed()
}
fun reversedString(word:String):String{

    return word.reversed()
}
fun power(base:Double,exponent:Int):Double{
    require(exponent>=0)
    var result=1.0
    for(i in 0 until exponent){
        result*= base
    }
    return result
}
