import kotlin.math.PI
import kotlin.math.roundToInt

fun main()
{
    try {
        print("Введите R: ")
        var R = readLine()!!.toDouble()
        print("Введите r: ")
        var r = readLine()!!.toDouble()
        print("Введите h: ")
        var h = readLine()!!.toDouble()

        var l = Math.sqrt((h * h) + ((R - r) * (R - r)))
        var S = PI * (R + r) * l + PI * (R * R) + PI * (r * r)
        var V = PI * ((R * R) + (r * r) + (R * r) * h) / 3
        var roundoff1 = (V * 10000.0).roundToInt() / 10000.0
        var roundoff2 = (S * 10000.0).roundToInt() / 10000.0
        println("Объем конуса: ${roundoff1}")
        println("Площадь поверхности: ${roundoff2}")
    }
    catch (e:Exception)
    {
        println("Ошибка,ввода данных")
    }
}