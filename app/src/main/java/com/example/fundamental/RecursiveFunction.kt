fun main() {
    fun factorialLoop(value: Int): Int{
        var result = 1
        for (i in value downTo 1){
            result *= i
        }
        return result
    }
    println((factorialLoop(5)))

    fun factorialRecursive(angka: Int): Int{
        return when(angka){
            1->1
            else -> angka*factorialRecursive(angka -1)
        }
    }

    println((factorialRecursive(5)))
}