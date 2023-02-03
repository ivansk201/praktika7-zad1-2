import kotlin.math.atan
import kotlin.math.roundToInt
import kotlin.math.E

fun main() {
    try {
        print("Введите x: ")
        var x = readLine()!!.toDouble()
        print("Введите y: ")
        var y = readLine()!!.toDouble()
        print("Введите z: ")
        var z = readLine()!!.toDouble()

        var a=(Math.sqrt(Math.abs(x-1))-(Math.pow((Math.abs(y)),(1.0/3.0))))/(1+((Math.pow(x,2.0))/2)+((Math.pow(y,2.0))/4))
        var b=x*Math.abs(atan(z)+Math.pow(E,-(x+3)))

        var roundoff1 = (a * 10000.0).roundToInt() / 10000.0
        var roundoff2 = (b * 10000.0).roundToInt() / 10000.0
        println("a=${roundoff1}")
        println("b=${roundoff2}")

    }catch (e:Exception)
    {
        println("Ошибка,ввода данных")
    }
}